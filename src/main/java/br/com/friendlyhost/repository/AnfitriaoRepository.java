package br.com.friendlyhost.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.friendlyhost.entities.Anfitriao;

public interface AnfitriaoRepository extends JpaRepository<Anfitriao, Long> {

    boolean existsByCpf(String cpf);

    Anfitriao findByCpf(String cpf);
}