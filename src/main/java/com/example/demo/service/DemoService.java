package com.example.demo.service;

import com.example.demo.config.DemoConfig;
import com.example.demo.entity.DemoEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("request")
public class DemoService {
    
    @Autowired
    DemoConfig config;
    
    public DemoEntity execute() {

        // application.propertiesからデータを取得して設定する

        DemoEntity entity = new DemoEntity();
        entity.setName(config.getName());
        entity.setAge(config.getAge());
        return entity;
    }
}
