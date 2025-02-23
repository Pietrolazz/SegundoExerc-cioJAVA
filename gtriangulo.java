
package licao;

import java.util.Scanner;

public class gtriangulo {
	public static void main(String[]agrs) {
		Scanner ler = new Scanner(System.in);
		
		double num1, res;
		
		System.out.println("Digite 1 número: ");
		
		num1 = ler.nextInt();
			
				res = (Math.sqrt(3) * num1) / 2;
						System.out.println("A sua altura é : "+res);
	}

}