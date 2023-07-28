package com.example.springboot.esercizio5.controller;

import com.example.springboot.esercizio5.entity.Ingredient;
import com.example.springboot.esercizio5.entity.Meal;
import com.example.springboot.esercizio5.service.MealService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/meal")
public class MealController {
private MealService mealService;

    public MealController(MealService mealService) {
        this.mealService = mealService;
    }
    @PostMapping("/inserimento")
    public ResponseEntity<?> postingredient(@RequestBody Meal meal) {
        mealService.insertMeal(meal);
        return ResponseEntity.ok("Meal added!");
    }
    @GetMapping("/lista")
    public ResponseEntity<List<Meal>> getIngredient() {
        return ResponseEntity.ok(mealService.getAllMeals());
    }
    @GetMapping("/{id}")
    public Meal getMealbyID(@PathVariable Long id) {
       return mealService.getMealById(id);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id ,@RequestBody Meal meal){
       mealService.updateMeal(id,meal);
        return ResponseEntity.ok("update ok");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delite(@PathVariable Long id){
        mealService.deleteMeal(id);
        return ResponseEntity.ok("you are great");
    }
    @GetMapping("winterMeals")
    public ResponseEntity<List<Meal>> getWinterMeals(){
        return ResponseEntity.ok(mealService.getWinterMeals());
    }
}
