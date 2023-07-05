package com.example.springboot.esercizio4.service;

import com.example.springboot.esercizio3.Meal;
import com.example.springboot.esercizio4.dao.MealDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
    @Autowired
    private MealDao mealDao;
    public MealService(MealDao mealDao) {
        this.mealDao = mealDao;
    }
    public void addMeal(Meal meal){
       mealDao.addMeal(meal);
    };
    public List<Meal> getMeal(){
        return mealDao.getMeal();
    };
    public void updateMeal(Meal meal){
        mealDao.updateMeal(meal);
    };
    public void deliteMeal(String mealName){
       mealDao.deliteMeal(mealName);
    };

}
