package com.hcl.canceltrx.domain;

import java.util.ArrayList;
import java.lang.String;
import java.lang.Long;
import java.util.List;
import java.io.Serializable;
import java.lang.Boolean;
/**
 * Generated by codegen
 */
public class ExternalOrderDtoDTO implements Serializable {
	public List<com.hcl.canceltrx.domain.ExternalOrderPaymentDetailDTO> getExternalOrderPaymentDetailDTOs() {
		return externalOrderPaymentDetailDTOs;
	}

	private List<com.hcl.canceltrx.domain.ExternalOrderPaymentDetailDTO> externalOrderPaymentDetailDTOs = new ArrayList<com.hcl.canceltrx.domain.ExternalOrderPaymentDetailDTO>();

	public void setExternalOrderPaymentDetailDTOs(List<com.hcl.canceltrx.domain.ExternalOrderPaymentDetailDTO> externalOrderPaymentDetailDTOs) {
		this.externalOrderPaymentDetailDTOs = externalOrderPaymentDetailDTOs;
	}

	public List<com.hcl.canceltrx.domain.ExternalOrderDetailDTO> getExternalOrderDetailDTOs() {
		return externalOrderDetailDTOs;
	}

	private List<com.hcl.canceltrx.domain.ExternalOrderDetailDTO> externalOrderDetailDTOs = new ArrayList<com.hcl.canceltrx.domain.ExternalOrderDetailDTO>();

	public void setExternalOrderDetailDTOs(List<com.hcl.canceltrx.domain.ExternalOrderDetailDTO> externalOrderDetailDTOs) {
		this.externalOrderDetailDTOs = externalOrderDetailDTOs;
	}

	public List<com.hcl.canceltrx.domain.ExternalCouponDTO> getExternalCouponDTOs() {
		return externalCouponDTOs;
	}

	private List<com.hcl.canceltrx.domain.ExternalCouponDTO> externalCouponDTOs = new ArrayList<com.hcl.canceltrx.domain.ExternalCouponDTO>();

	public void setExternalCouponDTOs(List<com.hcl.canceltrx.domain.ExternalCouponDTO> externalCouponDTOs) {
		this.externalCouponDTOs = externalCouponDTOs;
	}

	private String channelOrderId;

	private Long amount;

	private Long totalBeveragesTax;

	private String orderId;

	private String pickupEta;

	private Long fee;

	private String channel;

	private Boolean facilitatorOrder;

	private Long totalFoodTax;

	private Long storeId;

	private String updatedTimestamp;

	private String createTimestamp;

	private String paymentType;

	private String restaurantOrderNumber;

	private String orderAPIUsername;

	private String dropOffEta;

	private String orderDestination;

	private Long tip;

	private String currency;

	private Boolean altTaxApplicable;

	public String getChannelOrderId() {
		return channelOrderId;
	}

	public void setChannelOrderId(String channelOrderId) {
		this.channelOrderId = channelOrderId;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Long getTotalBeveragesTax() {
		return totalBeveragesTax;
	}

	public void setTotalBeveragesTax(Long totalBeveragesTax) {
		this.totalBeveragesTax = totalBeveragesTax;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPickupEta() {
		return pickupEta;
	}

	public void setPickupEta(String pickupEta) {
		this.pickupEta = pickupEta;
	}

	public Long getFee() {
		return fee;
	}

	public void setFee(Long fee) {
		this.fee = fee;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Boolean getFacilitatorOrder() {
		return facilitatorOrder;
	}

	public void setFacilitatorOrder(Boolean facilitatorOrder) {
		this.facilitatorOrder = facilitatorOrder;
	}

	public Long getTotalFoodTax() {
		return totalFoodTax;
	}

	public void setTotalFoodTax(Long totalFoodTax) {
		this.totalFoodTax = totalFoodTax;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getUpdatedTimestamp() {
		return updatedTimestamp;
	}

	public void setUpdatedTimestamp(String updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

	public String getCreateTimestamp() {
		return createTimestamp;
	}

	public void setCreateTimestamp(String createTimestamp) {
		this.createTimestamp = createTimestamp;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getRestaurantOrderNumber() {
		return restaurantOrderNumber;
	}

	public void setRestaurantOrderNumber(String restaurantOrderNumber) {
		this.restaurantOrderNumber = restaurantOrderNumber;
	}

	public String getOrderAPIUsername() {
		return orderAPIUsername;
	}

	public void setOrderAPIUsername(String orderAPIUsername) {
		this.orderAPIUsername = orderAPIUsername;
	}

	public String getDropOffEta() {
		return dropOffEta;
	}

	public void setDropOffEta(String dropOffEta) {
		this.dropOffEta = dropOffEta;
	}

	public String getOrderDestination() {
		return orderDestination;
	}

	public void setOrderDestination(String orderDestination) {
		this.orderDestination = orderDestination;
	}

	public Long getTip() {
		return tip;
	}

	public void setTip(Long tip) {
		this.tip = tip;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Boolean getAltTaxApplicable() {
		return altTaxApplicable;
	}

	public void setAltTaxApplicable(Boolean altTaxApplicable) {
		this.altTaxApplicable = altTaxApplicable;
	}
}