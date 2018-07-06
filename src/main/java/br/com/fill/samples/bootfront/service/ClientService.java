package br.com.fill.samples.bootfront.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fill.samples.bootfront.bean.ClientPF;

@FeignClient(name = "clientService", url = "https://sandbox.conductor.com.br/pier/v2/api")
public interface ClientService {

	@RequestMapping("/clientes-pessoas-fisicas")
	ClientPF createClientPF();
}
