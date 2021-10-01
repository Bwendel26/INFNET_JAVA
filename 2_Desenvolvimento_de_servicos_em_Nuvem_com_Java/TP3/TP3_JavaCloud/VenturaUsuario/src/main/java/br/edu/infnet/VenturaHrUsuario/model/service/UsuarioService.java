package br.edu.infnet.VenturaHrUsuario.model.service;

import br.edu.infnet.VenturaHrUsuario.model.domain.Usuario;
import br.edu.infnet.VenturaHrUsuario.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public Usuario validar(String email, String senha) {
		return usuarioRepository.autentica(email, senha);
	}

	public void adicionar(Usuario user) {
		usuarioRepository.save(user);
	}
	
	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}
	
	public List<Usuario> obterLista(){
		return (List<Usuario>) usuarioRepository.findAll();
	}
}