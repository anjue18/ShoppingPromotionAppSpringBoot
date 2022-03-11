package com.example.shoppingpromotionapp.promotion;

import com.example.shoppingpromotionapp.promotion.controller.PromotionController;
import com.example.shoppingpromotionapp.promotion.dto.PromotionResponse;
import com.example.shoppingpromotionapp.promotion.service.PromotionService;
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
@WebMvcTest(controllers = {PromotionController.class})
@AutoConfigureMockMvc
class PromotionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    PromotionService promotionService;

    @Test
    public void shouldReturnPromotionsByDeptId() throws Exception{
        System.out.println("test PR");
        List<PromotionResponse> promotionResponseList = new ArrayList<>();
        PromotionResponse promotionResponse = new PromotionResponse();
        promotionResponse.setPromoId("P101");
        promotionResponse.setPromoName("Lays");
        promotionResponse.setPromoDesc("Sour Cream Lays");
        promotionResponse.setDepartmentId("D01");
        promotionResponse.setDepartmentName("Grocery");
        promotionResponse.setPromoListPrice("12.00");
        promotionResponse.setPromoDiscPrice("10.00");
        promotionResponse.setPromoImg("imageurl");
        promotionResponseList.add(promotionResponse);

        ObjectMapper mapper = new ObjectMapper();

        when(promotionService.getPromotionByDeptId("D01")).thenReturn(promotionResponseList);

        mockMvc.perform(MockMvcRequestBuilders.get("/promotions?deptId=D01")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(mapper.writeValueAsString(promotionResponseList)));
    }


}