package br.com.friendlyhost.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	
	// Cadastrar / Alterar
	public ResponseEntity<Aluno> cadastrarAlterar(Aluno aluno, String acao){
		if(acao.equals("cadastrar")){
			return new ResponseEntity<Aluno>(alunoRepository.save(aluno), HttpStatus.CREATED);
		}else{
			return new ResponseEntity<Aluno>(alunoRepository.save(aluno), HttpStatus.OK);
		} 
		
	}

	// Listar por id
	@Transactional(readOnly = true)
	public AlunoMinDTO findById(Long id){
		Aluno result = alunoRepository.findById(id).get();
		return new AlunoMinDTO(result);
	}
	
	// Listar todos
	@Transactional(readOnly = true)
	public List<AlunoDTO> finAll(){
		List<Aluno> result = alunoRepository.findAll();
		List<AlunoDTO> dto = result.stream().map(x -> new AlunoDTO(x)).toList();
		return dto;
	}

	// Método para remover produtos
	public ResponseEntity<?> remover(long id){
		
		alunoRepository.deleteById(id);
		System.out.print("Aluno removido com sucesso!");
		return new ResponseEntity<>("Aluno removido com sucesso!", HttpStatus.OK);
		
	}
}