package com.example.shoppingpromotionapp.promotion.repository;

import com.example.shoppingpromotionapp.promotion.dao.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, String> {
    //Department findByDepartment(String departmentId);
}
