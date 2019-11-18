package com.hefeifei.controller;

import com.hefeifei.service.MyService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MyController {
    @Autowired
    private MyService service;
}
