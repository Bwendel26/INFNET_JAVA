package entities;

import entities.auxiliar.Constante;
/**
 * @author Bwendel
 *
 */

public class Funcionario {

	private String nome;
	private int idade;
	private float salario;
	private float bonus;
	private float desconto;

	public Funcionario() {
		nome = "Fantasma";
	}

	public Funcionario(String nome) {
		this.nome = nome;
	}  
	
	public Funcionario(String nome, int idade, float salario) {
		this(nome);
		this.idade = idade;
		this.salario = salario;
	}
	
	public Funcionario(String nome, int idade, float salario, float bonus, float desconto) {
		this(nome, idade, salario);
		this.bonus = bonus;
		this.desconto = desconto;
	}

	private float calcularSalario() {
		return salario + bonus - desconto;
	}

	private String getSituacao(float salarioLiquido) {
		return salarioLiquido > Constante.SALARIO ? "rico" : "pobre";
	}

	public void exibir() {
		float resultadoSalario = calcularSalario();
		System.out.println("Funcionario: " + this + " = R$: " + resultadoSalario + "[" + getSituacao(resultadoSalario) + "]");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return "Sou o funcionario " + nome + " e tenho " + idade + " anos.";
	}
}
