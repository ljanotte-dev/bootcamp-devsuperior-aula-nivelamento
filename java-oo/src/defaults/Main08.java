package defaults;

public class Main08 {

	public static void main(String[] args) {
		
	int x = 5;
	
	System.out.println(x <= 20 && x == 10);
	System.out.println(x > 0 && x != 3);
	System.out.println(x <= 20 && x == 10 && x !=3);
	
	System.out.println(x == 10 || x <= 20);
	System.out.println(x > 0 || x != 3);
	System.out.println(x <= 0 || x != 3 || x != 5);
	
	System.out.println(!(x == 10));
	System.out.println(!(x >= 2));
	System.out.println(!(x <= 20 && x == 10));

	}

}

