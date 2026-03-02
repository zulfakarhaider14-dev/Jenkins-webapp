package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/test")
	public ResponseEntity<String> testControl(){
		return ResponseEntity.ok("This is hello fro jenkids");
	}
}
