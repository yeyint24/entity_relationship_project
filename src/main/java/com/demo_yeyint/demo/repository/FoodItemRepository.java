package com.demo_yeyint.demo.repository;

import com.demo_yeyint.demo.domain.Food_Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodItemRepository extends JpaRepository<Food_Item,Integer> {
}
