package com.allen.elastic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/allen")
public class AllenController {

    @RequestMapping("/name")
    public ResponseEntity getAllen() {
        return ResponseEntity.ok("Allen.jin");
    }

}
