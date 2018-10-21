package com.anderfred.calorrizer.repository;

import com.anderfred.calorrizer.entity.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MealRepository extends CrudRepository<Meal, Integer> {
    Optional<Meal> getByName(String name);
}
