package com.example.shoppingpromotionapp.promotion.dao;

import javax.persistence.*;

@Table(name = "promotion")
    @Entity
    public class Promotion {

        @Id
        @Column(name = "promo_id")
        private String promoId;

        @Column(name = "promo_name")
        private String promoName;

        @Column(name = "promo_desc")
        private String promoDesc;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "department_id",referencedColumnName = "department_id")
        private Department department;

        @Column(name = "promo_list_price")
        private String promoListPrice;

        @Column(name = "promo_disc_price")
        private String promoDiscPrice;

        @Column(name = "promo_img")
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
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
}

