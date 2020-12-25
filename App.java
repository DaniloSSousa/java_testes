public class App {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Danilo");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("DaniloSS");
		
		cliente.setEndereco("rua", "Av da cidade");
		cliente.setEndereco("numero", "1");
		cliente.setEndereco("complemento", "casa 1");
		cliente.setEndereco("bairro", "Jd. Zaira");
		cliente.setEndereco("cidade", "Mauá");
		cliente.setEndereco("estado", "SP");
		
		cliente2.setEndereco("rua", "Av do estado");
		cliente2.setEndereco("numero", "2");
		cliente2.setEndereco("complemento", "apto 2");
		cliente2.setEndereco("bairro", "Jd. Zaira");
		cliente2.setEndereco("cidade", "Mauá");
		cliente2.setEndereco("estado", "SP");
		
		Conta conta = new Conta(cliente);
		Conta conta2 = new Conta(cliente2);
		
		conta.setAgencia(333);
		conta.setNumero(1);
		System.out.println("Agência e número da conta 1: " + "Ag: " + conta.getAgencia() + ", "
				+ "Num: " + conta.getNumero());
		conta2.setAgencia(444);
		conta2.setNumero(2);
		System.out.println("Agência e número da conta 2: " + "Ag: " + conta2.getAgencia() + ", "
				+ "Num: " + conta2.getNumero());
		
		conta.deposita(600.00);
		conta2.deposita(100.00);
		System.out.println("Depositado na conta 1: " + conta.getSaldo());
		System.out.println("Depositado na conta 2: " + conta2.getSaldo());
		
		conta.saca(50.00);
		conta2.saca(25.00);
		System.out.println("Sacado na conta 1: " + 50.00);
		System.out.println("Sacado na conta 2: " + 25.00);
		
		System.out.println("Total resultante conta 1: " + conta.getSaldo());
		System.out.println("Total resultante conta 2: " + conta2.getSaldo());
		
		double totalTransferencia = 25.00;
		conta2.transfere(totalTransferencia, conta);
		System.out.println("Transferido da conta 2 para a conta 1: " + totalTransferencia);
		
		System.out.println("Saldo total da conta 1 após transferência: " + conta.getSaldo());
		System.out.println("Saldo total da conta 2 após transferência: " + conta2.getSaldo());
		
		System.out.println("\nEndereço atual do cliente 1: " + "\n" + cliente.getEndereco() + "\n"
				+ "Titular: " + conta.getTitular());
		System.out.println("\nEndereço atual do cliente 2: " + "\n" + cliente2.getEndereco() + "\n"
				+ "Titular: " + conta2.getTitular());
		
		System.out.println("\nTotal de contas criadas: " + Conta.getTotal());
	}
}