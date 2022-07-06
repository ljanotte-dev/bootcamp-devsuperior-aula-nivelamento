package defaults;

import java.util.Locale;
import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minuto = sc.nextInt();
		
		double conta = 50.0;
		
		if(minuto > 100) {
			conta += (minuto - 100) * 2.0;
		}
		
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		
		sc.close();
	}		

}
