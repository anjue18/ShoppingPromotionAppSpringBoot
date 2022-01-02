package com.example.shoppingpromotionapp.cart.dto;

import javax.persistence.Column;

public class PromotionToCart {

    private String cartId;
    private String promoId;
    private String promoName;
    private String promoDesc;
    private String promoListPrice;
    private String promoDiscPrice;

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

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
}
