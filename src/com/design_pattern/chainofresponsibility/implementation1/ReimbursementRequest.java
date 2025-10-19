package com.design_pattern.chainofresponsibility.implementation1;

public class ReimbursementRequest {

    private long amt;

    public ReimbursementRequest(long amount) {
        this.amt = amount;
    }

    public long getAmt() {
        return amt;
    }

}
