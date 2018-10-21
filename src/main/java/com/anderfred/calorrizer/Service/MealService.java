package com.anderfred.calorrizer.Service;

import com.anderfred.calorrizer.entity.Meal;

import java.util.Optional;

public interface MealService {
    <S extends Meal> S save(S s);

    Optional<Meal> findById(Integer id);

    Iterable<Meal> findAll();

    Optional<Meal> getByName(String name);

    void delete(Meal meal);
}
