
package licao;

import java.util.Scanner;

public class jconversao {
	public static void main(String[]agrs) {
		Scanner ler = new Scanner(System.in);
				
		System.out.println("Digite o numero do conversor \n 1 = dólar \n 2 = Euro \n 3 = libra \n 4 = Peso Argentino \n 5 = Iene");
		int num = ler.nextInt();
		
		System.out.println("Digite o valor em real");
		double real = ler.nextInt();
		
		
		switch(num) {
		case 1: 
			System.out.println("O seu valor em Dólar: "+real * 5.69);
			break;
		case 2: 
			System.out.println("O seu valor em Euro: "+real * 5.94);
			break;
		case 3: 
			System.out.println("O seu valor em Libra: "+real * 7.16);
			break;
		case 4: 
			System.out.println("O seu valor em Peso Argentino: "+real * 0.0055);
			break;
		case 5: 
			System.out.println("O seu valor em Iene: "+real * 0.04);
		break;
		}
	}

}
