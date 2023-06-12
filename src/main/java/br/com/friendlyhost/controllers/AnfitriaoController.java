package br.com.friendlyhost.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.friendlyhost.dto.AnfitriaoDTO;
import br.com.friendlyhost.entities.Anfitriao;
import br.com.friendlyhost.services.AnfitriaoService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/anfitriao")
public class AnfitriaoController {
	
	@Autowired
	private AnfitriaoService anfitriaoService;
	
	@GetMapping
	public List<AnfitriaoDTO> findAll() {
		List<AnfitriaoDTO> result = anfitriaoService.finAll();
		return result;
	}
    
	// 07/06/2023
	// Testar esses métodos se funcionam
	//private final AnfitriaoService anfitriaoService;

    public AnfitriaoController(AnfitriaoService anfitriaoService) {
        this.anfitriaoService = anfitriaoService;
    }

	// Verificar este método se está em conflito com o das linhas...
    @PostMapping
    public ResponseEntity<String> cadastrarAnfitriao(@RequestBody Anfitriao anfitriao) {
        anfitriaoService.cadastrarAnfitriao(anfitriao);
        return ResponseEntity.ok("Anfitrião cadastrado com sucesso");
    }

    // Auth Anfitriao
    public void AuthController(AnfitriaoService anfitriaoService) {
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