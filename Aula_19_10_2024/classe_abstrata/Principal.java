package abstrato;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Jogo jogoTabuleiro = new Jogo("Dama", 2);
		
		Jogo jogoTabuleiro = new JogoTabuleiro("Dama", 2, "Padrão");
		
		jogoTabuleiro.iniciar();
		jogoTabuleiro.regras();
		System.out.println(jogoTabuleiro);
		
		System.out.println();
		
		Jogo jogoTabuleiro2 = new JogoTabuleiro("Banco Imobiliario", 4, "Quadrado");
		jogoTabuleiro2.iniciar();
		jogoTabuleiro2.regras();
		System.out.println(jogoTabuleiro2);
		
		System.out.println();
		
		Jogo jogoCarta = new JogoCarta("Poker", 2, "Padrão");
		jogoCarta.iniciar();
		jogoCarta.regras();
		System.out.println(jogoCarta);

	}

}
