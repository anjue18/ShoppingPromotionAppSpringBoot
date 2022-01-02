package com.example.shoppingpromotionapp.promotion.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

    @Table(name = "department")
    @Entity
    public class Department {

        @Id
        @Column(name = "department_id")
        private String departmentId;

        @Column(name = "department_name")
        private String departmentName;

        public String getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }
    }
