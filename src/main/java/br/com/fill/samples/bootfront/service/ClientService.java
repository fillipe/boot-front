package br.com.fill.samples.bootfront.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fill.samples.bootfront.model.ClientPF;

@FeignClient(name = "clientService", url = "https://sandbox.conductor.com.br/pier/v2/api")
public interface ClientService {

	@RequestMapping(method = RequestMethod.POST, value = "/clientes-pessoas-fisicas", consumes = "application/json")
	ClientPF createClientPF(@RequestHeader Map<String, String> header, ClientPF clientPF);
}
