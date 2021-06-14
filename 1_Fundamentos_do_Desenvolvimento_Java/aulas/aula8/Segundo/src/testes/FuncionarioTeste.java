package testes;

import entities.Funcionario;

/**
 * @author Bwendel
 *
 */

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Bruno");
		funcionario1.setIdade(22);
		funcionario1.setSalario(1000);
		funcionario1.setBonus(20);
		funcionario1.setDesconto(60);
		funcionario1.exibir();
		
		Funcionario funcionario2 = new Funcionario("Leo", 25, 1000);
		funcionario2.setBonus(50);
		funcionario2.setDesconto(60);
		funcionario2.exibir();
		
		Funcionario funcionario3 = new Funcionario("Daniel", 30, 1500, 200, 100);
		funcionario3.exibir();
	}
}
