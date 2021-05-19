
public class Mensalista extends Funcionario {
	
	protected double salario;

	public Mensalista(int matricula, String nome, String cargo, double salario) {
		
		super(matricula, nome, cargo);
		this.salario = salario;
	}

	@Override
	public void calcularSalario() {
		
		mostrarCabecalho();
		double imposto = this.calcularImposto(this.salario);
		System.out.println("Imposto............" + nf.format(imposto));
		double liquido = this.salario - imposto;
		System.out.println("Salário Líquido...." + nf.format(liquido));
	}
}
