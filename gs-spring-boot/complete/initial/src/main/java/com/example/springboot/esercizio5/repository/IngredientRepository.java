package com.example.springboot.esercizio5.repository;

import com.example.springboot.esercizio5.entity.Ingredient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IngredientRepository extends JpaRepository<Ingredient,Long> {}
