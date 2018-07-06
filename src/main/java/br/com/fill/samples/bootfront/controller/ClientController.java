package br.com.fill.samples.bootfront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fill.samples.bootfront.bean.ClientPF;

@Controller
@RequestMapping("/client")
public class ClientController {
	
	@GetMapping("/pf")
    public String home(Model model) {
		model.addAttribute("address", new ClientPF());
        return "clientes-pessoas-fisicas";
    }
	
	

}
