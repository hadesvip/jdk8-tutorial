package com.drools.domain;

import java.io.Serializable;

/**
 * Created by wy33082 on 16-8-19.
 */
public class PaymentInfo implements Serializable {

    private static final long serialVersionUID = 5586518491050780838L;

    /**
     * 消费金额
     */
    private int moneyAmount;

    /**
     * 决策通道
     */
    private String decisionPath;

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public String getDecisionPath() {
        return decisionPath;
    }

    public void setDecisionPath(String decisionPath) {
        this.decisionPath = decisionPath;
    }
}
