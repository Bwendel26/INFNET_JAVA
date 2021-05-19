
public class Horista extends Funcionario {
	
	private double valorHora;
	private int totalHoras;

	public Horista(int matricula, String nome, String cargo, double valorHora, int totalHoras) {
		super(matricula, nome, cargo);
		this.valorHora = valorHora;
		this.totalHoras = totalHoras;
	}

	@Override
	public void calcularSalario() {
		
		mostrarCabecalho();
		double salarioBruto = valorHora * totalHoras;
		System.out.println("Salário Bruto......" + nf.format(salarioBruto));
		double imposto = calcularImposto(salarioBruto);
		System.out.println("Imposto............" + nf.format(imposto));
		double liquido = salarioBruto - imposto;
		System.out.println("Salário Líquido...." + nf.format(liquido));
	}
}
