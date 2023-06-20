package br.com.friendlyhost.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_contato")
public class Contato {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContato;
    @Column(length = 50, nullable = false)// Tamanho Max campo; Campo Obrigatorio;
    private String nome;
    @Column(length = 50, nullable = false)
    private String email;
    @Column(nullable = false)
    @DateTimeFormat
    private LocalDate dataCadastro;
}