package br.com.friendlyhost.dto;

import br.com.friendlyhost.entities.Anfitriao;

import java.time.LocalDate;

public class AnfitriaoDTO {
    
	private Long idAnfitriao;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;
    private String cep;
    private String logradouro;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;

    public AnfitriaoDTO() {
	
	}
    
    public AnfitriaoDTO(Anfitriao entity) {

        idAnfitriao = entity.getIdAnfitriao();
        nome = entity.getNome();
        cpf = entity.getCpf();
        dataNascimento = entity.getDataNascimento();
        email = entity.getEmail();
        telefone = entity.getTelefone();
        cep = entity.getCep();
        logradouro = entity.getLogradouro();
        numero = entity.getNumero();
        bairro = entity.getBairro();
        cidade = entity.getCidade();
        estado = entity.getEstado();

    }

    public Long getIdAnfitriao() {
        return idAnfitriao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
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