package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {

		double largura, comprimento, valorMetroQuadrado, areaTerreno, precoTerreno;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();

		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();

		System.out.print("Digite o valor do metro quadrado: ");
		valorMetroQuadrado = sc.nextDouble();

		areaTerreno = largura * comprimento;

		precoTerreno = valorMetroQuadrado * areaTerreno;

		System.out.printf("Area do terreno = %.2f%n", areaTerreno);
		System.out.printf("Preco do terreno = %.2f%n", precoTerreno);

		sc.close();

	}

}
