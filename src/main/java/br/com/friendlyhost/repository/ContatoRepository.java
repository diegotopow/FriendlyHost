package br.com.friendlyhost.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.friendlyhost.entities.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{
    
}