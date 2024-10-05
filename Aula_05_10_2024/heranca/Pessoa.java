package heranca;

public class Pessoa {
	
	//atributos
	protected String nome;
	protected int idade;
	
	//modificadores: private, default, public e protected
	
	//construtor
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	//metodos acessores
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//métodos comportamentais
	public void apresentar() {
		System.out.println("Nome: " + nome + " Idade: " + idade);
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome +
				" Idade: " + idade;
	}
	
		
	

}
