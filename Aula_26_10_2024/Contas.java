package contabancaria;

public class Contas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Banco - UCB");
		
		//Conta simples
		ContaBancaria cb = new ContaBancaria("Fulano", "2780-1", 0);
		
		System.out.println(cb);
		
		System.out.println();
		//depositar
		cb.depositar(10);
		System.out.println(cb);
		
		//sacar
		System.out.println();
		cb.sacar(4);
		System.out.println(cb);
		
		System.out.println();
		
		//Conta Poupança
		ContaPoupanca cp = new ContaPoupanca("Beltrano", "2780-1", 10, 5);
		System.out.println(cp);
		
		//rendimento
		//supondo que o dia definido pelo banco seja 5
		double taxaRendimento = 0.05; //5%
		cp.calcularNovoSaldo(taxaRendimento);
		
		System.out.println();
		
		System.out.println(cp);
		
		System.out.println();
		
		//Conta Especial
		ContaEspecial ce = new ContaEspecial("Ciclano", "2780-2", 10, 5);
		//(String nomeCliente, String numConta, double saldo, double limite)
		
		System.out.println();
		
		System.out.println(ce);
		
		System.out.println();
		
		//sacar
		ce.sacar(16);
		System.out.println(ce);

	}

}
