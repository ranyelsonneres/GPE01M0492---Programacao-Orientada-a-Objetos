package m1;

public class Carro {
	//modificador publico
	public String modelo;
	
	//modificador privado
	private double preco;
	
	//modificador default
	double quilometragem;

	public Carro(String modelo, double preco, double quilometragem) {
		this.modelo = modelo;
		this.preco = preco;
		this.quilometragem = quilometragem;
		
	}
	
	public void exibirModelo() {
		System.out.println("Modelo: " + modelo);
	}
	
	public void exibirPreco() {
		System.out.println("Preco: " + preco);
	}
	
	public void exibirkm() {
		System.out.println("KM: " + quilometragem);
	}
	
	
	
}
