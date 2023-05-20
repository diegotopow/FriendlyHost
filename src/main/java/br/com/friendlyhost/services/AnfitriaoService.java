package br.com.friendlyhost.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.friendlyhost.dto.AnfitriaoDTO;
import br.com.friendlyhost.entities.Anfitriao;
import br.com.friendlyhost.repository.AnfitriaoRepository;

@Service
public class AnfitriaoService {
    
    @Autowired
	private AnfitriaoRepository anfitriaoRepository;
	
	public List<AnfitraoDTO> finAll(){
		List<Anfitriao> result = anfitriaoRepository.findAll();
		List<AnfitriaoDTO> dto = result.stream().map(x -> new AnfitriaoDTO(x)).toList();
		return dto;
	}
}