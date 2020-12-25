public class Cliente {
	private String nome;
	private Endereco endereco = new Endereco();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return "Rua: " + endereco.getRua() + "\n" +
			   "Numero: " + endereco.getNumero() + "\n" +
			   "Complemento: " + endereco.getComplemento() + "\n" +
			   "Bairro: " + endereco.getBairro() + "\n" +
			   "Cidade: " + endereco.getCidade() + "\n" +
			   "Estado: " + endereco.getEstado();
	}

	public void setEndereco(String atributo, String valor) {
		switch (atributo) {
			case "rua":
				this.endereco.setRua(valor);
				break;
			case "numero":
				this.endereco.setNumero(valor);
				break;
			case "complemento":
				this.endereco.setComplemento(valor);
				break;
			case "bairro":
				this.endereco.setBairro(valor);
				break;
			case "cidade":
				this.endereco.setCidade(valor);
				break;
			case "estado":
				this.endereco.setEstado(valor);
				break;
			default:
				break;
		}
	}
}