package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {

		double base, altura, area, perimetro, diagonal;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Base do retangulo: ");
		base = sc.nextDouble();

		System.out.println("Altura do retangulo: ");
		altura = sc.nextDouble();

		area = base * altura;

		perimetro = 2 * (base + altura);
		
		diagonal = Math.sqrt(base * base + altura * altura);

		System.out.printf("AREA = %.4f%n", area);
		System.out.printf("PERIMETRO = %.4f%n", perimetro);
		System.out.printf("DIAGONAL = %.4f%n", diagonal);

		sc.close();

	}

}
