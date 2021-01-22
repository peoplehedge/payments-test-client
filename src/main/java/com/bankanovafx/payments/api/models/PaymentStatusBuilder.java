/*
 * PaymentsAPI
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.bankanovafx.payments.api.models;

import java.util.*;

public class PaymentStatusBuilder {
    //the instance to build
    private PaymentStatus paymentStatus;

    /**
     * Default constructor to initialize the instance
     */
    public PaymentStatusBuilder() {
        paymentStatus = new PaymentStatus();
    }

    /**
     * Set to true once the payment has been approved
     */
    public PaymentStatusBuilder approved(Boolean approved) {
        paymentStatus.setApproved(approved);
        return this;
    }

    /**
     * Set to true once the payment has been sent
     */
    public PaymentStatusBuilder sent(Boolean sent) {
        paymentStatus.setSent(sent);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public PaymentStatus build() {
        return paymentStatus;
    }
}