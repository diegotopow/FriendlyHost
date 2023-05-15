package br.com.friendlyhost.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.friendlyhost.dto.AlunoDTO;
import br.com.friendlyhost.entities.Aluno;
import br.com.friendlyhost.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public List<AlunoDTO> finAll(){
		List<Aluno> result = alunoRepository.findAll();
		List<AlunoDTO> dto = result.stream().map(x -> new AlunoDTO(x)).toList();
		return dto;
	}
}
