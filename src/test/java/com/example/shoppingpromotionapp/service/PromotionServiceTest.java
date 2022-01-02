package com.example.shoppingpromotionapp.service;

import com.example.shoppingpromotionapp.promotion.dao.Department;
import com.example.shoppingpromotionapp.promotion.dao.Promotion;
import com.example.shoppingpromotionapp.promotion.dto.PromotionResponse;
import com.example.shoppingpromotionapp.promotion.mapper.PromotionResponseMapper;
import com.example.shoppingpromotionapp.promotion.repository.DepartmentRepository;
import com.example.shoppingpromotionapp.promotion.repository.PromotionRepository;
import com.example.shoppingpromotionapp.promotion.service.PromotionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


class PromotionServiceTest {

    @InjectMocks
    PromotionService promotionService;

    @Mock
    DepartmentRepository departmentRepository;

    @Mock
    PromotionRepository promotionRepository;

    @Mock
    PromotionResponseMapper promotionResponseMapper;

    @BeforeEach
    public void initMocks(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldReturnPromotionsByDeptId(){
        Department department = new Department();
        department.setDepartmentId("D01");
        department.setDepartmentName("Grocery");

        when(departmentRepository.findById("D01")).thenReturn(java.util.Optional.of(department));

        List<Promotion> promotions = new ArrayList<>();
        Promotion promotion = new Promotion();
        promotion.setPromoId("P101");
        promotion.setPromoName("Lays");
        promotion.setPromoDesc("Sour Cream Lays");
        promotion.setDepartment(department);
        promotion.setPromoListPrice("12.00");
        promotion.setPromoDiscPrice("10.00");
        promotion.setPromoImg("imageurl");
        promotions.add(promotion);

        when(promotionRepository.findPromotionsByDepartment(java.util.Optional.of(department)))
                .thenReturn(promotions);

        List<PromotionResponse> promotionResponses = new ArrayList<>();
        PromotionResponse promotionResponse = new PromotionResponse();
        promotionResponse.setPromoId("P101");
        promotionResponse.setPromoName("Lays");
        promotionResponse.setPromoDesc("Sour Cream Lays");
        promotionResponse.setDepartmentId("D01");
        promotionResponse.setDepartmentName("Grocery");
        promotionResponse.setPromoListPrice("12.00");
        promotionResponse.setPromoDiscPrice("10.00");
        promotionResponse.setPromoImg("imageurl");
        promotionResponses.add(promotionResponse);

        when(promotionResponseMapper.map(promotion)).thenReturn(promotionResponse);
        List<PromotionResponse> actualResult = promotionService.getPromotionByDeptId("D01");
        assertEquals(actualResult,promotionResponses);

    }


}