package com.phuongnq.integration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping
	public ResponseEntity<Integer[]> home() {
		return ResponseEntity.ok(new Integer[] {1,2,3,4,5});
	}
}
