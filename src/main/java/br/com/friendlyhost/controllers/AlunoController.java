package br.com.friendlyhost.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.friendlyhost.dto.AlunoDTO;
import br.com.friendlyhost.services.AlunoService;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;
	
	@GetMapping
	public List<AlunoDTO> findAll() {
		List<AlunoDTO> result = alunoService.finAll();
		return result;
	}
}
