package br.com.brunofernandes.folhapagamento_b.domain;

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

	public abstract String calcularSalario();
	
//	public void calcularSalario() {
//		
//		mostrarCabecalho();
//		double imposto = this.calcularImposto(this.salario);
//		System.out.println("Imposto............" + nf.format(imposto));
//		double liquido = this.salario - imposto;
//		System.out.println("Salário Líquido...." + nf.format(liquido));
//	}

	protected String mostrarCabecalho() {
                StringBuilder sb = new StringBuilder();
		sb.append("----------------------------------------");
		sb.append("    Instituto Infnet - Contracheque     ");
		sb.append("----------------------------------------");
		sb.append("Matrícula.........." + this.matricula);
		sb.append("Nome..............." + this.nome);
		sb.append("Cargo.............." + this.cargo);
//		sb.append("Salário Bruto......" + nf.format(this.salario));
            return sb.toString();
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
