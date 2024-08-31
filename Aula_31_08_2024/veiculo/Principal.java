package veiculo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//criar o objeto
		Carro carro = new Carro();
		
		//instanciar os atributos
		carro.modelo = "SUV";
		carro.cor = "Azul";
		carro.ano = 2023;
		carro.placa = "QKC-1010";
		
		Carro carro2 = new Carro();
		carro2.modelo = "Sedan";
		carro2.cor = "Vermelho";
		carro2.ano = 2022;
		carro2.placa = "XPT-2023";
		
		carro.exibirInformacoes();
		carro2.exibirInformacoes();
		
	}

}
