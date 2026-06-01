package com.TNT.BMS.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunnerController {
	
	@GetMapping("/heartbeat")
	public ResponseEntity<String> runner() {
	    return ResponseEntity.ok("running...");
	}
}
