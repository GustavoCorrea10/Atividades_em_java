package exercicios;

import java.util.Scanner;

public class LicaoJava4 {

	public static void main(String[] args) {
		//variaveis
		
		float n1;
		float n2;
		float n3;
		float n4;
		float calculo;
		
		 Scanner leia = new Scanner(System.in);
		 
		//entrada de dados
		 
		 System.out.println("Digite o primeiro valor: ");
		 n1 = leia.nextFloat();
		 
		 System.out.println("Digite o primeiro valor: ");
		 n2 = leia.nextFloat();

				 
		System.out.println("Digite o primeiro valor: ");
		 n3 = leia.nextFloat();

				 
		 System.out.println("Digite o primeiro valor: ");
		 n4 = leia.nextFloat();
		 
		 //calculo
		 
		 calculo = (n1 * n2) - (n3 * n4);
		 
		 
		 //saida de dados
	 
		 System.out.printf("Diferença do Numero1 e Numero2 entre o Numero3 e Numero4 é de: %.1f ", calculo);
		 
		 


	}

}
