package contabancaria;

public class ContaEspecial extends ContaBancaria{

	//atributo
	private double limite;

	//construtor
	public ContaEspecial(String nomeCliente, String numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}

	//getters e setters
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public void sacar(double valor) { //redefinição do método sacar
		double novoSaldo = super.getSaldo() + limite;
		
		//(saldo - valor >=0)
		//double novoSaldo = saldoAntigo + (saldoAntigo * taxaRendimento);
		//super.setSaldo(novoSaldo);
		if (novoSaldo-valor >= 0) {
			super.setSaldo(super.getSaldo() - valor);
		}
		else {
			System.out.println("Não foi possível sacar");
		}	
	}
	
	
	public String toString() {
		double novoSaldo = super.getSaldo() + limite;
		return super.toString() +
				"\nLimite: " + limite
				+ "\nSaldo + Limite: " + novoSaldo;
	}
}
