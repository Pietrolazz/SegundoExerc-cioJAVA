package licao;

import java.util.Scanner;

public class anum3 {
	public static void main(String[]agrs) {
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3, res;
		
		System.out.println("Digite 3 números: ");
		
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
			
				res = num1 + num2 + num3;
						System.out.println("O seu total é: "+res);
	}

}