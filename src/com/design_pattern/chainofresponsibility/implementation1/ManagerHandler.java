package com.design_pattern.chainofresponsibility.implementation1;

public class ManagerHandler implements ReimbursementHandler {

    private ReimbursementHandler nextHandler;


    @Override
    public void handleReimbursement(ReimbursementRequest reimbursementRequest) {

        if (reimbursementRequest.getAmt() < 5000) {
            System.out.println("Manager approved the reimbursement request for " + reimbursementRequest.getAmt());
        } else if (nextHandler != null) {
            nextHandler.handleReimbursement(reimbursementRequest);
        } else {
            System.out.println("No one can handle the request.");
        }

    }

    @Override
    public void nextHandler(ReimbursementHandler reimbursementHandler) {
        this.nextHandler = reimbursementHandler;
    }
}
