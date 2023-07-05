package com.example.springboot.esercizio4.controller;

import com.example.springboot.esercizio3.Meal;
import com.example.springboot.esercizio4.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "es4/meal/")
public class MealController {
    @Autowired
    private MealService mealService;

    public MealController(MealService mealService) {
        this.mealService = mealService;
    }
   @PostMapping
    public ResponseEntity<String> postMeal(@RequestBody Meal meal){
        mealService.addMeal(meal);
        return ResponseEntity.ok("meal added!");
    }
   @GetMapping
   public ResponseEntity<List<Meal>> getMeal(){
        return ResponseEntity.ok(mealService.getMeal());
   }


  /* @PutMapping("{meal}")
   public ResponseEntity<?> puttMeal(@PathVariable String meal){
        mealService.deliteMeal(meal);
        mealService.addMeal(meal);

   }*/

   @DeleteMapping("{mealName}")
    public ResponseEntity<String> deliteMeal(@PathVariable String mealName){
        mealService.deliteMeal(mealName);
    return ResponseEntity.ok("meal delited! ");
    }

}
