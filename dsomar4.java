package licao;

import java.util.Scanner;

public class dsomar4 {
	public static void main(String[]agrs) {
		Scanner ler = new Scanner(System.in);
		
		double num1, num2, num3, num4, num5, num6, res;
		
		System.out.println("Digite 6 números: ");
		
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		num4 = ler.nextInt();
		num5 = ler.nextInt();
		num6 = ler.nextInt();
			
				res = ((num1 + num2 + num3 + num4) * num5) / 6;
						System.out.println("O seu resultado é : "+res);
	}

}