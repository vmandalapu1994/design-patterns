package com.design_pattern.cor.implementation1;

public class Demo {

    public static void main(String[] args) {
        ReimbursementRequest reimbursementRequest = new ReimbursementRequest(11000);

        ManagerHandler managerHandler = new ManagerHandler();
        FinanceHandler financeHandler = new FinanceHandler();
        managerHandler.nextHandler(financeHandler);

        managerHandler.handleReimbursement(reimbursementRequest);

        ReimbursementRequest reimbursementRequest2 = new ReimbursementRequest(9000);
        managerHandler.handleReimbursement(reimbursementRequest2);
    }

}
