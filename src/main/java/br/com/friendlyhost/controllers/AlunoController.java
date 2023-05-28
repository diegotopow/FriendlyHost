package br.com.friendlyhost.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.friendlyhost.dto.AlunoDTO;
import br.com.friendlyhost.dto.AlunoMinDTO;
import br.com.friendlyhost.entities.Aluno;
import br.com.friendlyhost.services.AlunoService;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;

	@PostMapping("/cadastrar")
	public ResponseEntity<?> cadastrar(@RequestBody Aluno aluno){
		return alunoService.cadastrar(aluno);
	}
	
	
	@GetMapping(value = "/{id}")
	public AlunoDTO findDyId(@PathVariable Long id) {
		AlunoDTO result = alunoService.findById(id);
		return result;
	}

	@GetMapping
	public List<AlunoMinDTO> findAll() {
		List<AlunoMinDTO> result = alunoService.finAll();
		return result;
	}
}
