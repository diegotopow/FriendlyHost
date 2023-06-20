package br.com.friendlyhost.entities;

import java.time.LocalDate;

import javax.persistence.*;
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
    //@ForeignKey(name = "id_quarto")// Chave estrangeira
    private Long idQuarto;
    @Column(length = 50, nullable = false)// Tamanho Max campo; Campo Obrigatorio
    private String nome;
    @Column(length = 12, nullable = false)
    private String cpf;
    @Column(length = 50, nullable = false)
    private String email;
    @Column(length = 15, nullable = false)
    private String telefone;
    @Column(length = 9, nullable = false)
    private String cep;
    @Column(length = 30, nullable = false)
    private String logradouro;
    @Column(length = 10, nullable = false)
    private int numero;
    @Column(length = 20, nullable = false)
    private String cidade;
    @Column(length = 2, nullable = false)
    private String estado;
    @Column(length = 30, nullable = false)
    private String nacionalidade;
    @Column(length = 255, nullable = false)
    private String urlCompResi;
    @Column(length = 20, nullable = false)
    private String bairro;
    @Column(length = 50, nullable = false)
    private String conjuge;
    @Column(length = 30, nullable = false)
    private String complemento;
    @Column(length = 10, nullable = false)
    private String estadoCivil;
    @Column(nullable = false)
    private LocalDate dataNascimento;
    @Column(length = 10, nullable = false)
    private String senha;
}