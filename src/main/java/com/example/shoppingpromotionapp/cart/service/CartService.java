package com.example.shoppingpromotionapp.cart.service;

import com.example.shoppingpromotionapp.cart.dao.Cart;
import com.example.shoppingpromotionapp.cart.dto.PromotionToCart;
import com.example.shoppingpromotionapp.cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;
    private Object Optional;

    public Cart addToCart(PromotionToCart promotionToCartRequest) {

        Optional<Cart> existingPromoEntryOptional = java.util.Optional.ofNullable(cartRepository.findByPromoId(promotionToCartRequest.getPromoId()));
        if (existingPromoEntryOptional.isPresent()){
            Cart existingPromoEntry = existingPromoEntryOptional.get();
            final long l = 1;
            existingPromoEntry.setPromoQty(existingPromoEntry.getPromoQty() + l);
            return cartRepository.save(existingPromoEntry);
        }
        else {
            Cart newCartEntry = new Cart();
            newCartEntry.setPromoId(promotionToCartRequest.getPromoId());
            newCartEntry.setPromoName(promotionToCartRequest.getPromoName());
            newCartEntry.setPromoDesc(promotionToCartRequest.getPromoDesc());
            newCartEntry.setPromoQty(1L);
            newCartEntry.setPromoListPrice(promotionToCartRequest.getPromoListPrice());
            newCartEntry.setPromoDiscPrice(promotionToCartRequest.getPromoDiscPrice());
            return cartRepository.save(newCartEntry);
        }
    }

    public List<Cart> getAllItemsFromCart() {
        return cartRepository.findAll();
    }
}
