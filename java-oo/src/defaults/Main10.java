package defaults;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {

		System.out.println("Boa noite");

		Scanner sc = new Scanner(System.in);
		int horas;

		System.out.println("Quantas horas?");
		horas = sc.nextInt();

		if (horas < 12) {
			System.out.println("BomDia");
		}

		else if (horas < 18) {
			System.out.println("BoaTarde");
		} 
		else {
			System.out.println("BoaNoite");
		}

		sc.close();
	}

}
