package br.edu.infnet.Cadastro_tp3.service;

import br.edu.infnet.Cadastro_tp3.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class CrudUsuarioService {

    private final UsuarioRepository repository;

    public CrudUsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salvar() {
        
    }
}
