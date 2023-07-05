package com.example.springboot.esercizio4.dao;

import com.example.springboot.esercizio3.Meal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MealDao {
    List<Meal> meals=new ArrayList<>();
    public void addMeal(Meal meal){
        this.meals.add(meal);
    };
    public List<Meal> getMeal(){
        return this.meals;
    };
    public void updateMeal(Meal meal){
        this.meals.removeIf(m->m.getNome().equals(meal.getNome()));
        this.meals.add(meal);
    };
    public void deliteMeal(String mealName){
        this.meals.removeIf(m->m.getNome().equals(mealName));
    };

}
