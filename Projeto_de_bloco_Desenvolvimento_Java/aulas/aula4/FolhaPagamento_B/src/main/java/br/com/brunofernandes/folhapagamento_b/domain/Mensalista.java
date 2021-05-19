package br.com.brunofernandes.folhapagamento_b.domain;


public class Mensalista extends Funcionario {
	
	protected double salario;

	public Mensalista(int matricula, String nome, String cargo, double salario) {
		
		super(matricula, nome, cargo);
		this.salario = salario;
	}

	@Override
	public String calcularSalario() {
		
                StringBuilder sb = new StringBuilder();
                sb.append(mostrarCabecalho());
                sb.append("Salário Bruto......" + nf.format(salario));
		double imposto = this.calcularImposto(this.salario);
		sb.append("Imposto............" + nf.format(imposto));
		double liquido = this.salario - imposto;
		sb.append("Salário Líquido...." + nf.format(liquido));
                return sb.toString();
	}
}
