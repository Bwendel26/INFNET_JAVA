package br.edu.infnet.infra.contatos;

import br.edu.infnet.domain.contatos.Contato;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class ContatoRepository {

    private HashMap<Integer, Contato> contatos;

    public ContatoRepository() {

        contatos = new HashMap<>();
        contatos.put(1, new Contato(1, "Bruno", "bruno.fernandes@al.infnet.edu.br", "021988888881"));
        contatos.put(1, new Contato(2, "Jonas", "joao.fernandes@al.infnet.edu.br", "021988888882"));
        contatos.put(1, new Contato(3, "Bruno", "bruno.fernandes@al.infnet.edu.br", "021988888881"));
    }

    public Collection<Contato> listar() {
        return  contatos.values();
    }

    public Contato obter(int id) {

        return contatos.get(id);
    }
}
