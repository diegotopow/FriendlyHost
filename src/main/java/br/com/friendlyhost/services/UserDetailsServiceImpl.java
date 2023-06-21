package br.com.friendlyhost.services;

import br.com.friendlyhost.entities.Aluno;
import br.com.friendlyhost.entities.Anfitriao;
import br.com.friendlyhost.repository.AlunoRepository;
import br.com.friendlyhost.repository.AnfitriaoRepository;
import br.com.friendlyhost.repository.UserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private final AlunoRepository alunoRepository;
    private final AnfitriaoRepository anfitriaoRepository;

    public UserDetailsServiceImpl(AlunoRepository alunoRepository, AnfitriaoRepository anfitriaoRepository) {
        this.alunoRepository = alunoRepository;
        this.anfitriaoRepository = anfitriaoRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Aluno aluno = alunoRepository.findByCpf(username);
        if (aluno != null) {
            return User.builder()
                    .username(aluno.getCpf())
                    .password(aluno.getSenha())
                    .roles("ALUNO")
                    .build();
        }

        Anfitriao anfitriao = anfitriaoRepository.findByCpf(username);
        if (anfitriao != null) {
            return User.builder()
                    .username(anfitriao.getCpf())
                    .password(anfitriao.getSenha())
                    .roles("ANFITRIAO")
                    .build();
        }

        throw new UsernameNotFoundException("Usuário não encontrado");
    }
}