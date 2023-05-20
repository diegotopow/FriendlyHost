package br.com.friendlyhost.entities;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
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
@Table(name = "tb_anfitriao")
public class Anfitriao {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnfitriao;
    @ForeignKey(name = "id_quarto")// Chave estrangeira
    private Long idQuarto;
    @Column(length = 50, nullable = false)// Tamanho Max campo; Campo Obrigatorio; O nome não pode se repetir.
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String cep;
    private String logradouro;
    private int numero;
    private String cidade;
    private String estado;
    private String nacionalidade;
    private String urlCompResi;
    private String bairro;
    private String conjuge;
    private String complemento;
    private Boolean estadoCivil;
    private DateTimeFormat dataNascimento;
    private String senha;
}