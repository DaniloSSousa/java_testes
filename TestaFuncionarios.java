public class TestaFuncionarios {
	public static void main(String[] args) {
		Caixa caixa = new Caixa("Pedro", 1000.00);
		Gerente gerente =  new Gerente("Danilo", 5000.00, 333);
		
		System.out.println(
			"Caixa:\n"
			+ caixa.getNome() + "\n"
			+ caixa.getSalario() + "\n"
			+ caixa.getBonificacao() + "\n\n"
			+ "Gerente:\n"
			+ gerente.getNome() + "\n"
			+ gerente.getSalario() + "\n"
			+ gerente.getBonificacao() + "\n"
			+ "Acesso: " + gerente.autentica(gerente) + "\n\n"
			+ "Total funcionários: " + Funcionario.totalFuncionarios
		);
	}
}