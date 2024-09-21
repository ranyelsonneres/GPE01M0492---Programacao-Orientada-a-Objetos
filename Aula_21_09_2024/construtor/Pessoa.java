package construtor;

public class Pessoa {
	
	//atributos
	private String nome;
	private int idade;
	
	
	//modificadores de acesso
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
		if (idade > 0) {
			this.idade = idade;
		}
		else {
			System.out.println("Idade inválida!");
		}
		
	}

	//construtores
	public Pessoa () {
		this.nome = "Vazio";
		this.idade = 0;
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
	}
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.idade = 0;
	}
	
	
	//método
	public void exibir() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}

}
