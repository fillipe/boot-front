package br.com.fill.samples.bootfront.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fill.samples.bootfront.model.CardRequest;
import br.com.fill.samples.bootfront.model.CartaoEmbossingResponse;
import br.com.fill.samples.bootfront.service.AccountService;

@Controller
@RequestMapping("/card")
public class CardController {
	
	@Autowired
	private Map<String, String> header;
	
	@Autowired
	private AccountService accountService;

	@GetMapping("/password")
    public String password(Model model) {
        return "cadastrar-senha";
    }
	
	@GetMapping("/create")
    public String create(Model model) {
		model.addAttribute("cardRequest", new CardRequest());
        return "gerar-cartao";
    }
	
	@PostMapping("/generateCard")
    public ModelAndView generateCard(CardRequest cardRequest) {
		CartaoEmbossingResponse cardPrintShop = accountService.generateCardPrintShop(header, cardRequest.getId(),
				cardRequest.getCartaoEmbossingRequest());
		ModelAndView modelAndView = new ModelAndView("gerar-cartao");
		modelAndView.addObject("cartaoEmbossingResponse", cardPrintShop);
		return modelAndView;
    }
}
