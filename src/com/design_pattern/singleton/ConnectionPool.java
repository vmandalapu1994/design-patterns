package com.design_pattern.singleton;

// Lazy initialization
// Double checked locking
// volatile keyword takes care of instruction reordering issue/ partially constructed object issue.
public class ConnectionPool {

    private static volatile ConnectionPool pool;


    public static ConnectionPool getInstance() {
        if(pool == null) {
            synchronized (ConnectionPool.class) {
                if(pool == null) {
                    pool = new ConnectionPool();
                }
            }
        }
        return pool;
    }


}
