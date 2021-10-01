package br.edu.infnet.VenturaHrUsuario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.VenturaHrUsuario.model.domain.Endereco;
import br.edu.infnet.VenturaHrUsuario.model.domain.Usuario;
import br.edu.infnet.VenturaHrUsuario.model.service.EnderecoService;
import br.edu.infnet.VenturaHrUsuario.model.service.UsuarioService;

@RestController
@RequestMapping(path = {"/usuario"})
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private EnderecoService enderecoService;

	@PostMapping("/")
	public ResponseEntity<?> logar(Usuario user) {
		
		user = usuarioService.validar(user.getEmail(), user.getSenha());
		ResponseEntity<?> retorno = ResponseEntity.ok().body(user);
		
		return retorno;
	}
	
	@PostMapping(value="/cadastro")
	public ResponseEntity<?> cadastro(Usuario user) {
		
		Endereco endereco = enderecoService.obterPorCep(user.getCep());
		
		user.setEndereco(endereco.getCep());
		usuarioService.adicionar(user);
		
		ResponseEntity<?> retorno = ResponseEntity.ok().body(user);
		return retorno;
	}
	
	@DeleteMapping(value="/{id}/remove")
	public ResponseEntity<?> remove(Usuario user, @PathVariable int id) {
		
		usuarioService.excluir(id);
		
		ResponseEntity<?> retorno = ResponseEntity.ok().body(user);
		return retorno;
	}
}