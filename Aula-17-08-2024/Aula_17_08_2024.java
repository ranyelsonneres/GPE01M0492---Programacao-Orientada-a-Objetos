import java.util.Scanner; //biblioteca para leitura de dados do teclado

public class Aula_17_08_2024 {

	public static void main(String[] args) {
		//leitura de dados (teclado)
		Scanner sc = new Scanner(System.in); //iniciou o processo
		
		
		
		//mecanismo de impressão
		System.out.println("Olá mundo!");
		
		
		//declarar variáveis
		String nome = "Fulano da Silva"; //string (conjunto de caractere)
		int num1 = 2; //inteiro
		double num2 = 10.2; //double
		float num3 = 10.2f; //ponto flutuante
		char letra = 'A'; //caracteres
		boolean booleano = true;
		boolean booleano1 = false;
		
		//impressão passando a variável
		System.out.println("Nome: " + nome);
		
		//leitura de dados
		System.out.println("Informe uma palavra: ");
		String palavra = sc.next(); //leitura de uma string
		
		System.out.println("Informe um número: ");
		int numero = sc.nextInt();
		
		System.out.println("Informe um segundo número: ");
		double numero2 = sc.nextDouble();
		
		System.out.println("Informe um caractere: ");
		char caractere = sc.next().charAt(0);
		
		System.out.println(palavra);
		System.out.println(numero);
		System.out.println(numero2);
		System.out.println(caractere);
		
		//ler vários dados na mesma linha
		String s1, s2, s3;
		System.out.println("Informe os dados: ");
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		sc.close(); //encerrar o processo

	}

}
