package com.example.shoppingpromotionapp.promotion.dto;

import java.util.Objects;

public class PromotionResponse {

    private String promoId;

    private String promoName;

    private String promoDesc;

    private String departmentId;

    private String departmentName;

    private String promoListPrice;

    private String promoDiscPrice;

    private String promoImg;

    public String getPromoId() {
        return promoId;
    }

    public void setPromoId(String promoId) {
        this.promoId = promoId;
    }

    public String getPromoName() {
        return promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public String getPromoDesc() {
        return promoDesc;
    }

    public void setPromoDesc(String promoDesc) {
        this.promoDesc = promoDesc;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getPromoListPrice() {
        return promoListPrice;
    }

    public void setPromoListPrice(String promoListPrice) {
        this.promoListPrice = promoListPrice;
    }

    public String getPromoDiscPrice() {
        return promoDiscPrice;
    }

    public void setPromoDiscPrice(String promoDiscPrice) {
        this.promoDiscPrice = promoDiscPrice;
    }

    public String getPromoImg() {
        return promoImg;
    }

    public void setPromoImg(String promoImg) {
        this.promoImg = promoImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PromotionResponse that = (PromotionResponse) o;
        return promoId.equals(that.promoId) && promoName.equals(that.promoName) && promoDesc.equals(that.promoDesc) && departmentId.equals(that.departmentId) && departmentName.equals(that.departmentName) && promoListPrice.equals(that.promoListPrice) && promoDiscPrice.equals(that.promoDiscPrice) && promoImg.equals(that.promoImg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promoId, promoName, promoDesc, departmentId, departmentName, promoListPrice, promoDiscPrice, promoImg);
    }
}
