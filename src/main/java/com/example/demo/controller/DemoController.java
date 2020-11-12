package com.example.demo.controller;

import com.example.demo.entity.DemoEntity;
import com.example.demo.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("request")
public class DemoController {

    @Autowired
    DemoService service;

    @RequestMapping("/test")
    @ResponseBody
    public ResponseEntity<DemoEntity> test() {
        return new ResponseEntity<>(service.execute(), HttpStatus.OK);
    }
}