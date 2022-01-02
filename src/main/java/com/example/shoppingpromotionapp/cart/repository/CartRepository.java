package com.example.shoppingpromotionapp.cart.repository;

import com.example.shoppingpromotionapp.cart.dao.Cart;
import com.example.shoppingpromotionapp.cart.dto.PromotionToCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
    Cart findByPromoId(String promotionId);
}
