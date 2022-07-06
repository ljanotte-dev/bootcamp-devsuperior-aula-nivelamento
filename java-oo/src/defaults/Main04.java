package defaults;

public class Main04 {

	public static void main(String[] args) {

		int x, y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);

		double z;
		z = 2 * x;
		System.out.println(z);
		
		// Trapezio
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		
		float b1, B1, h1, area1;
		b1 = 6f;
		B1 = 8f;
		h1 = 5f;
		area1 = (b1 + B1) / 2f * h1;
		System.out.println(area1);
		
		// Casting
		int a2, b2;
		double resultado;
		a2 = 5;
		b2 = 2;
		resultado = (double) a2 / b2;
		System.out.println(resultado);
		
		int b3;
		double a3;
		
		a3 = 5.0;
		b3 = (int) a3;
		System.out.println(b3);
		
	}

}
