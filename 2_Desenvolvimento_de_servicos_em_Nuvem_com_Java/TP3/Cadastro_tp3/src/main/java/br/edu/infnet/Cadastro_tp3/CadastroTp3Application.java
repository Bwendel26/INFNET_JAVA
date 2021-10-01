package br.edu.infnet.Cadastro_tp3;

import br.edu.infnet.Cadastro_tp3.domain.Usuario;
import br.edu.infnet.Cadastro_tp3.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CadastroTp3Application implements CommandLineRunner {

	private final UsuarioRepository repository;

	public CadastroTp3Application(UsuarioRepository repository) {
		this.repository = repository;
	}

	public static void main(String[] args) {
		SpringApplication.run(CadastroTp3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
