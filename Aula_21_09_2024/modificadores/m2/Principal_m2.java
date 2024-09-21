package m2;
import m1.Carro;

public class Principal_m2 {
	
	public static void main(String args[]) {
		
		Carro carro1 = new Carro("Fusca", 50000, 1000);
		carro1.exibirModelo();
		carro1.exibirPreco();
		
		String modelo = "Gol";
		double preco = 25000;
		double km = 1000;
		Carro carro2 = new Carro(modelo, preco, km);
		
		//carro2.quilometragem = 1400;
		//carro2.preco = 20000;
		carro2.exibirPreco();
		
	
	}
	


}
