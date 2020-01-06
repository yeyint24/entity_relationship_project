package com.demo_yeyint.demo.repository;

import com.demo_yeyint.demo.domain.Cage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CageRepository extends JpaRepository<Cage,Integer> {
}
