package br.com.friendlyhost.dto;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;

import br.com.friendlyhost.entities.Anfitriao;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AnfitriaoDTO {
    
    private Long idAnfitriao;
    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String nacionalidade;
    private String responsavel;

    //Utiliza só os campos descritos da entidade
    public AnfitriaoDTO(Anfitriao entity){
        BeanUtils.copyProperties(entity, this);
    }
}
