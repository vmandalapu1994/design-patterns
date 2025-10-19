package com.design_pattern.chainofresponsibility.implementation1;

public interface ReimbursementHandler {

    void handleReimbursement(ReimbursementRequest reimbursementRequest);

    void nextHandler(ReimbursementHandler reimbursementHandler);

}
