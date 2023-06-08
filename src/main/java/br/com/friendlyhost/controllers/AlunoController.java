package br.com.friendlyhost.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.friendlyhost.dto.AlunoDTO;
import br.com.friendlyhost.dto.AlunoMinDTO;
import br.com.friendlyhost.entities.Aluno;
import br.com.friendlyhost.services.AlunoService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;

	@DeleteMapping("/remover/{id}")
	public ResponseEntity<?> remover(@PathVariable long id){
		return alunoService.remover(id);
	}

	@PutMapping("/alterar")
	public ResponseEntity<Aluno> alterar(@RequestBody Aluno aluno){
		return alunoService.cadastrarAlterar(aluno, "alterar");
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<Aluno> cadastrar(@RequestBody Aluno aluno){
		return alunoService.cadastrarAlterar(aluno, "cadastrar");
	}
	
	
	@GetMapping(value = "/{id}")

	public AlunoMinDTO findDyId(@PathVariable Long id) {
		AlunoMinDTO result = alunoService.findById(id);

		return result;
	}

	@GetMapping
	public List<AlunoDTO> findAll() {
		List<AlunoDTO> result = alunoService.finAll();
		return result;
	}
}
