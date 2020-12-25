public class Gerente extends FuncionarioAutenticavel {	
	public Gerente(String nome, double salario, int senha) {
		Funcionario.totalFuncionarios++;
		super.setNome(nome);
		super.setSalario(salario);
		super.setSenha(senha);
	}
	
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.30;
	}
}