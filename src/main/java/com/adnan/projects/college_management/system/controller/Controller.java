package com.adnan.projects.college_management.system.controller;

import com.adnan.projects.college_management.system.Entity.Department;
import com.adnan.projects.college_management.system.Entity.Staff;
import com.adnan.projects.college_management.system.Repository.DepartmentRepository;
import com.adnan.projects.college_management.system.Repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private StaffRepository staffRepo;
    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping(value ="/test")
    public void test(){

        Staff staff = new Staff();
        staff.setName("M.F.Kazi");
        //staff.setDepartment("Computer Science");
//        Department computerScience = departmentRepository.findByName("Computer Science");

        Department department = new Department();
        department.setName("Mechanical Department");
        departmentRepository.save(department);

        staffRepo.save(staff);

//        Department mechanicalDepartment = departmentRepository.findByName("Mechanical Department");
//        System.out.println( mechanicalDepartment);

        department = departmentRepository.findByName("Mechanical Department");
        department.getStaff().add(staff);
        departmentRepository.save(department);


    }

}
