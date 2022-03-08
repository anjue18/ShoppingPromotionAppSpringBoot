package com.example.shoppingpromotionapp.cart.controller;

import com.example.shoppingpromotionapp.cart.dao.Cart;
import com.example.shoppingpromotionapp.cart.dto.PromotionToCart;
import com.example.shoppingpromotionapp.cart.service.CartService;
import com.example.shoppingpromotionapp.promotion.controller.PromotionController;
import com.example.shoppingpromotionapp.promotion.dto.PromotionResponse;
import com.example.shoppingpromotionapp.promotion.service.PromotionService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@Import(HttpEncodingAutoConfiguration.class)
@WebMvcTest(controllers = {CartController.class})
@AutoConfigureMockMvc
class CartControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    CartService cartService;

    @Test
    public void shouldReturnAllItemsFromCart() throws Exception{

        List<Cart> allCartItems = new ArrayList<>();
        Cart cartItem1 = new Cart();
        cartItem1.setCartId(1l);
        cartItem1.setPromoId("P101");
        cartItem1.setPromoName("Lays");
        cartItem1.setPromoDesc("Sour cream lays");
        cartItem1.setPromoQty(2l);
        cartItem1.setPromoListPrice("12.00");
        cartItem1.setPromoDiscPrice("10.00");

        Cart cartItem2 = new Cart();
        cartItem2.setCartId(2l);
        cartItem2.setPromoId("P102");
        cartItem2.setPromoName("Pepsi");
        cartItem2.setPromoDesc("Pepsi");
        cartItem2.setPromoQty(1l);
        cartItem2.setPromoListPrice("10.00");
        cartItem2.setPromoDiscPrice("8.00");
        allCartItems.add(cartItem1);
        allCartItems.add(cartItem2);

        ObjectMapper mapper = new ObjectMapper();

        when(cartService.getAllItemsFromCart()).thenReturn(allCartItems);

        mockMvc.perform(MockMvcRequestBuilders.get("/getAllItemsFromCart")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(mapper.writeValueAsString(allCartItems)));
    }

    //@Test
//    public void shouldAddAnItemToCartAndReturnTheDetails() throws Exception {
//
//        PromotionToCart promotionToCartRequest = new PromotionToCart();
//        promotionToCartRequest.setPromoId("P101");
//        promotionToCartRequest.setPromoName("Lays");
//        promotionToCartRequest.setPromoDesc("Sour cream lays");
//        promotionToCartRequest.setPromoListPrice("12.00");
//        promotionToCartRequest.setPromoDiscPrice("10.00");
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        Cart cart = new Cart();
//        cart.setCartId(1L);
//        cart.setPromoId("P101");
//        cart.setPromoName("Lays");
//        cart.setPromoDesc("Sour cream lays");
//        cart.setPromoQty(1l);
//        cart.setPromoListPrice("12.00");
//        cart.setPromoDiscPrice("10.00");
//
//        when(cartService.addToCart(promotionToCartRequest))
//                .thenReturn(cart);
//
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/getAllItemsFromCart")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(mapper.writeValueAsString(promotionToCartRequest)))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.content().string(mapper.writeValueAsString(cart)));
//
//    }

}