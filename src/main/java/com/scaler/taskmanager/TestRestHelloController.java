package com.scaler.taskmanager;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//this controller is not related to task-manager application and is added only to test initially created project
@RestController
public class TestRestHelloController {

    @GetMapping("/hello")
    String hello(){
        return "Hello World!";
    }

}
