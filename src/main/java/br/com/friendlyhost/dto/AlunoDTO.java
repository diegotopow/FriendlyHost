package br.com.friendlyhost.dto;

import java.time.LocalDate;

import br.com.friendlyhost.entities.Aluno;

public class AlunoDTO {
	
	private Long idAluno;
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
	
    public AlunoDTO() {
	
	}

	public AlunoDTO(Aluno entity) {
	
		idAluno = entity.getIdAluno();
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

	public Long getIdAluno() {
		return idAluno;
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