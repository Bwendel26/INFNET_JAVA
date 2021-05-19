
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
	public void calcularSalario() {	
		
		mostrarCabecalho();
		double comissaoBruta = totalVendas * comissao;
		System.out.println("Comissão..........." + nf.format(comissaoBruta));
		double imposto = calcularImposto(this.salario + comissaoBruta);
		System.out.println("Imposto............" + nf.format(imposto));
		double liquido = this.salario+comissaoBruta-imposto;
		System.out.println("Salário Líquido...." + nf.format(liquido));
	}
}
