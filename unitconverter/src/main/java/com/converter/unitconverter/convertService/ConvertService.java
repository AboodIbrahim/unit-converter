package com.converter.unitconverter.convertService;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ConvertService {

    private final Map<String, Double> LENGTH_UNITS = Map.of(
            "mm", 0.001,
            "cm", 0.01,
            "m", 1.0,
            "km", 1000.0,
            "in", 0.0254,
            "ft", 0.3048,
            "yd", 0.9144,
            "mi", 1609.344
    );

    // Coefficients relative to 1 gram
    private final Map<String, Double> WEIGHT_UNITS = Map.of(
            "mg", 0.001,
            "g", 1.0,
            "kg", 1000.0,
            "oz", 28.3495,
            "lb", 453.592
    );

    private final List<String> TEMPERATURE_UNITS = List.of("C", "K", "F");

    public Double convertLength(String fromUnit, String toUnit, Double value){
        return (LENGTH_UNITS.get(fromUnit)*value)/LENGTH_UNITS.get(toUnit);
    }

    public Double convertWeight(String fromUnit, String toUnit, Double value){
        return (WEIGHT_UNITS.get(fromUnit)*value)/WEIGHT_UNITS.get(toUnit);
    }

    public Double convertTemperature(String fromUnit, String toUnit, Double value){
        Double celsius = null;
        if (fromUnit.equals("C")){
            celsius = value;
        } else if (fromUnit.equals("F")) {
            celsius = (value - 32) * 5/9;
        } else if (fromUnit.equals("K")) {
            celsius = value - 273.15;
        }

        // Convert to target unit
        if (toUnit.equals("C")){
            return celsius;
        } else if (toUnit.equals("F")) {
            return celsius * 9/5 + 32;
        } else if (toUnit.equals("K")) {
            return celsius + 273.15;
        }

        return null;
    }



}
