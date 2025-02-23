package licao;

import java.util.Scanner;

public class earea {
	public static void main(String[]agrs) {
		Scanner ler = new Scanner(System.in);
		
		int num1, res;
		
		System.out.println("Digite 1 número: ");
		
		num1 = ler.nextInt();
			
				res = num1  * num1;
						System.out.println("A sua área é : "+res);
	}

}