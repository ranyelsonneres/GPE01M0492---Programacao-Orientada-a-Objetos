package contabancaria;

public class ContaPoupanca extends ContaBancaria{
	
	//atributos
	private int diaRendimento;

	//construtor
	public ContaPoupanca(String nomeCliente, String numConta, double saldo, int diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}

	//getters e setters
	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	//calcular novo saldo
	public void calcularNovoSaldo(double taxaRendimento) {
		//dia de rendimento 5
		if (this.diaRendimento == 5) {
			double saldoAntigo = super.getSaldo();
			double novoSaldo = saldoAntigo + (saldoAntigo * taxaRendimento);
			super.setSaldo(novoSaldo);
			System.out.println("Houve rendimento!");
		} else {
			System.out.println("Não houve rendimento!");
		}
	}
	
	@Override
	public String toString(){
		return super.toString() + 
				"\nDia de Rendimento: " + diaRendimento;
	}
}
