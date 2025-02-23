package licao;

import java.util.Scanner;

public class cdividir {
	public static void main(String[]agrs) {
		Scanner ler = new Scanner(System.in);
		
		double num1, num2, res;
		
		System.out.println("Digite 2 números: ");
		
		num1 = ler.nextInt();
		num2 = ler.nextInt();
			
				res = num1  / num2;
						System.out.println("A sua divisão é : "+res);
	}

}