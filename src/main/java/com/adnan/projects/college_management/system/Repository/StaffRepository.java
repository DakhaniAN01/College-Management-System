package com.adnan.projects.college_management.system.Repository;

import com.adnan.projects.college_management.system.Entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository <Staff, Integer>{

}
