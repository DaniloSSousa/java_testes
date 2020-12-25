public class Conta {	
	private String titular;
	private int agencia;
	private int numero;
	private double saldo;
	private static int total = 0;

	public Conta(Cliente cliente) {
		total++;
//		System.out.println(total);
		this.titular = cliente.getNome();
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return;
		}
		
		System.out.println("Saldo insuficiente, digite um valor menor");
	}

	public void transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			saca(valor);
			destino.deposita(valor);
			return;
		}
		
		System.out.println("Saldo insuficiente, digite um valor menor");
	}
	
	public String getTitular() {
		return titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public static int getTotal() {
		return total;
	}
}