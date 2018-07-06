package br.com.fill.samples.bootfront.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fill.samples.bootfront.bean.Address;
import br.com.fill.samples.bootfront.service.CepService;

@Controller
public class AddressController {
	
	@Autowired
	private CepService cepService;
	
	@GetMapping("/test")
    public String home(Model model) {
		model.addAttribute("address", new Address());
        return "test";
    }
	
	@PostMapping("/consultaCep")
    public ModelAndView consultaCep(String cep, RedirectAttributes redirect) {
		Address address = cepService.getCep(cep);
		//modelAndView.addObject("address", address);
		redirect.addFlashAttribute("address", address);
		ModelAndView modelAndView = new ModelAndView("redirect:test");
		return modelAndView;
    }

}
