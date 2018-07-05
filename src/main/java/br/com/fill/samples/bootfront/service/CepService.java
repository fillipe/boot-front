package br.com.fill.samples.bootfront.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fill.samples.bootfront.bean.Address;

@FeignClient(name = "cepService", url = "https://viacep.com.br")
public interface CepService {

	@RequestMapping("/ws/{cep}/json")
	Address getCep(@PathVariable("cep") String cep);
	
}
