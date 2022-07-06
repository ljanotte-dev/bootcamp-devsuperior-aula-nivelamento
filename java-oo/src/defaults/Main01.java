package defaults;

public class Main01 {

	public static void main(String[] args) {

		int resultado;
		resultado = (2 * 6 / 3);
		System.out.println("Resultado de 2 * 6 / 3 = " + resultado);

		resultado = (3 + 2 * 4);
		System.out.println("Resultado de 3 + 2 * 4 = " + resultado);
		
		resultado = ((3 + 2) * 4);
		System.out.println("Resultado de (3 + 2) * 4) = " + resultado);
		
		resultado = (60/(3 + 2) * 4);
		System.out.println("Resultado de 60/(3 + 2) * 4 = " + resultado);
		
		resultado = (60/((3 + 2) * 4));
		System.out.println("Resultado de 60/((3 + 2) * 4) = " + resultado);
		
		resultado = (14 % 3);
		System.out.println("Resultado de 14 % 3 = " + resultado);
		
		resultado = (19 % 5);
		System.out.println("Resultado de 14 % 3 = " + resultado);
	}

}
