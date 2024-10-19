package abstrato;

public class JogoCarta extends Jogo{
	String tipoBaralho;

	public JogoCarta(String nome, int numeroJogadores, String tipoBaralho) {
		super(nome, numeroJogadores);
		this.tipoBaralho = tipoBaralho;
	}
	
	public void iniciar() {
		System.out.println("Jogo de carta: " + super.nome);
		System.out.println("Tipo de baralho: " + this.tipoBaralho);
	}
	
	public void regras() {
		System.out.println("Cada jogador deve jogar uma carta por vez");
	}
	
	
	public String toString() {
		return super.toString();
	}
}
