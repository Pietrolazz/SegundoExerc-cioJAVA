import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		
		//tipos de dados
		
		/* interger, int ----> inteiro
		 * double -------> número real 3.9 = 3,9
		 * String -------> texto
		 * boolean ------> lógico V ou F
		 */
		
		//Operadores
		
		/* + soma
		 *  - subtração
		 *  / divisão
		 *  % modulo mod
		 *  ++ operador unario de incrementação
		 *  -- operador unario de decrementação
		 */
		
		//Operadores Relacionais
		
		 /*  == igual
		 *  <= menor ou igual
		 *  >= maior ou igual
		 *  != diferente
		 *  > maior
		 *  < menor
		 *  ! não
		 */
		
		//Operadores Lógicos
		
		/* ! não
		 *  && operador E ou and
		 *  || operador Ou ou Or
		 */
		
		double num1 = 2.1;
		boolean aberto = true;
		String nome = "Pietro";
		int p1 = 4;
		
		//ler um valor e colocar em uma variável
		Scanner ler = new Scanner(System.in);
		int idade;
		System.out.println("\nInsira a sua idade\n");
		idade = ler.nextInt();
		System.out.println("\nA idade inserida foi: "+idade);
		
	}
}
