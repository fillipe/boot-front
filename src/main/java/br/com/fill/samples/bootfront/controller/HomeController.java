package br.com.fill.samples.bootfront.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/arara")
    public String arara() {
        return "aaaaaaaaaaaaa";
    }
}
