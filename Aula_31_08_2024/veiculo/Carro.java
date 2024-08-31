package veiculo;

public class Carro {
	
	//atributos
	String modelo;
	String cor;
	int ano;
	String placa;
	
	//método
	public void exibirInformacoes() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Cor: " + cor);
		System.out.println("Ano: " + ano);
		System.out.println("Placa: " + placa);
	}

}
