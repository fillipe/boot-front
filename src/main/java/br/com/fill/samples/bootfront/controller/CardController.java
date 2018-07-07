package br.com.fill.samples.bootfront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/card")
public class CardController {

	@GetMapping("/password")
    public String password(Model model) {
        return "cadastrar-senha";
    }
	
	@GetMapping("/create")
    public String create(Model model) {
        return "gerar-cartao";
    }
	
}
