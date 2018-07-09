package br.com.fill.samples.bootfront.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fill.samples.bootfront.model.CardRequest;
import br.com.fill.samples.bootfront.model.CardResponse;
import br.com.fill.samples.bootfront.model.CartaoEmbossingResponse;
import br.com.fill.samples.bootfront.service.CardService;
import feign.FeignException;

@Controller
@RequestMapping("/card")
public class CardController {
	
	private static final String SENHA_INVALIDA = "Senha inválida. Digite uma senha numérica de 4 dígitos.";

	@Autowired
	private Map<String, String> header;
	
	@Autowired
	private CardService cardService;

	@RequestMapping("/password")
    public ModelAndView password(final CardRequest cardRequest) {
		ModelAndView modelAndView = new ModelAndView("cadastrar-senha");
		modelAndView.addObject("returnMessage", "");
		modelAndView.addObject("responseStatus", "");
        return modelAndView;
    }
	
	@RequestMapping("/create")
    public ModelAndView create(final CardRequest cardRequest) {
		ModelAndView modelAndView = new ModelAndView("gerar-cartao");
		modelAndView.addObject("returnMessage", "");
        return modelAndView;
    }
	
	@RequestMapping(value="/create", params={"save"})
    public ModelAndView generateCard(CardRequest cardRequest) {
		ModelAndView modelAndView = new ModelAndView("gerar-cartao");
		modelAndView.addObject("returnMessage", "");
		try {
			CartaoEmbossingResponse cardPrintShop = cardService.generateCardPrintShop(header, cardRequest.getId(),
					cardRequest.getCartaoEmbossingRequest());
			modelAndView.addObject("cartaoEmbossingResponse", cardPrintShop);
		} catch(FeignException e) {
			modelAndView.addObject("returnMessage", e.getMessage());
		}
		return modelAndView;
    }
	
	@RequestMapping(value="/password", params={"save"})
    public ModelAndView createPassword(final CardRequest cardRequest) {
		int status = 0;
		String message = "";
		if (cardRequest.getPassword().equals(cardRequest.getConfirmPassword())) {
			Map<String, String> createPasswordHeader =  new HashMap<>(header);
			createPasswordHeader.put("senha", cardRequest.getPassword());
			try {
				CardResponse response = cardService.createPassword(createPasswordHeader, cardRequest.getId());
				status = response.getStatusCodeValue();
				message = response.getBody();
			} catch (FeignException e) {
				message = e.getMessage();
			}
		} else {
			message = SENHA_INVALIDA;
		}
		ModelAndView modelAndView = new ModelAndView("cadastrar-senha");
		modelAndView.addObject("responseStatus", status);
		modelAndView.addObject("returnMessage", message);
        return modelAndView;
    }
}
