package br.com.friendlyhost.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.friendlyhost.entities.Contato;
import br.com.friendlyhost.repository.ContatoRepository;

@Service
public class ContatoService {

    @Autowired
	private ContatoRepository contatoRepository;
	
	// Cadastrar / Alterar Contato
	public ResponseEntity<Contato> cadastrarAlterar(Contato contato, String acao){
		if(acao.equals("cadastrar")){
			return new ResponseEntity<Contato>(contatoRepository.save(contato), HttpStatus.CREATED);
		}else{
			return new ResponseEntity<Contato>(contatoRepository.save(contato), HttpStatus.OK);
		} 		
	}

	// Listar todos
	@Transactional(readOnly = true)
	public List<Contato> finAll(){
		List<Contato> result = contatoRepository.findAll();
		//List<Contato> dto = result.stream().map(x -> new AnfitriaoDTO(x)).toList();
		return result;
	}
	// Lista por id
	@Transactional(readOnly = true)
	public Contato findById(Long id) {
		return contatoRepository.findById(id).get();
	}

	// Método para remover Contato
	public ResponseEntity<?> remover(long id){
		contatoRepository.deleteById(id);
		return new ResponseEntity<>("Contato removido com sucesso!", HttpStatus.OK);
	}

    
}