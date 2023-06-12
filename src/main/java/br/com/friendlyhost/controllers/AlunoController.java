package br.com.friendlyhost.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
	public ResponseEntity<String> alterarAluno(@RequestBody Aluno aluno) {
        alunoService.cadastrarAlterar(aluno, "alterar");
        return ResponseEntity.ok("Aluno alterado com sucesso!");
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<String> cadastrarAluno(@RequestBody Aluno aluno) {
        alunoService.cadastrarAlterar(aluno, "cadastrar");
        return ResponseEntity.ok("Aluno cadastrado com sucesso!");
	}

	@GetMapping(value = "/{Id}")
	public AlunoMinDTO findById(@PathVariable Long Id) {
		AlunoMinDTO result = alunoService.findById(Id);
		return result;
	}

	@GetMapping
	public List<AlunoDTO> findAll() {
		List<AlunoDTO> result = alunoService.finAll();
		return result;
	}

	// Auth Aluno
		public void AuthController(AlunoService alunoService) {
		this.alunoService = alunoService;
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestParam String cpf, @RequestParam String senha) {
		boolean autenticado = alunoService.autenticarAluno(cpf, senha);
		if (autenticado) {
	    	return ResponseEntity.ok("Login bem-sucedido");
	    } else {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciais inválidas");
		}
	}

}