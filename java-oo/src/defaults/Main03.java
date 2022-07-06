package defaults;

import java.util.Locale;

public class Main03 {

	public static void main(String[] args) {

		System.out.print("Meu nome é: ");
		System.out.println("Leandro");

		int idade = 42;
		System.out.println("Tenho " + idade);
		
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado " + x + " Metros");
		System.out.printf("Resultado %f Metros%n", x);
		String nome = "Maria";
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
