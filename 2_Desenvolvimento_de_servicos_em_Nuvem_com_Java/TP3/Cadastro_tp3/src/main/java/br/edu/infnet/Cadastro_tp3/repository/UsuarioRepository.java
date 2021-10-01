package br.edu.infnet.Cadastro_tp3.repository;

import br.edu.infnet.Cadastro_tp3.domain.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}