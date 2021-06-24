package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade2")
public class Atividade2Controller {

	@GetMapping
	public String atv2() {
		/*
		 * A aplicação deverá conter um end-point que retorna uma string 
		 * com os seus objetivos de aprendizagem para essa semana.
		 */
		return "Meus objetivo de aprendizagem para esta semana são aprender a fazer aplicação em Java, conectando com o banco de dados MySQL e utilizando o Spring.";
	}
}
