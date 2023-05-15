package br.com.friendlyhost.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.friendlyhost.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
