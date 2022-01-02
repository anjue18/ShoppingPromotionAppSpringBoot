package com.example.shoppingpromotionapp.promotion.mapper;

import com.example.shoppingpromotionapp.promotion.dao.Promotion;
import com.example.shoppingpromotionapp.promotion.dto.PromotionResponse;
import org.springframework.stereotype.Component;

@Component
public class PromotionResponseMapper {

    public PromotionResponse map(Promotion promotion){
        PromotionResponse promotionResponse = new PromotionResponse();
        promotionResponse.setPromoId(promotion.getPromoId());
        promotionResponse.setPromoDesc(promotion.getPromoDesc());
        promotionResponse.setPromoName(promotion.getPromoName());
        promotionResponse.setDepartmentId(promotion.getDepartment().getDepartmentId());
        promotionResponse.setDepartmentName(promotion.getDepartment().getDepartmentName());
        promotionResponse.setPromoListPrice(promotion.getPromoListPrice());
        promotionResponse.setPromoDiscPrice(promotion.getPromoDiscPrice());
        promotionResponse.setPromoImg(promotion.getPromoImg());

        return promotionResponse;

    }
}
