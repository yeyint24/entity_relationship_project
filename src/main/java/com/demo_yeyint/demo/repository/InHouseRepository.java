package com.demo_yeyint.demo.repository;

import com.demo_yeyint.demo.domain.InHouseVet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InHouseRepository extends JpaRepository<InHouseVet,Integer> {

}
