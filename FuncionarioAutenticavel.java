public abstract class FuncionarioAutenticavel extends Funcionario {
	private int senha;
	
	public int getSenha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public String autentica(FuncionarioAutenticavel fa) {
		SistemaInterno si = new SistemaInterno();
		return si.acesso(fa.getSenha());
	}
}