package br.edu.infnet.infra.contatos;

import br.edu.infnet.domain.contatos.Contato;
import java.util.Collection;
import java.util.HashMap;
import org.springframework.stereotype.Repository;

@Repository
public class ContatoRepository {
    
    private HashMap<Integer, Contato> contatos;
    private static int ids = 4;
    
    public ContatoRepository() {
        
        contatos = new HashMap<>();
        contatos.put(1, new Contato(1, "Machado de Assis", "machado@abl.org", "21228800"));
        contatos.put(2, new Contato(2, "Rachel de Queiroz", "rachel@gmail.com", "33448800"));
        contatos.put(3, new Contato(3, "Clarice Lispector", "clarice@yahoo.com", "99887766"));
    }
    
    public Collection<Contato> listar() {
        
        return contatos.values();
    }
    
    public Contato obter(int id) {
        
        return contatos.get(id);
    }
}
