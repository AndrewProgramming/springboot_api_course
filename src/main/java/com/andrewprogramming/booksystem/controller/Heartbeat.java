package com.andrewprogramming.booksystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Heartbeat {

  //http://localhost:8080/ping
  @RequestMapping("/ping")
  public String pong() {
    return "pong";
  }
}
