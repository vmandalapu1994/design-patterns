package com.design_pattern.singleton;

import java.util.ArrayList;
import java.util.List;

//Eager initialisation
// Enum based implementation which takes care of serialisation safety/reflection safety.
public enum ConnectionPoolEnum {
    INSTANCE;

    private List<String> connections;

    private List<String> usedConnections;

    private ConnectionPoolEnum() {
        connections = new ArrayList<>();
        usedConnections = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            connections.add("connection1");
            connections.add("connection2");
            connections.add("connection3");
            connections.add("connection4");
            connections.add("connection5");
        }
    }

    public synchronized String getConnection() {
        if (connections.isEmpty()) {
            throw new RuntimeException("No connections available");
        }
        String connection = connections.removeLast();
        usedConnections.add(connection);
        System.out.println("Fetched connection:" + connection);
        return connection;
    }

    public synchronized void releaseConnection(String connection) {
        if (connection != null && usedConnections.remove(connection)) {
            connections.add(connection);
            System.out.println("Released connection:" + connection);
        }
    }

    public static void main(String[] args) {

        ConnectionPoolEnum pool = ConnectionPoolEnum.INSTANCE;
        String connection = pool.getConnection();
        pool.releaseConnection(connection);

    }


}
