package br.com.fill.samples.bootfront.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fill.samples.bootfront.model.CardResponse;
import br.com.fill.samples.bootfront.model.CartaoEmbossingRequest;
import br.com.fill.samples.bootfront.model.CartaoEmbossingResponse;

@FeignClient(name = "cardService", url = "https://sandbox.conductor.com.br/pier/v2/api")
public interface CardService {
	
	@RequestMapping(method = RequestMethod.POST, value = "/contas/{id}/gerar-cartao-grafica", consumes = "application/json")
	CartaoEmbossingResponse generateCardPrintShop(@RequestHeader Map<String, String> header,
			@PathVariable("id") Long id, CartaoEmbossingRequest cartaoEmbossingRequest);

	@RequestMapping(method = RequestMethod.POST, value = "/cartoes/{id}/cadastrar-senha", consumes = "application/json")
	CardResponse createPassword(@RequestHeader Map<String, String> header, @PathVariable("id") Long cardId);
}
