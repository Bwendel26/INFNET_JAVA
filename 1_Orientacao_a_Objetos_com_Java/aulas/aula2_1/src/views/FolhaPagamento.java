package views;

import entities.Funcionario;
import entities.Horista;
import entities.Mensalista;
import entities.Vendedor;

public class FolhaPagamento {
	
	public static void main(String[] args) {
		
		Funcionario [] funcionarios = new Funcionario [3];
		
		funcionarios[0] = new Mensalista(123, "Marco", "reporter", 1_000.50);
		funcionarios[1] = new Vendedor(456, "Alberto", 1000.56, 0.05, 30_000);
		funcionarios[2] = new Horista(789, "Horacio", "Programador", 55, 160);
		
		for (Funcionario funcionario: funcionarios) {
			funcionario.calcularSalario();
			System.out.println("\n\n");
		}
	}
}
