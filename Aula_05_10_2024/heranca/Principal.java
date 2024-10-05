package heranca;

public class Principal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pessoa = new Pessoa("Maria", 45);
		Professor professor = new Professor("João", 38, "Artes");
		Aluno aluno = new Aluno ("Ana", 19, "Cinema");
		
		pessoa.apresentar();
		professor.apresentar();
		aluno.apresentar();
		
		System.out.println(pessoa);
		

	}

}
