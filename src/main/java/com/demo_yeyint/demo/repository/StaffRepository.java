package com.demo_yeyint.demo.repository;

import com.demo_yeyint.demo.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff,Integer> {

}
