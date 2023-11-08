package Atividades;

import java.util.Scanner;

public class NovoSalario2 {
	
  public static void main(String[] args) {
	  float bruto,adicional,horasEx, descontos, salarioLiquido;
	  
	  Scanner input = new Scanner(System.in);
	  
	  System.out.println("Digite o Salário Bruto: ");
	  bruto = input.nextFloat();
	  System.out.println("\nDigite o adicional: ");
	  adicional = input.nextFloat();
	  System.out.println("\nDigite as horas extras: ");
	  horasEx = input.nextFloat();
	  System.out.println("\nDigite o descontos: ");
	  descontos = input.nextFloat();
	  
	  salarioLiquido = bruto + adicional + (horasEx * 5) - descontos;
	  
	  System.out.println("\n O novo salário é: " + salarioLiquido);
	  
	  
  }
  
}
