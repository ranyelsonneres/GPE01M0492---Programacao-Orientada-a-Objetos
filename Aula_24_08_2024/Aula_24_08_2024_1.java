import java.util.Scanner;

public class Aula_24_08_2024 {

	public static void main(String[] args) {
		//JOptionPane (saída de dados)
		//Formatos de impressão (printf)
		//estrutura de controle e repetição
		//métodos e introducao O.O
		
		Scanner sc = new Scanner(System.in);
		
			
		System.out.println("Número: ");
		double num = sc.nextDouble();
		
		sc.nextLine(); //você para criar uma nova linha
		
		System.out.println("Nome: ");
		String nome = sc.nextLine(); //ler todo o conteúdo da string (incluindo o espaço)
		
		//%s (string), %d (inteiro), %f (float ou double)
		System.out.printf("Nome digitado: %s\n",nome);
		System.out.printf("Número digitado: %.2f",num);
//		System.out.println("Nome digitado: " + nome);
//		System.out.print(nome);
		
		sc.close();
		
		
		


	}

}
