package com.demo_yeyint.demo.repository;

import com.demo_yeyint.demo.domain.External_Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalRepository extends JpaRepository<External_Vet,Integer> {
}
