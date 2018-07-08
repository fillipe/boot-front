package br.com.fill.samples.bootfront.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fill.samples.bootfront.model.Address;
import br.com.fill.samples.bootfront.model.ClientPF;
import br.com.fill.samples.bootfront.model.Phone;
import br.com.fill.samples.bootfront.service.ClientService;

@Controller
@RequestMapping("/cliente")
public class ClientController {
	
	@Autowired
	private Map<String, String> header;
	
	@Autowired
	private ClientService clientService;
	
	@GetMapping("/pf/create")
    public String clientPF(final ClientPF clientPF) {
        return "clientes-pessoas-fisicas";
    }
	
	@RequestMapping(value="/pf/create", params={"save"})
    public ModelAndView generateCard(ClientPF clientPF) {
		ClientPF clientPFGenerated = clientService.createClientPF(header, clientPF);
		ModelAndView modelAndView = new ModelAndView("clientes-pessoas-fisicas");
		modelAndView.addObject("clientPF", clientPFGenerated);
		return modelAndView;
    }
	
	@RequestMapping(value="/pf/create", params={"addPhone"})
    public String addPhone(final ClientPF clientPF, final BindingResult bindingResult) {
		clientPF.getTelefones().add(new Phone());
        return "clientes-pessoas-fisicas";
    }
    
    
    @RequestMapping(value="/pf/create", params={"removePhone"})
    public String removePhone(final ClientPF clientPF, final BindingResult bindingResult, final HttpServletRequest req) {
        final Integer rowId = Integer.valueOf(req.getParameter("removePhone"));
        clientPF.getTelefones().remove(rowId.intValue());
        return "clientes-pessoas-fisicas";
    }
    
    @RequestMapping(value="/pf/create", params={"addAddress"})
    public String addRow(final ClientPF clientPF, final BindingResult bindingResult) {
		clientPF.getEnderecos().add(new Address());
        return "clientes-pessoas-fisicas";
    }
    
    
    @RequestMapping(value="/pf/create", params={"removeAddress"})
    public String removeRow(final ClientPF clientPF, final BindingResult bindingResult, final HttpServletRequest req) {
        final Integer rowId = Integer.valueOf(req.getParameter("removeAddress"));
        clientPF.getEnderecos().remove(rowId.intValue());
        return "clientes-pessoas-fisicas";
    }

}
