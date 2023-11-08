package Atividades;

import java.util.Scanner;

public class CalcularMedia {
	public static void main(String[] Args) {
		float n1,n2,n3,n4,media;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		n1 = input.nextFloat();
		System.out.println("\nDigite a segunda nota: ");
		n2 = input.nextFloat();
		System.out.println("\nDigite a terceira nota: ");
		n3 = input.nextFloat();
		System.out.println("\nDigite a quarta nota: ");
		n4 = input.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("\nA média das notas é: " + media);
		
		
	}
 
}
