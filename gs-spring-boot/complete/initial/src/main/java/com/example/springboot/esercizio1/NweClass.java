package com.example.springboot.esercizio1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class NweClass {
    @GetMapping("/info")
    public ResponseEntity<String> index(){
        return ResponseEntity.ok("si, può, fareeeeeee");
    }
@GetMapping("/esercizio4")
    public ResponseEntity<String>index2(){
        Boolean f= new Random().nextBoolean();
        if(f==false){
            return ResponseEntity.badRequest().body("mi di spiace, sei stato sfortunato");
        }
        return ResponseEntity.ok("bel colpo, stavolta la dea bendata ti ha baciat*");
}

}
