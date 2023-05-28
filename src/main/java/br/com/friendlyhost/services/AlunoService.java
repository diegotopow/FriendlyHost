package br.com.friendlyhost.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.friendlyhost.dto.AlunoDTO;
import br.com.friendlyhost.dto.AlunoMinDTO;
import br.com.friendlyhost.entities.Aluno;
import br.com.friendlyhost.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Transactional(readOnly = true)
	public AlunoDTO findById(Long id){
		Aluno result = alunoRepository.findById(id).get();
		return new AlunoDTO(result);

	}
	
	@Transactional(readOnly = true)
	public List<AlunoMinDTO> finAll(){
		List<Aluno> result = alunoRepository.findAll();
		List<AlunoMinDTO> dto = result.stream().map(x -> new AlunoMinDTO(x)).toList();
		return dto;
	}
}