package Atividades;

import java.util.Scanner;

public class NovoSalario {
	
  public static void main(String[] args) {
	  float salario,abono,novoSalario;
	  
	  Scanner input = new Scanner(System.in);
	  
	  System.out.println("Digite o Salário: ");
	  salario = input.nextFloat();
	  System.out.println("\nDigite o Abono: ");
	  abono = input.nextFloat();
	  
	  novoSalario = salario + abono;
	  
	  System.out.println("\n O novo salário é: " + novoSalario);
	  
  }
  
}
