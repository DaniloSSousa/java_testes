public class SistemaInterno {
	private int senha = 333;
	
	public int getSenha() {
		return senha;
	}
	
	public String acesso(int senha) {
		if(senha == this.senha) {
			return "Permitido";
		} else {
			return "Negado";
		}
	}
}