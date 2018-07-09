package br.com.fill.samples.bootfront.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fill.samples.bootfront.model.Address;
import br.com.fill.samples.bootfront.model.ClientPF;
import br.com.fill.samples.bootfront.model.Phone;
import br.com.fill.samples.bootfront.service.ClientService;
import feign.FeignException;

@Controller
@RequestMapping("/cliente")
public class ClientController {
	
	@Autowired
	private Map<String, String> header;
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/pf/create")
    public ModelAndView clientPF(final ClientPF clientPF) {
        return clientePessoaFisicaMV();
    }

	@RequestMapping(value="/pf/create", params={"save"})
    public ModelAndView generateCard(ClientPF clientPF) {
		ModelAndView modelAndView = clientePessoaFisicaMV();
		try {
			ClientPF clientPFGenerated = clientService.createClientPF(header, clientPF);
			modelAndView.addObject("responseStatus", HttpStatus.OK.value());
			modelAndView.addObject("clientPF", clientPFGenerated);
		} catch(FeignException e) {
			modelAndView.addObject("returnMessage", e.getMessage());
		}
		return modelAndView;
    }
	
	@RequestMapping(value="/pf/create", params={"addPhone"})
    public ModelAndView addPhone(final ClientPF clientPF, final BindingResult bindingResult) {
		clientPF.getTelefones().add(new Phone());
        return clientePessoaFisicaMV();
    }
    
    
    @RequestMapping(value="/pf/create", params={"removePhone"})
    public ModelAndView removePhone(final ClientPF clientPF, final BindingResult bindingResult, final HttpServletRequest req) {
        final Integer rowId = Integer.valueOf(req.getParameter("removePhone"));
        clientPF.getTelefones().remove(rowId.intValue());
        return clientePessoaFisicaMV();
    }
    
    @RequestMapping(value="/pf/create", params={"addAddress"})
    public ModelAndView addRow(final ClientPF clientPF, final BindingResult bindingResult) {
		clientPF.getEnderecos().add(new Address());
        return clientePessoaFisicaMV();
    }
    
    @RequestMapping(value="/pf/create", params={"removeAddress"})
    public ModelAndView removeRow(final ClientPF clientPF, final BindingResult bindingResult, final HttpServletRequest req) {
        final Integer rowId = Integer.valueOf(req.getParameter("removeAddress"));
        clientPF.getEnderecos().remove(rowId.intValue());
        return clientePessoaFisicaMV();
    }
    
    private ModelAndView clientePessoaFisicaMV() {
		ModelAndView modelAndView = new ModelAndView("clientes-pessoas-fisicas");
		modelAndView.addObject("returnMessage", "");
		modelAndView.addObject("responseStatus", "");
		return modelAndView;
	}

}
