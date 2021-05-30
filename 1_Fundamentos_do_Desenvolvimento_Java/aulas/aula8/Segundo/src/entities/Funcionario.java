package entities;

public class Funcionario {

	private String nome;
	private int idade;
	private float salario;
	private float bonus;
	private float descontos;
	
	public Funcionario(String nome) {
		this.nome = nome;
	}  
	
	public Funcionario(String nome, int idade, float salario) {
		this(nome);
		this.idade = idade;
		this.salario = salario;
	}
	
	public Funcionario(String nome, int idade, float salario, float bonus, float descontos) {
		this(nome, idade, salario);
		this.bonus = bonus;
		this.descontos = descontos;
	}
	
	public void exibir() {
		System.out.println(toString());
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
	public float getDescontos() {
		return descontos;
	}
	public void setDescontos(float descontos) {
		this.descontos = descontos;
	}

	@Override
	public String toString() {
		return "Sou o funcionario " + nome + " e tenho " + idade + " anos.";
	}
}
