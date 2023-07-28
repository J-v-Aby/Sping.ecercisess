package com.example.springboot.esercizio5.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table
public class Meal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Double price;

    @OneToMany(mappedBy = "meal")
    private List<Ingredient> ingredients;
    private boolean isWinterMeal;    //6' esercizio

    public Meal(Long id, String name, String description, Double price, List<Ingredient> ingredients, boolean isWinterMeal) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.ingredients = ingredients;
        this.isWinterMeal = isWinterMeal;
    }

    public Meal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public boolean isWinterMeal() {
        return isWinterMeal;
    }

    public void setWinterMeal(boolean winterMeal) {
        isWinterMeal = winterMeal;
    }
}


