package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String home() {
        return ("home");
    }

    @PostMapping("cal")
    public ModelAndView result(@RequestParam("firstNumber") String num1,
                               @RequestParam("secondNumber") String num2,
                               @RequestParam("opera") String opera) {
        int result = 0;
        int firstNum = Integer.parseInt(num1);
        int secondNum = Integer.parseInt(num2);
        switch (opera) {
            case "addition":
                result = firstNum + secondNum;
                break;
            case "subtraction":
                result = firstNum - secondNum;
                break;
            case "multiplication":
                result = firstNum * secondNum;
                break;
            case "division":
                result = firstNum/secondNum;
                break;
        }
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("result", result);
        return modelAndView;
    }

}
