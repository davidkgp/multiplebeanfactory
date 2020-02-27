package org.example.controller;

import org.example.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    @GetMapping("/doSomething")
    public ResponseEntity<String> getSomething() {

        myService.getService();
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    @GetMapping("/doSomething1")
    public ResponseEntity<String> getSomething1() {

        myService.getService2();
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

}
