package br.com.friendlyhost.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_aluno")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAluno;
	@Column(length = 50, nullable = false)// Tamanho Max campo; Campo Obrigatorio; O nome não pode se repetir.
    private String nome;
    @Column(length = 12, nullable = false)
    private String cpf;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    @Column(length = 50, nullable = false)
    private String email;
    @Column(length = 15, nullable = false)
    private String telefone;
    @Column(length = 9, nullable = false)
    private String cep;
    @Column(length = 30, nullable = false)
    private String logradouro;
    @Column(length = 10, nullable = false)
    private Integer numero;
    @Column(length = 30, nullable = false)
    private String complemento;
    @Column(length = 20, nullable = false)
    private String bairro;
    @Column(length = 20, nullable = false)
    private String cidade;
    @Column(length = 2, nullable = false)
    private String estado;
    @Column(length = 30, nullable = false)
    private String nacionalidade;
    @Column(length = 50, nullable = false)
    private String responsavel;
    @Column(length = 255, nullable = false)
    private String urlComprovanteMatri;
    @Column(length = 10, nullable = false)
    private String senha;
   
}
