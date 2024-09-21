package com.adnan.projects.college_management.system.Repository;

import com.adnan.projects.college_management.system.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    public Department findByName(String name);
}
