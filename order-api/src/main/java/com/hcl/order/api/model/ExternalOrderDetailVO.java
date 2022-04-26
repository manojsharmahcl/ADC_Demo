package com.hcl.order.api.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;

/**
 * Generated by codegen
 */
public class ExternalOrderDetailVO implements Serializable {
    private String modifiersList;

    private Long quantity;

    private String specialtyStandardId;

    private String wholeToppingStandardIds;

    private String itemCode;

    private String description;

    private String halfTwoToppingStdIds;

    private String halfTwoSpecialtyStdId;

    private String instructionCodes;

    private String halfOneSpecialtyStdId;

    private Long price;

    private String halfOneToppingStdIds;

    private String sauceCode;

    public String getModifiersList() {
        return modifiersList;
    }

    public void setModifiersList(String modifiersList) {
        	this.modifiersList = modifiersList;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        	this.quantity = quantity;
    }

    public String getSpecialtyStandardId() {
        return specialtyStandardId;
    }

    public void setSpecialtyStandardId(String specialtyStandardId) {
        	this.specialtyStandardId = specialtyStandardId;
    }

    public String getWholeToppingStandardIds() {
        return wholeToppingStandardIds;
    }

    public void setWholeToppingStandardIds(String wholeToppingStandardIds) {
        	this.wholeToppingStandardIds = wholeToppingStandardIds;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        	this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        	this.description = description;
    }

    public String getHalfTwoToppingStdIds() {
        return halfTwoToppingStdIds;
    }

    public void setHalfTwoToppingStdIds(String halfTwoToppingStdIds) {
        	this.halfTwoToppingStdIds = halfTwoToppingStdIds;
    }

    public String getHalfTwoSpecialtyStdId() {
        return halfTwoSpecialtyStdId;
    }

    public void setHalfTwoSpecialtyStdId(String halfTwoSpecialtyStdId) {
        	this.halfTwoSpecialtyStdId = halfTwoSpecialtyStdId;
    }

    public String getInstructionCodes() {
        return instructionCodes;
    }

    public void setInstructionCodes(String instructionCodes) {
        	this.instructionCodes = instructionCodes;
    }

    public String getHalfOneSpecialtyStdId() {
        return halfOneSpecialtyStdId;
    }

    public void setHalfOneSpecialtyStdId(String halfOneSpecialtyStdId) {
        	this.halfOneSpecialtyStdId = halfOneSpecialtyStdId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        	this.price = price;
    }

    public String getHalfOneToppingStdIds() {
        return halfOneToppingStdIds;
    }

    public void setHalfOneToppingStdIds(String halfOneToppingStdIds) {
        	this.halfOneToppingStdIds = halfOneToppingStdIds;
    }

    public String getSauceCode() {
        return sauceCode;
    }

    public void setSauceCode(String sauceCode) {
        	this.sauceCode = sauceCode;
    }
}
