package com.spring.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/", "/index", "/index.html"})
    public String listVets(Model model){

//        model.addAttribute("vets", vetService.findAll());

        return "owners/index";
    }
}
