package game;

public class Pergunta extends Bloco{
	
	//atributos
	private String op;

	//construtor com os parâmetros da superclasse
	public Pergunta(String tipo, String posicao, String op) {
		super(tipo, posicao);
		this.op = op;
	}
	
	//metodos acessores
	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}
	
	//metodo sobrescrito
	@Override
	public void Comportamento() {
		super.Comportamento();
		System.out.println("Opção: " + op);
		System.out.println("##############");
	}

}
