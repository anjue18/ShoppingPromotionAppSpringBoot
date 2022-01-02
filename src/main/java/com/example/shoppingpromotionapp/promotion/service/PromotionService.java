package com.example.shoppingpromotionapp.promotion.service;

import com.example.shoppingpromotionapp.promotion.dao.Department;
import com.example.shoppingpromotionapp.promotion.dao.Promotion;
import com.example.shoppingpromotionapp.promotion.dto.PromotionResponse;
import com.example.shoppingpromotionapp.promotion.mapper.PromotionResponseMapper;
import com.example.shoppingpromotionapp.promotion.repository.DepartmentRepository;
import com.example.shoppingpromotionapp.promotion.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PromotionService {

    @Autowired
    private PromotionRepository promotionRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private PromotionResponseMapper promotionResponseMapper;

    public List<PromotionResponse> getPromotionByDeptId(String deptId){
        Optional<Department> department = departmentRepository.findById(deptId);
        List<Promotion> promotions = promotionRepository.findPromotionsByDepartment(department);
        return promotions.stream().map(promotion -> promotionResponseMapper.map(promotion)).collect(Collectors.toList());

    }
}
