package br.com.fill.samples.bootfront.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.fill.samples.bootfront.bean.Address;
import br.com.fill.samples.bootfront.service.CepService;

@Controller
public class HomeController {
	
	@Autowired
	private CepService cepService;
	
	@GetMapping("/home")
    public String home(Model model) {
		model.addAttribute("address", new Address());
        return "home";
    }
	
	@PostMapping("/consultaCep")
    public ResponseEntity<String> consultaCep(String cep) {
		Address address = cepService.getCep(cep);
		return new ResponseEntity<String>(address.toString(), HttpStatus.OK);
    }

}
