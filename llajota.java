
package licao;

import java.util.Scanner;

public class llajota {
	public static void main(String[]agrs) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a altura: ");
		double h = ler.nextDouble();
		
		System.out.println("Digite a largura: ");
		double l = ler.nextDouble();
			
				double res2 = h * l;
				
				//0.9 = área da lajota
						System.out.println("A sua quantidade de lajotas é: " +res2 / 0.9);
	}

}
