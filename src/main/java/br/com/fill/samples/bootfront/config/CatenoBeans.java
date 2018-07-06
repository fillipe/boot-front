package br.com.fill.samples.bootfront.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CatenoBeans {

	@Bean
	public Map<String, String> serviceHeader() {
		Map<String, String> header = new HashMap<>();
		header.put("client_id", "stRHa17m7uxa");
		header.put("access_token", "Nj2Dl62aIBVB");
		return header;
	}
	
}
