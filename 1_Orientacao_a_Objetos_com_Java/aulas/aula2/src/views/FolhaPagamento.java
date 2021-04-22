package views;

import entities.Funcionario;
import entities.Vendedor;

public class FolhaPagamento {
	
	public static void main(String[] args) {
		
		Funcionario [] funcionarios = new Funcionario [2];
		
		funcionarios[0] = new Funcionario(123, "Marco", "reporter", 1_000.50);
		funcionarios[1] = new Vendedor(456, "Alberto", 1000.56, 0.05, 30_000);
		
		for (Funcionario funcionario: funcionarios) {
			funcionario.calcularSalario();
			System.out.println("\n\n");
		}
	}
}
