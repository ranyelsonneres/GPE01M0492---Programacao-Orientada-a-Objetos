package abstrato;

public abstract class Jogo {
	
	String nome;
	int numeroJogadores;
	
	public Jogo(String nome, int numeroJogadores) {
		this.nome = nome;
		this.numeroJogadores = numeroJogadores;
	}
	
	//metodos abstratos (são obrigatórios nas subclasses)
	public abstract void iniciar();
	public abstract void regras();
	
	//metodo concreto (não é obrigatório na subclasse)
	public String toString() {
		return "Numero de jogadores: " + numeroJogadores;
	}

}
