package heranca;

public class Professor extends Pessoa{
	
	//atributo
	private String disciplina;

	public Professor(String nome, int idade, String disciplina) {
		super(nome, idade);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	@Override //sobrescrita do método
	public void apresentar() {
		super.apresentar();
		System.out.println("Disciplina: " + disciplina);
	}
	
	
	

}
