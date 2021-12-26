package com.elhg.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControlller {

	@GetMapping(value = "/test/{name}")
	public ResponseEntity<String> saludo(@PathVariable String name){
		return ResponseEntity.ok("Saludos "+name);
	}
}
