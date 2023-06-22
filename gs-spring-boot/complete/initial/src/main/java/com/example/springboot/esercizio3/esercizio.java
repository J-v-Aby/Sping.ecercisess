package com.example.springboot.esercizio3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class esercizio {
    List<Meal> meals=new ArrayList<>();
    @GetMapping("get/meals")
    public ResponseEntity<List<Meal>> getMeal(){
        return  ResponseEntity.ok(meals);
    }
    @PutMapping("/put/meal")
    public ResponseEntity<String> putmeal(@RequestBody Meal meal){
        this.meals.add(meal);
        return ResponseEntity.ok("meal added");
    }
    @PostMapping ("post/meal/{meal}")
    public ResponseEntity<String> postMeal(@RequestBody Meal meal){
        this.meals.removeIf(m-> m.getNome().equals((meal)));
        this.meals.add(meal);
        return ResponseEntity.ok("meal updated");
    }
    @DeleteMapping ("delite/meals/{nome}")
    public ResponseEntity <String> deliteMeal(@PathVariable String nome){
    this.meals.removeIf(meal -> meal.getNome().equals(nome));
                return ResponseEntity.ok("meal delited");

    }@DeleteMapping ("delite/meals/price/{price}")
    public ResponseEntity <?> deliteMeal(@PathVariable double price){
    this.meals.removeIf(meal -> meal.getPrezzo()>price);
                return ResponseEntity.ok("meal delited");
    }
    @PostMapping ("post/meal/{meal}/price")
    public ResponseEntity<?> postMeal1(@PathVariable Meal price){
        this.meals.removeIf(m-> m.getPrezzo().equals((price)));
        this.meals.add(price);
        return ResponseEntity.ok("meal updated");
    }

}
