package entities;

import java.text.NumberFormat;

public class Funcionario {
	
	protected int matricula;
	protected String nome;
	protected String cargo;
	protected double salario;
	protected NumberFormat nf = NumberFormat.getCurrencyInstance();
	
	//Construtor
	public Funcionario() {}
	public Funcionario(int matricula, String nome, String cargo, double salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public void calcularSalario() {
		mostrarCabecalho();
		double imposto = this.calcularImposto(this.salario);
		System.out.printf("Imposto.........: %.2f\n", imposto);
		double liquido = this.salario - imposto;
		System.out.printf("Sal�rio L�quido.: %.2f\n", liquido);
	}
	protected void mostrarCabecalho() {
		System.out.println("------------------------------------");
		System.out.println(" Instituto INFNET - Contracheque ");
		System.out.println("------------------------------------");
		System.out.println("Matricula........: " + this.matricula);
		System.out.println("Nome.............: " + this.nome);
		System.out.println("Cargo............: " + this.cargo);
		System.out.println("Sal�rio Bruto....: " + nf.format(this.salario));
	}
	
	protected double calcularImposto(double valor) {
		double retorno = 0;
		if(valor > 1000 && valor <= 3000) {
			retorno = valor * 0.15;
		} else if(valor > 3000 && valor <= 6000) {
			retorno = valor * 0.2;
		} else if (valor > 6000) {
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
