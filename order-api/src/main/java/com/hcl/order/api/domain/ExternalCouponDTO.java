package com.hcl.order.api.domain;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;

/**
 * Generated by codegen
 */
public class ExternalCouponDTO implements Serializable {
    private String rewardId;

    private Long offerId;

    private String discountAmount;

    public String getRewardId() {
        return rewardId;
    }

    public void setRewardId(String rewardId) {
        	this.rewardId = rewardId;
    }

    public Long getOfferId() {
        return offerId;
    }

    public void setOfferId(Long offerId) {
        	this.offerId = offerId;
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        	this.discountAmount = discountAmount;
    }
}
