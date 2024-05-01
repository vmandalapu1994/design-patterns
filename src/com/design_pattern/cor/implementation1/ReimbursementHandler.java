package com.design_pattern.cor.implementation1;

public interface ReimbursementHandler {

    void handleReimbursement(ReimbursementRequest reimbursementRequest);

    void nextHandler(ReimbursementHandler reimbursementHandler);

}
