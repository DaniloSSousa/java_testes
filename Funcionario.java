public abstract class Funcionario {
	private String nome;
	private double salario;
	static int totalFuncionarios;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonificacao() {
		return salario * 0.10;
	}
}