package game;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tijolo tijolo = new Tijolo ("Tijolo", "12, 34","Blocos pequenos");
		
		tijolo.Comportamento();
		
		Pergunta pergunta1 = new Pergunta("Pergunta 1", "12, 38","Poder");
		Pergunta pergunta2 = new Pergunta("Pergunta 2", "12, 39", "Moeda");
		
		pergunta2.setOp("Poder");
		pergunta1.setOp("Moeda");
		
		pergunta1.Comportamento();
		pergunta2.Comportamento();

	}

}
