package br.edu.infnet.app.usuarios;

import br.edu.infnet.domain.usuarios.Usuario;
import br.edu.infnet.infra.usuarios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;
    
    @GetMapping(path = {"/email/{email}"})
    public ResponseEntity obterUsuarioPorEmail(@PathVariable String email) {
        
        ResponseEntity retorno = ResponseEntity.notFound().build();
        Usuario usuario = this.repository.obterPorEmail(email);
        if (usuario != null) {
            
            retorno = ResponseEntity.ok().body(usuario);
        }
        return retorno;
    }
    
    @PostMapping
    public ResponseEntity criarConta(@RequestBody Usuario usuario) {
        
        ResponseEntity retorno = ResponseEntity.badRequest().build();
        
        Usuario novoUsuario = this.repository.inserir(usuario);
        if(novoUsuario == null) {
            
            retorno = ResponseEntity.ok().body(novoUsuario);
        }
        
        return retorno;
    }
}
