
public class FolhaPagamento {

	public static void main(String[] args) {
		
		Funcionario [] funcionarios = new Funcionario [4];
		
		funcionarios[0] = new Mensalista(123, "Machado de Assis", "Reporter", 3_456.78);
		funcionarios[1] = new Vendedor(456, "Rachel de Queiroz", 1234.56, 0.05, 30_000);
		funcionarios[2] = new Horista(789, "Clarice Lispector", "Professor", 40, 160);
		funcionarios[3] = new Vendedor(321, "Rubem Fonseca", 1234.56, 0.05, 50_000);
		for (Funcionario funcionario : funcionarios) {
			
			funcionario.calcularSalario();
			System.out.println("\n");
		}
	}
}
