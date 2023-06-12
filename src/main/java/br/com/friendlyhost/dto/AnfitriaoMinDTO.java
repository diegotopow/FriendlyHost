package br.com.friendlyhost.dto;

import br.com.friendlyhost.entities.Anfitriao;

public class AnfitriaoMinDTO {
    
    private String nome;
    private String email;
    private String telefone;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;

    public AnfitriaoMinDTO() {
	
	}
    
    public AnfitriaoMinDTO(Anfitriao entity) {

        nome = entity.getNome();
        email = entity.getEmail();
        telefone = entity.getTelefone();
        cep = entity.getCep();
        logradouro = entity.getLogradouro();
        numero = entity.getNumero();
        bairro = entity.getBairro();
        cidade = entity.getCidade();
        estado = entity.getEstado();

    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}