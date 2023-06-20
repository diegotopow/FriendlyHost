package br.com.friendlyhost.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.friendlyhost.dto.AnfitriaoDTO;
import br.com.friendlyhost.dto.AnfitriaoMinDTO;
import br.com.friendlyhost.entities.Anfitriao;
import br.com.friendlyhost.services.AnfitriaoService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/anfitriao")
public class AnfitriaoController {
	
	@Autowired
	private AnfitriaoService anfitriaoService;
	
    @PostMapping("/cadastrar")
    public ResponseEntity<String> cadastrarAnfitriao(@RequestBody Anfitriao anfitriao) {
        anfitriaoService.cadastrarAlterar(anfitriao, "cadastrar");
        return ResponseEntity.ok("Anfitrião cadastrado com sucesso");
    }

    @PutMapping("/alterar")
	public ResponseEntity<String> alterarAnfitriao(@RequestBody Anfitriao anfitriao) {
        anfitriaoService.cadastrarAlterar(anfitriao, "alterar");
        return ResponseEntity.ok("Anfitrião alterado com sucesso!");
	}

	@GetMapping
	public List<AnfitriaoDTO> findAll() {
		List<AnfitriaoDTO> result = anfitriaoService.finAll();
		return result;
	}

    @GetMapping(value = "/{Id}")
	public AnfitriaoMinDTO findById(@PathVariable Long Id) {
		AnfitriaoMinDTO result = anfitriaoService.findById(Id);
		return result;
	}
    
    @DeleteMapping("/remover/{id}")
	public ResponseEntity<?> remover(@PathVariable long id){
		return anfitriaoService.remover(id);
	}

	// Login Anfitriao
    public AnfitriaoController(AnfitriaoService anfitriaoService) {
        this.anfitriaoService = anfitriaoService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String cpf, @RequestParam String senha) {
        boolean autenticado = anfitriaoService.autenticarAnfitriao(cpf, senha);
        if (autenticado) {
            return ResponseEntity.ok("Login bem-sucedido");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciais inválidas");
        }
    }

}