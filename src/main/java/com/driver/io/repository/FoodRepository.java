package com.driver.io.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<com.driver.model.entity.FoodEntity, Long> {
	com.driver.model.entity.FoodEntity findByFoodId(String foodId);
}