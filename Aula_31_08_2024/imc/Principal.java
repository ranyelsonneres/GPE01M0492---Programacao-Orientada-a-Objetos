package imc;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//criar objeto
		IMC calcIMC = new IMC();
		
		System.out.println("Peso: ");
		calcIMC.peso = sc.nextDouble();
		
		System.out.println("Altura: ");
		calcIMC.altura = sc.nextDouble();
		
		double imc = calcIMC.calcularIMC();
		
		String resultadoTexto = calcIMC.interpretarIMC(imc);
		
		System.out.println("IMC: " + imc);
		System.out.println("Classificação: " + resultadoTexto);
		
		sc.close();
		

	}

}
