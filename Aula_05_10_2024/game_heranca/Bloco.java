package game;

public class Bloco {
	
	//atributos
	protected String tipo;
	protected String posicao;
	
	//metodo construtor
	public Bloco(String tipo, String posicao) {
		this.tipo = tipo;
		this.posicao = posicao;
	}
	
	//metodos acessores
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	
	//metodo base
	public void Comportamento() {
		System.out.println("Tipo: " + tipo);
		System.out.println("Posição: " + posicao);
	}
	

}
