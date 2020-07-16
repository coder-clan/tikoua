package com.github.coderclan.tikoua.interfaces.rest.v1;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/welcome", produces = MediaType.APPLICATION_JSON_VALUE)
public class WelcomeRestController {

  @GetMapping
  public ResponseEntity<String> welcome() {
    return ResponseEntity.ok("Welcome to access Tikoua!");
  }
}
