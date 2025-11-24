package com.converter.unitconverter.controller;


import com.converter.unitconverter.convertService.ConvertService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Conrtoller {

    ConvertService cs = new ConvertService();

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/length")
    public String convertLength(@RequestParam double value, @RequestParam String fromUnit, @RequestParam String toUnit, Model model){
        double result = cs.convertLength(fromUnit, toUnit, value);

        model.addAttribute("value", value);
        model.addAttribute("fromUnit", fromUnit);
        model.addAttribute("toUnit", toUnit);
        model.addAttribute("result", result);

        return "index";
    }

    @PostMapping("/weight")
    public String convertWeight(@RequestParam double value, @RequestParam String fromUnit, @RequestParam String toUnit, Model model){
        double result = cs.convertWeight(fromUnit, toUnit, value);

        model.addAttribute("value", value);
        model.addAttribute("fromUnit", fromUnit);
        model.addAttribute("toUnit", toUnit);
        model.addAttribute("result", result);

        return "index";
    }

    @PostMapping("/temperature")
    public String convertTemp(@RequestParam double value, @RequestParam String fromUnit, @RequestParam String toUnit, Model model){
        double result = cs.convertTemperature(fromUnit, toUnit, value);

        model.addAttribute("value", value);
        model.addAttribute("fromUnit", fromUnit);
        model.addAttribute("toUnit", toUnit);
        model.addAttribute("result", result);

        return "index";
    }

}
