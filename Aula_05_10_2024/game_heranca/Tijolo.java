package game;

public class Tijolo extends Bloco{

	//atributo
	private String caracteristica;
	
	//construtor com os parâmetros da superclasse
	public Tijolo(String tipo, String posicao, String caracteristica) {
		super(tipo, posicao);
		this.caracteristica = caracteristica;
	}

	//metodos acessores
	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	//metodo sobrescrito
	@Override
	public void Comportamento() {
		super.Comportamento();
		System.out.println("Quebrou!!!");
		System.out.println("##############");
	}
	
	
	
}
