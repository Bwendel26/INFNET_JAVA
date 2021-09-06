package br.edu.infnet.infra.usuarios;

import br.edu.infnet.domain.usuarios.Usuario;
import java.util.HashMap;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepository {
    
    private HashMap<String, Usuario> usuarios;
    
    public UsuarioRepository() {
        
        usuarios = new HashMap<>();
        usuarios.put("bruno@gmail.com", new Usuario("Bruno", "bruno@gmail.com", "2199999999"));
        usuarios.put("brunno@gmail.com", new Usuario("Brunno", "brunno@gmail.com", "2199999999"));
        
        
    }
    
    public Usuario obterPorEmail(String email) {
    
        return usuarios.get(email);
    }
    
    public Usuario inserir(Usuario usuario) {
        
        Usuario retorno = null;
        if (usuario.getEmail() != null && usuarios.get(usuario.getEmail()) == null) {
            usuarios.put(usuario.getEmail(), usuario);
            retorno = usuario;
        }
        
        return retorno;
    }
}
