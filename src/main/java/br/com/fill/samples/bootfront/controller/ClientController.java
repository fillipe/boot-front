package br.com.fill.samples.bootfront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClientController {
	
	@GetMapping("/pf")
    public String clientpf(Model model) {
        return "clientes-pessoas-fisicas";
    }
	
	

}
