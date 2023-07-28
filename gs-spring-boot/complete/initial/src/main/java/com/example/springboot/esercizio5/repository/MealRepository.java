package com.example.springboot.esercizio5.repository;

import com.example.springboot.esercizio5.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MealRepository extends JpaRepository<Meal,Long> {
    List<Meal> findByIsWinterMeal(boolean isWinterMeal);
}
