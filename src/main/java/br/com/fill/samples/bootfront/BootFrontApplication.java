package br.com.fill.samples.bootfront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.com.fill.samples.bootfront.controller.HomeController;

@SpringBootApplication
public class BootFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootFrontApplication.class, args);
	}
}
