package br.com.fill.samples.bootfront.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CatenoBeans {
	
	@Value("${cateno.pier.api.rest.clientid:nothing}")
	private String clientId;
	
	@Value("${cateno.pier.api.rest.accesstoken:nothing}")
	private String accessToken;

	@Bean
	public Map<String, String> serviceHeader() {
		Map<String, String> header = new HashMap<>();
		header.put("client_id", clientId);
		header.put("access_token", accessToken);
		return header;
	}
	
}
