package defaults;

import java.util.Locale;

public class Main03Ex {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double prince1 = 2100.0;
		double prince2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf(product1 + ", with price is $ %.2f %n", prince1);
		System.out.printf(product2 + ", with price is $ %.2f %n", prince2);
		System.out.println(" ");
		System.out.println("Record: " + age + " years old, " + code + " and gender:" + gender);
		System.out.println(" ");
		System.out.printf("Measue with eight decimal places: %.8f %n", measure);
		System.out.printf("Rouded (three decimal places): %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f ", measure);
		
		
		

	}

}
