package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmployeeController {

 
  // Aggregate root
  // tag::get-aggregate-root[]
  @GetMapping("/employees")
  String all() {
    return "all users are fucked";
  }
  // end::get-aggregate-root[]

}