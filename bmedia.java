package licao;

import java.util.Scanner;

public class bmedia {
	public static void main(String[]agrs) {
		Scanner ler = new Scanner(System.in);
		
		double num1, num2, num3, num4, res;
		
		System.out.println("Digite 4 números: ");
		
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		num4 = ler.nextInt();
			
				res = (num1 + num2 + num3 + num4) / 4;
						System.out.println("A sua média é : "+res);
	}

}