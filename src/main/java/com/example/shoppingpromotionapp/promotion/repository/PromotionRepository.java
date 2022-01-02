package com.example.shoppingpromotionapp.promotion.repository;

import com.example.shoppingpromotionapp.promotion.dao.Department;
import com.example.shoppingpromotionapp.promotion.dao.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, String> {
    List<Promotion> findPromotionsByDepartment(Optional<Department> department);
}
