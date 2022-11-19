package com.example.a.service;

import com.example.a.entity.Department;

public interface DepartmentService {

    Department saveDepartment(Department department);

    Department getDepartmentById(Long id);


}
