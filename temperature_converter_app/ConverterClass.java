package com.example.temperature_converter_app;

public class ConverterClass {

    public double c2f_fn(double celsius){
        return (celsius*1.0)+32;

    }

    public double f2c_fn(double farenheit){
        return (farenheit-32)/1.0;

    }
}
