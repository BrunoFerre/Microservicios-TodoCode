package com.microsv.metter_controller.service;

import org.springframework.stereotype.Service;

@Service
public class ConverterServiceImpl implements ConverterService{
    @Override
    public Double convertCentimeters(Double value) {
        return value * 100;
    }
}
