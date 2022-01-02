package com.example.shoppingpromotionapp.cart.dao;


import javax.persistence.*;

@Table(name = "cart")
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cart_id")
    private Long cartId;

    @Column(name = "promo_id")
    private String promoId;

    @Column(name = "promo_name")
    private String promoName;

    @Column(name = "promo_qty")
    private Long promoQty;

    @Column(name = "promo_desc")
    private String promoDesc;

    @Column(name = "promo_list_price")
    private String promoListPrice;

    @Column(name = "promo_disc_price")
    private String promoDiscPrice;


    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
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

    public Long getPromoQty() {
        return promoQty;
    }

    public void setPromoQty(Long promoQty) {
        this.promoQty = promoQty;
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
