package com.generation.Objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {

	@GetMapping
	public String objetivos() {
		return " Objetivos de aprendizagem da semana:\n"
				+ "- Ser pontual;\n"
				+ "- Fazer todos os exercícios;\n"
				+ "- Participar da monitoria;\n"
				+ "- Fazer exercícios a parte para revisar o conteúdo.\n ";
				
	}
}
