package br.com.friendlyhost.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.friendlyhost.dto.AnfitriaoDTO;
import br.com.friendlyhost.services.AnfitriaoService;

@RestController
@RequestMapping(value = "/anfitriao")
public class AnfitriaoController {
	
	@Autowired
	private AnfitriaoService anfitriaoService;
	
	@GetMapping
	public List<AnfitriaoDTO> findAll() {
		List<AnfitriaoDTO> result = anfitriaoService.finAll();
		return result;
	}
    
}