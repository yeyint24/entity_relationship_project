package com.demo_yeyint.demo.repository;

import com.demo_yeyint.demo.domain.Animals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalsRepository extends JpaRepository<Animals,Integer> {
}
