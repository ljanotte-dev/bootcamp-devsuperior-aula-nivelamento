package defaults;

import java.util.Scanner;

public class Main09 {

	public static void main(String[] args) {

		int x = 5;

		System.out.println("Bom dia");

		if (x > 0) {
			System.out.println("Boa tarde");
		}

		System.out.println("Boa noite");

		Scanner sc = new Scanner(System.in);
		int horas;

		System.out.println("Quantas horas?");
		horas = sc.nextInt();

		if (horas < 12) {
			System.out.println("BomDia");
		}

		else {
			System.out.println("BoaTarde");
		}

		sc.close();

	}

}
