package com.nicola.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("ui")
public class UIController {

    @GetMapping(path = "/")
    public ModelAndView greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {

        Map<String, String> model = new HashMap<>(){{
            put("name", name);
            put("test", "testytest1");
        }};

        return new ModelAndView( "greeting", model);
    }

}
