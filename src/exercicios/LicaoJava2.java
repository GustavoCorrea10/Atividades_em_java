package exercicios;

import java.util.Scanner;

public class LicaoJava2 {

	public static void main(String[] args) {
		//variaveis
		
		float n1;
		float n2;
		float n3;
		float n4;
		float calcular;

		 Scanner leia = new Scanner(System.in);
		//entrada de dados
		 
		   System.out.println("Digite a primeira nota: ");
		   n1 = leia.nextFloat();
		   
		   System.out.println("Digite a segunda nota nota: ");
		   n2 = leia.nextFloat();
		   
		   System.out.println("Digite a terceira nota: ");
		   n3 = leia.nextFloat();
		   
		   System.out.println("Digite a quarta nota: ");
		   n4 = leia.nextFloat();
		   
		   //soma
		   
		   calcular = (n1 + n2 + n3 + n4)/4;
		   
		   //saida de dados
		   
		   System.out.printf("Média final: %.1f", calcular);
		   
		   
		
		
	}

}
