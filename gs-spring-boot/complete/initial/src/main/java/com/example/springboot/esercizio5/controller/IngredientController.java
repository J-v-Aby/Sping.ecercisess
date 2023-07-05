package com.example.springboot.esercizio5.controller;

import com.example.springboot.esercizio3.Meal;
import com.example.springboot.esercizio5.entity.Ingredient;
import com.example.springboot.esercizio5.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {
    @Autowired
    private IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping("/inserimento")

    public ResponseEntity<?> postingredient(@RequestBody Ingredient ingredient) {
        ingredientService.ingredientTestTable(ingredient);
        return ResponseEntity.ok("ingredient added!");
    }
    @GetMapping("/lista")
    public ResponseEntity<List<Ingredient>> getIngredient() {
        return ResponseEntity.ok(ingredientService.ingredientList());
    }
    @GetMapping("/{id}")
    public Ingredient getIngredientbyID(@PathVariable Long id) {
        Ingredient ingredient = ingredientService.getIngrendient(id);
        return new Ingredient(ingredient.getName(),ingredient.isVegetarian(),
                ingredient.isVegan(),ingredient.isGlutenFree(),ingredient.isLactoseFree());
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id ,@RequestBody Ingredient ingredient){
        ingredientService.update(id,ingredient);
        return ResponseEntity.ok("sei un grande");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delite(@PathVariable Long id){
        ingredientService.delite(id);
    return ResponseEntity.ok("you are great");
    }


}
