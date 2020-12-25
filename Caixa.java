public class Caixa extends Funcionario {
	public Caixa(String nome, double salario) {
		Funcionario.totalFuncionarios++;
		super.setNome(nome);
		super.setSalario(salario);
	}
	
	@Override
	public double getBonificacao() {
		return super.getBonificacao();
	}
}