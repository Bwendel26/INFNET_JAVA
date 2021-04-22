package entities;

public class Mensalista extends Funcionario{
	
	protected double salario;

	public Mensalista() {
		super();
	}
	public Mensalista(int matricula, String nome, String cargo, double salario) {
		super(matricula, nome, cargo);
		this.salario = salario;
	}
	
	@Override
	public void calcularSalario() {
		mostrarCabecalho();
		double imposto = this.calcularImposto(this.salario);
		System.out.printf("Imposto.........: %.2f\n", imposto);
		double liquido = this.salario - imposto;
		System.out.printf("Salário Líquido.: %.2f\n", liquido);
	}
	
}
