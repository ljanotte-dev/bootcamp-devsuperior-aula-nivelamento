package defaults;

public class Main14 {

	public static void main(String[] args) {
	
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.10 : preco * 0.05;
		
	/** double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.10;
		} else {
			desconto = preco * 0.05;
		}
	**/
		System.out.println(desconto);

		
	}
}
