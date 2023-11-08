package Atividades;

import java.util.Scanner;

public class Diferenca {
	public static void main(String[] args) {
		float n1,n2,n3,n4, diferenca;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		n1 = input.nextFloat();
		System.out.println("\nDigite o segundo valor: ");
		n2 = input.nextFloat();
		System.out.println("\nDigite o terceiro valor: ");
		n3 = input.nextFloat();
		System.out.println("\nDigite o quarto valor: ");
		n4 = input.nextFloat();
		
		diferenca = (n1*n2) -(n3*n4);
		
		System.out.println("\nDiferença: " + diferenca);
	}
}
