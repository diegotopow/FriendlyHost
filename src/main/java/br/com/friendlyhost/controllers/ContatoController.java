package br.com.friendlyhost.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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

import br.com.friendlyhost.entities.Contato;
import br.com.friendlyhost.services.ContatoService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/contatos")
public class ContatoController {
    
    @Autowired
	private ContatoService contatoService;

	@DeleteMapping("/remover/{id}")
	public ResponseEntity<?> remover(@PathVariable long id){
		return contatoService.remover(id);
	}

	@PutMapping("/alterar")
	public ResponseEntity<String> alterar(@RequestBody Contato contato){
        contatoService.cadastrarAlterar(contato, "alterar");
        return ResponseEntity.ok("Contato alterado com sucesso!");
	}

	@PostMapping("/cadastrar")
	public ResponseEntity<String> cadastrar(@RequestBody Contato contato){
        contatoService.cadastrarAlterar(contato, "cadastrar");
        return ResponseEntity.ok("Contato cadastrado com sucesso!");	
    }
	
	@GetMapping(value = "/{id}")
	public Contato findDyId(@PathVariable Long id) {
		Contato result = contatoService.findById(id);
		return result;
	}

	@GetMapping("/contatos")
	public List<Contato> findAll() {
		List<Contato> result = contatoService.finAll();
		return result;
	}
}