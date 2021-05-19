package br.com.brunofernandes.folhapagamento_b.domain;


public class Horista extends Funcionario {
	
	private double valorHora;
	private int totalHoras;

	public Horista(int matricula, String nome, String cargo, double valorHora, int totalHoras) {
		super(matricula, nome, cargo);
		this.valorHora = valorHora;
		this.totalHoras = totalHoras;
	}

	@Override
	public String calcularSalario() {
                StringBuilder sb = new StringBuilder();
		sb.append(mostrarCabecalho());
		double salarioBruto = valorHora * totalHoras;
		sb.append("Salário Bruto......" + nf.format(salarioBruto));
		double imposto = calcularImposto(salarioBruto);
		sb.append("Imposto............" + nf.format(imposto));
		double liquido = salarioBruto - imposto;
		sb.append("Salário Líquido...." + nf.format(liquido));
                return sb.toString();
	}
}
