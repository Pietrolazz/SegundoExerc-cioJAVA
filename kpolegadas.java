
package licao;

import java.util.Scanner;

public class kpolegadas {
	public static void main(String[]agrs) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a altura: ");
		double h = ler.nextInt();
		
		System.out.println("Digite a largura: ");
		double l = ler.nextInt();
			
				double res = (h*h) + (l*l);
				double res2 = Math.sqrt(res) / 2.54;
						System.out.println("O seu valor em polegadas é: "+res2);
	}

}
