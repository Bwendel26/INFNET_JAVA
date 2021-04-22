package entities;

public class Vendedor extends Mensalista {
	
	private double comissao;
	private double totalVendas;
	
	public Vendedor() {
		super();
	}
	public Vendedor(int matricula, String nome, double salario,
			double comissao, double totalVendas) {
		super(matricula, nome, "Vendedor", salario);
		this.comissao = comissao;
		this.totalVendas = totalVendas;
	}
	
	@Override
	public void calcularSalario() {
		mostrarCabecalho();
		double comissaoBruta = totalVendas * comissao;
		System.out.println("Comissão.......:" + this.nf.format(comissaoBruta));
		double imposto = calcularImposto(this.salario + comissaoBruta);
		System.out.println("Imposto........:" + this.nf.format(imposto));
		double liquido = this.salario + comissaoBruta - imposto;
		System.out.println("Salário Líquido:" + this.nf.format(liquido));
	}
}
