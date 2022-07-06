package defaults;

import java.util.Locale;
import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String x;
		System.out.print("Digitou algo: ");
		x = sc.next();
		System.out.println("Você digitou: " + x);

		int y;
		System.out.print("Digitou um numero inteiro: ");
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);

		double z;
		System.out.print("Digitou um numero flutuante: ");
		z = sc.nextDouble();
		System.out.printf("Você digitou: %.2f%n", z);

		char w;
		System.out.print("Digitou um numero char: ");
		w = sc.next().charAt(0);
		System.out.printf("Você digitou: " + w);
		
		String s1, s2, s3;
		int s0;
		
		s0 = sc.nextInt();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		
		System.out.println("Dados digitados: ");
		System.out.println(s0);
		sc.nextLine();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		sc.close();

	}

}
