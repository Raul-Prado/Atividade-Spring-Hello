package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/objettivos")
public class Objetivos {

		@GetMapping
		public List<String> Objetivo(){
			return Arrays.asList("Entregar as atividades atrasadas", "Aprimorar habilidades em Java", "Procurar Emprego");
		}
		
	
}
