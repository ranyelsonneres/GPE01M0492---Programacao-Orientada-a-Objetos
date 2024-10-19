package abstrato;

public class JogoTabuleiro extends Jogo{
	
	private String tipoTabuleiro;

	public JogoTabuleiro(String nome, int numeroJogadores, String tipoTabuleiro) {
		super(nome, numeroJogadores);
		this.tipoTabuleiro = tipoTabuleiro;
	}
	
	public void iniciar() {
		System.out.println("Jogo de tabuleiro: " + super.nome);
		System.out.println("Tipo de tabuleiro: " + this.tipoTabuleiro);
	}
	
	public void regras() {
		System.out.println("Cada jogador deve mover suas peças");
	}
	
	
	
	

}
