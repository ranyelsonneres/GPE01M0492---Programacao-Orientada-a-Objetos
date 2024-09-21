package construtor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome = "Pedro";
		int idade = 10;
		Pessoa p1 = new Pessoa(nome, idade);
//		p1.nome = "André";
//		p1.idade = 15;
		
		p1.setIdade(-15);
		p1.getIdade();
		
		p1.exibir();
		
		String nome2 = "Ana";
		Pessoa p2 = new Pessoa(nome2);
		p2.exibir();
		
		Pessoa p3 = new Pessoa();
		p3.exibir();
		
		

	}

}
