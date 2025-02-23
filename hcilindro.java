
package licao;

import java.util.Scanner;

public class hcilindro {
	public static void main(String[]agrs) {
		Scanner ler = new Scanner(System.in);
		
		double raio, h, res;
		
		System.out.println("Digite o raio: ");
		raio = ler.nextInt();
		
		System.out.println("Digite a altura: ");
		h = ler.nextInt();
			
				res = ((raio * raio) * 3.14) * h ;
						System.out.println("O seu volume é : "+res);
	}

}