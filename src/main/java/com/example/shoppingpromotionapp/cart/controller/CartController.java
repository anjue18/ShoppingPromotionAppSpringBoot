package com.example.shoppingpromotionapp.cart.controller;

import com.example.shoppingpromotionapp.cart.dto.PromotionToCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.shoppingpromotionapp.cart.service.CartService;

@RestController
public class CartController {

    @Autowired
    private CartService cartService;

    @CrossOrigin(origins = "*")
    @PostMapping("/addToCart")
    public ResponseEntity addPromotionToTheCart(@RequestBody PromotionToCart promotionToCartRequest){

        return new ResponseEntity(cartService.addToCart(promotionToCartRequest), HttpStatus.OK);
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/getAllItemsFromCart")
    public ResponseEntity geAllItemsFromCart(){

        return new ResponseEntity(cartService.getAllItemsFromCart(), HttpStatus.OK);
    }
}
