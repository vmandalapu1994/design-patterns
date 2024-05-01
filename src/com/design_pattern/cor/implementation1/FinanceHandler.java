package com.design_pattern.cor.implementation1;

public class FinanceHandler implements ReimbursementHandler {

    private ReimbursementHandler nextHandler;

    @Override
    public void handleReimbursement(ReimbursementRequest reimbursementRequest) {

        if (reimbursementRequest.getAmt() < 10000) {
            System.out.println("Finance approved the reimbursement amount " + reimbursementRequest.getAmt());
        } else if (nextHandler != null) {
            nextHandler.handleReimbursement(reimbursementRequest);
        } else {
            System.out.println("No one can handle the request");
        }

    }

    @Override
    public void nextHandler(ReimbursementHandler reimbursementHandler) {
        this.nextHandler = reimbursementHandler;
    }

}
