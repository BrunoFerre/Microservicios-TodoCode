package com.microsv.metter_controller.controller;

import com.microsv.metter_controller.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/converter")
public class ConverterController {
    @Autowired
    private ConverterService converterService;
    @GetMapping("/meter/{value}")
    public Double convertCentimeters(@PathVariable Double value){
        try {
            return converterService.convertCentimeters(value);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
