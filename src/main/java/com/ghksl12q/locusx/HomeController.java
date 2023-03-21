package com.ghksl12q.locusx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import groovy.util.logging.Slf4j;

@Controller
@Slf4j
public class HomeController {
  
  @GetMapping("/")
  public String home(){
    return "/index/index";
  }
}
