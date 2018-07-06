package br.com.fill.samples.bootfront.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fill.samples.bootfront.bean.ProductResponse;
import br.com.fill.samples.bootfront.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private Map<String, String> header;

	@Autowired
	private ProductService productService;
	
	@GetMapping("/produtos")
    public ModelAndView home() {
		ProductResponse products = productService.getProducts(header);
		ModelAndView modelAndView = new ModelAndView("produtos");
		modelAndView.addObject("products", products);
        return modelAndView;
    }
}
