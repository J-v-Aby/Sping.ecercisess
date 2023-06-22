package com.example.springboot.esercizio2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class PrimoEsercizio {
  List<Meal> listadelBar= Arrays.asList(new Meal("Arancina", "palla di riso ripina e fritta",2.4),
          new Meal("Calzone fritto", "uguale ad un calzolne, ma fritto",2.3),
  new Meal("calzone normale","semplice calzone al forno" ,2.0));
    @GetMapping("/get/Meal")
    public ResponseEntity<?> index(){ return ResponseEntity.ok(listadelBar);}

/*  @GetMapping("/Meal/{name}")
  public ResponseEntity<?> getMealName1(){
      return ResponseEntity.ok(listadelBar.get(1).getNome());
  } */
  @GetMapping("/get/Meal/{nome}")
  public ResponseEntity<?> getmeal(
    @PathVariable  ("nome") String nome ) {
    Meal meal=null;
      for (Meal m : listadelBar) {
        if (m.getNome().contains(nome)) {
          meal = m;
        }
      }

    return ResponseEntity.ok(meal);
  }
  @GetMapping("/get/Meal/{nome}/{descrizione}")
  public ResponseEntity<?> getmeal2(
    @PathVariable  ("descrizione") String descrizione ) {
    Meal meal=null;
    for(Meal m: listadelBar){
      if(m.getDescrizione().contains(descrizione)){
        meal=m;
      }
    }
      return ResponseEntity.ok(meal);
  }
  @GetMapping("/get/Meal/{nome}/{descrizione}/{prezzo}")
  public ResponseEntity<?> getmeal3(
    @PathVariable  ("prezzo") Double prezzo ) {
    Meal meal = null;
    for (Meal m : listadelBar) {
      if (m.getPrezzo().equals(prezzo)) {
        meal = m;
      }
    }
    return ResponseEntity.ok(meal);
  }
}
