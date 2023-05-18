package br.com.friendlyhost;

import dto.AlunoDTO;
import entities.Aluno;
import repository.AlunoRepository;
import services.AlunoService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FriendlyhostApplication {

	public static void main(String[] args) {
		SpringApplication.run(FriendlyhostApplication.class, args);
	}
}