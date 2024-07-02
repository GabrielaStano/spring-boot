package com.generation.BSM.s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsms")
public class BsmsController {
	
	@GetMapping
	public String bsms() {
		return "Persistência\r\n"
				+ "Orientação ao futuro\r\n"
				+ "Responsabilidade Pessoal\r\n"
				+ "Gestão de tempo\r\n"
				+ "Comunicação\r\n"
				+ "Proatividade\r\n"
				+ "Orientação ao detalhe\r\n"
				+ "Trabalho em equipe";
	}
	
	
}
