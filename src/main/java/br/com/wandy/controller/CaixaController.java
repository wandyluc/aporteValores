package br.com.wandy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.wandy.model.Beneficiario;
import br.com.wandy.repository.ICalculo;

@RestController
public class CaixaController {
	
	@Autowired
	private ICalculo repository;
	
	@PostMapping("/calculo")
	Beneficiario saldo(@RequestBody Beneficiario param) {
		return repository.saldoCalculado(param);		
	}

}
