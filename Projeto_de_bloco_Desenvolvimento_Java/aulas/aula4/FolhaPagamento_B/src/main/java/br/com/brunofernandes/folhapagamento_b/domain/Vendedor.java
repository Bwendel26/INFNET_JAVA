package br.com.brunofernandes.folhapagamento_b.domain;


public class Vendedor extends Mensalista {
	
	private double comissao;//percentual de comissão
	private double totalVendas;

	public Vendedor(int matricula, String nome, double salario, 
			double comissao, double totalVendas) {
		
		super(matricula, nome, "Vendedor", salario);
		this.comissao = comissao;
		this.totalVendas = totalVendas;
	}

	@Override
	public String calcularSalario() {	
		StringBuilder sb = new StringBuilder();
		sb.append(mostrarCabecalho());
                sb.append("Salário Bruto......" + nf.format(salario));
		double comissaoBruta = totalVendas * comissao;
		sb.append("Comissão..........." + nf.format(comissaoBruta));
		double imposto = calcularImposto(this.salario + comissaoBruta);
		sb.append("Imposto............" + nf.format(imposto));
		double liquido = this.salario+comissaoBruta-imposto;
		sb.append("Salário Líquido...." + nf.format(liquido));
                
                return sb.toString();
	}
}
