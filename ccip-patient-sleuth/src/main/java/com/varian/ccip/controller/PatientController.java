package com.varian.ccip.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @RequestMapping(value="/getPatient")
    public Object get() {
        return "Hello Patient!" ;
    }
}
