package com.demo_yeyint.demo.repository;

import com.demo_yeyint.demo.domain.Emergency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmergencyRepository extends JpaRepository<Emergency,Integer> {

}
