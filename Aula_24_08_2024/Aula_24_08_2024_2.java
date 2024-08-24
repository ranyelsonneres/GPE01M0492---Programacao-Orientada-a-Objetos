import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aula_24_08_2024_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JOptionPane (saída de dados)
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome);
		
		String entrada1 = JOptionPane.showInputDialog("Número 1: ");
		String entrada2 = JOptionPane.showInputDialog("Número 2: ");
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Número 1: ")); //casting (troca de tipo)
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Número 2: "));
		
		int soma = num1 + num2;
		JOptionPane.showMessageDialog(null, soma);
		
		//Estrutura de controle
		if (soma > 0) {
			System.out.println("Número positivo");
			JOptionPane.showMessageDialog(null, "Número positivo");
		} else {
			JOptionPane.showMessageDialog(null, "Número negativo");
		}
		
		//Estrutura de repetição
		//For
		for (int i=0; i<10;i++) { //quando eu sei até onde vai a iteração
			System.out.println("Número: " + i);
		}
		
		//Uso do While
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int contador = 1;
		
		while(contador <=4) {
			System.out.println("Nota: ");
			int nota = input.nextInt();			
			total = total + nota;
			contador = contador + 1;
		}
		
		double media = total / 4;
		
		System.out.println("média: " + media);
		
		//Do While
		int numero;
		
		do{
			System.out.println("Número: ");
			numero = input.nextInt();
			System.out.println("Número: " + numero);
		} while (numero!=0);
		
		
		
		input.close();
		
		
		
		
		
		
		
		
	}

}
