package exercicios;

import java.util.Scanner;

public class licaoJava3 {
	
public static void main(String[] args) {
	
	
	//variaveis
	
    float salarioB;
    float adicional;
    float horasEX;
    float desconto;
    float salarioLiquido;
    
    Scanner leia = new Scanner(System.in);
    
   //entrada de dados
    
    System.out.println("Digite o salário: ");
    salarioB = leia.nextFloat();
    
    System.out.println("Digite o Adicional: ");
    adicional = leia.nextFloat();
    
    System.out.println("Digite as Horas Extras: ");
    horasEX = leia.nextFloat();
    
    
    System.out.println("Digite o Valor do Desconto: ");
    desconto = leia.nextFloat();
    
    
    //calculo
    
    salarioLiquido = salarioB + adicional + (horasEX * 5) - desconto;
    
    
    //saida de dados
    
    System.out.printf("O seu Salário Líquido é de: %.2f", salarioLiquido);
    
    
    
    
    
}
	
}
