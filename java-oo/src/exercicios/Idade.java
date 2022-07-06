package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Idade {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String pessoa1, pessoa2;
		int idadePessoa1, idadePessoa2;
		double media;
		
		System.out.println("Dados da primeira pessoa: ");
		System.out.println("Nome: ");
		pessoa1 = sc.next();
		System.out.println("Idade: ");
		idadePessoa1 = sc.nextInt();
		
		System.out.println("Dados da segunda pessoa: ");
		System.out.println("Nome: ");
		pessoa2 = sc.next();
		System.out.println("Idade: ");
		idadePessoa2 = sc.nextInt();
		
		media = (double) idadePessoa1 + idadePessoa2 / 2;
		
		System.out.printf("A idade média de %s e %s é de %.f1 anos", pessoa1, pessoa2, media);
		
		sc.close();
	}

}
