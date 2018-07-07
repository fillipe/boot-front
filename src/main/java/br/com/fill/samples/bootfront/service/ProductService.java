package br.com.fill.samples.bootfront.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fill.samples.bootfront.model.ProductResponse;

@FeignClient(name = "productService", url = "https://sandbox.conductor.com.br/pier/v2/api")
public interface ProductService {

	@RequestMapping("/produtos")
	ProductResponse getProducts(@RequestHeader Map<String, String> header);
}
