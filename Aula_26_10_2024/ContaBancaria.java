package contabancaria;

public class ContaBancaria {
	
	//atributos
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	//construtor
	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	//getters e setters 
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	//depositar
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	//sacar
	public void sacar(double valor) {
		if (valor < 0) {
			System.out.println("Não foi possível sacar utilizando valor negativo!");
		} else if (saldo - valor >=0) {
			this.saldo -= valor;
		} else {
			System.out.println("Não foi possível sacar");
		}
	}
	
	//dados do cliente
	@Override
	public String toString() {
		return "Cliente: " + nomeCliente +
				"\nConta:" + numConta +
				"\nSaldo: " + saldo;
				
	}

}
