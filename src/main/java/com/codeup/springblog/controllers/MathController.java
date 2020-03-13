package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    // PATH = /add/3/and/4 = 7
    @RequestMapping(path = "/add/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String addNumber(@PathVariable int number, @PathVariable int number2) {

        return number + " + " + number2 + " = " + (number + number2);
    }
    // PATH = /subtract/3/from/10 = 7
    @RequestMapping(path = "/subtract/{number}/from/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String subtractNumber(@PathVariable int number, @PathVariable int number2) {

        return number2 + " - " + number + " = " + (number2 - number);
    }
    // PATH = /multiply/4/and/5	= 20
    @RequestMapping(path = "/multiply/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String multiplyNumber(@PathVariable int number, @PathVariable int number2) {

        return number + " * " + number2 + " = " + (number * number2);
    }
    //  /divide/6/by/3 = 2
    @RequestMapping(path = "/divide/{number}/by/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String divideNumber(@PathVariable int number, @PathVariable int number2) {

        return number + " / " + number2 + " = " + (number / number2);
    }
}
