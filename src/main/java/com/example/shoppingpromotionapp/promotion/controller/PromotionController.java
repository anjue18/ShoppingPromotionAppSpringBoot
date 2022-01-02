package com.example.shoppingpromotionapp.promotion.controller;

import com.example.shoppingpromotionapp.promotion.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PromotionController {

    @Autowired
    private PromotionService promotionService;

    @CrossOrigin(origins = "*")
    @GetMapping("/promotions")
    public ResponseEntity getPromotionForDept(@RequestParam(name="deptId", required = true)String deptId){
        if(StringUtils.hasText(deptId)){
            return new ResponseEntity(promotionService.getPromotionByDeptId(deptId), HttpStatus.OK);
        }
        return new ResponseEntity("Failure", HttpStatus.NOT_FOUND);

    }
}
