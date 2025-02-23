import java.util.Scanner;

public class Principal2 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num1, num2, res, res2;
		
		System.out.println("Insira 2 números");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		res = num1 + num2;
		res2 = num1 - num2;
		System.out.println("Sua soma "+ res);
		System.out.println("Sua subtração "+ res2);
		
	}
}