package br.edu.infnet.VenturaHrUsuario;

import br.edu.infnet.VenturaHrUsuario.model.domain.Usuario;
import br.edu.infnet.VenturaHrUsuario.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(ApplicationArguments args) {

        try {
            Usuario user = new Usuario();
            user.setNome("Bruno");
            user.setEmail("bruno@gmail.com");
            user.setSenha("1234");
            user.setTipo('A');
            usuarioService.adicionar(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
