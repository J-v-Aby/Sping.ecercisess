package com.example.springboot.esercizio1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String index() {
		return "hello world";
	}
	@GetMapping ("/h")
		public ResponseEntity<String> index2(){
		return ResponseEntity.ok("Good Afternoon!");
	}

}

