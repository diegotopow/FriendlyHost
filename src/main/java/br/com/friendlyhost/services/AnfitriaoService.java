package br.com.friendlyhost.services;

import br.com.friendlyhost.dto.AnfitriaoDTO;
import br.com.friendlyhost.dto.AnfitriaoMinDTO;
import br.com.friendlyhost.entities.Anfitriao;
import br.com.friendlyhost.repository.AnfitriaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnfitriaoService {

    @Autowired
	private AnfitriaoRepository anfitriaoRepository;
	
	// Cadastrar / Alterar Anfitriao
	public ResponseEntity<Anfitriao> cadastrarAlterar(Anfitriao anfitriao, String acao){
		if(acao.equals("cadastrar")){
			return new ResponseEntity<Anfitriao>(anfitriaoRepository.save(anfitriao), HttpStatus.CREATED);
		}else{
			return new ResponseEntity<Anfitriao>(anfitriaoRepository.save(anfitriao), HttpStatus.OK);
		} 		
	}

	// Listar por id
	@Transactional(readOnly = true)
	public AnfitriaoMinDTO findById(Long id){
		Anfitriao result = anfitriaoRepository.findById(id).get();
		return new AnfitriaoMinDTO(result);
	}
	
	// Listar todos
	@Transactional(readOnly = true)
	public List<AnfitriaoDTO> finAll(){
		List<Anfitriao> result = anfitriaoRepository.findAll();
		List<AnfitriaoDTO> dto = result.stream().map(x -> new AnfitriaoDTO(x)).toList();
		return dto;
	}

	// Método para remover Anfitriao
	public ResponseEntity<?> remover(long id){
		anfitriaoRepository.deleteById(id);
		System.out.print("Anfitrião removido com sucesso!");
		return new ResponseEntity<>("Anfitrião removido com sucesso!", HttpStatus.OK);
	}

	// 07/06/2023
	// Testar esses métodos se funcionam
	//private final AnfitriaoRepository anfitriaoRepository;

    public AnfitriaoService(AnfitriaoRepository anfitriaoRepository) {
        this.anfitriaoRepository = anfitriaoRepository;
    }

    public void cadastrarAnfitriao(Anfitriao anfitriao) {
        // Verificar se o anfitrião já existe pelo CPF ou qualquer outro campo único
        if (anfitriaoRepository.existsByCpf(anfitriao.getCpf())) {
            throw new RuntimeException("CPF já cadastrado");
        }

        // Lógica para salvar o anfitrião no banco de dados
        anfitriaoRepository.save(anfitriao);
    }

    public boolean autenticarAnfitriao(String cpf, String senha) {
        // Buscar o anfitrião pelo CPF
        Anfitriao anfitriao = anfitriaoRepository.findByCpf(cpf);
        if (anfitriao == null) {
            return false; // Anfitrião não encontrado
        }

        // Verificar se a senha está correta
        return anfitriao.getSenha().equals(senha);
    }

}