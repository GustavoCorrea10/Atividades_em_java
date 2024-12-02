package exercicios;

import java.util.Scanner;

public class LicaoJava1 {
	public static void main(String[] args) {
		
		//variaveis
		
	    double salario;
	    double abono;
	    double novosalario;
	    
	    Scanner leia = new Scanner(System.in);
	    
	    //entrada de dados
	    
	    System.out.println("Digite o valor do seu salario: ");
	    salario = leia.nextFloat();
	    
	    System.out.println("Digite o valor do Abono: ");
	    abono = leia.nextFloat();
	    		
	    //calculo
	    novosalario = salario + abono;
	    
	    
	    //saida de dados
	    
	    System.out.printf("Seu novo salário é de: %.2f ", novosalario);
	  
		
	}
	
	    

	    
	    
	    
	    
}
