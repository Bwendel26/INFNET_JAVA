import java.text.NumberFormat;

public abstract class Funcionario {
	
	protected int matricula;
	protected String nome;
	protected String cargo;
//	protected double salario;
	protected NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	//Construtor
	public Funcionario(int matricula, String nome, String cargo) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
//		this.salario = salario;
	}

	public abstract void calcularSalario();
	
//	public void calcularSalario() {
//		
//		mostrarCabecalho();
//		double imposto = this.calcularImposto(this.salario);
//		System.out.println("Imposto............" + nf.format(imposto));
//		double liquido = this.salario - imposto;
//		System.out.println("Salário Líquido...." + nf.format(liquido));
//	}

	protected void mostrarCabecalho() {
		System.out.println("----------------------------------------");
		System.out.println("    Instituto Infnet - Contracheque");
		System.out.println("----------------------------------------");
		System.out.println("Matrícula.........." + this.matricula);
		System.out.println("Nome..............." + this.nome);
		System.out.println("Cargo.............." + this.cargo);
//		System.out.println("Salário Bruto......" + nf.format(this.salario));
	}
	
	protected double calcularImposto(double valor) {
		
		double retorno = 0;
		if(valor > 1000 && valor <= 3000) {
			
			retorno = valor * 0.15;
		} else if(valor > 3000 && valor <= 6000) {
			
			retorno = valor * 0.2;
		} else if(valor > 6000) {
			
			retorno = valor * 0.25;
		}
		return retorno;
	}

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
//	public double getSalario() {
//		return salario;
//	}
//	public void setSalario(double salario) {
//		this.salario = salario;
//	}
}
