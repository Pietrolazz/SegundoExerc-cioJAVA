
package licao;

import java.util.Scanner;

public class ibhascara {
	public static void main(String[]agrs) {
		Scanner ler = new Scanner(System.in);

		
		System.out.println("Digite a");
		double a = ler.nextInt();
		
		System.out.println("Digite b");
		double b = ler.nextInt();
		
		System.out.println("Digite c");
		double c = ler.nextInt();
			
				double delta = (b * b) - 4 * a * c;
				
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
						double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				
						System.out.println("O seu bháscara é : ("+x1+","+x2+")");
	}

}
