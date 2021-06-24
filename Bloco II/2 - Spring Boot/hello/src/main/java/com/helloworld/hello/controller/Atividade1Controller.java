package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade1")
public class Atividade1Controller {

	@GetMapping
	public String atv1() {
		/*
		 * A aplicação deverá conter um end-point que retorna uma string 
		 * com as habilidades e mentalidades que você utilizou para realizar essa atividade.
		 */
		return "Para esta atividade utilizei a mentalidade de persistência e a habilidade de atenção aos detalhes.";
	}

}
