package com.anderfred.calorrizer.Service;

import com.anderfred.calorrizer.entity.Meal;
import com.anderfred.calorrizer.repository.MealRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MealServiceImpl implements MealService {
    private static final Logger logger = LoggerFactory.getLogger(MealServiceImpl.class);

    private final MealRepository mealRepository;

    @Autowired
    public MealServiceImpl(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    @Override
    public <S extends Meal> S save(S s) {
        logger.info("save {}", s);
        return mealRepository.save(s);
    }

    @Override
    public Optional<Meal> findById(Integer id) {
        logger.info("findById {}", id);
        return mealRepository.findById(id);
    }

    @Override
    public Iterable<Meal> findAll() {
        logger.info("findAll");
        return mealRepository.findAll();
    }

    @Override
    public Optional<Meal> getByName(String name) {
        logger.info("getByName {}", name);
        return mealRepository.getByName(name);
    }

    @Override
    public void delete(Meal meal) {
        logger.info("delete {}", meal);
        mealRepository.delete(meal);
    }
}
