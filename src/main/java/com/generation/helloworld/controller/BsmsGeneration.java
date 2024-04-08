package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm-generation")
public class BsmsGeneration {
	@GetMapping
	public List<String> bsms() {
		return Arrays.asList("BSM’s da Generation Brasil!" 
				+ "1- Comunicação Ativa "
				+ " 2- Responsabilidade Profissional "
				+ " 3- Trabalho em Equipe "
				+ " 4- Comunicação não violenta"); 
		
	}
	
}
