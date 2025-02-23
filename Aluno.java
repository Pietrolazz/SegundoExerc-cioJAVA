import java.util.Scanner;

public class Aluno {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		String aluno1, aluno2, aluno3;
		
	System.out.println("Isira o nome de 3 alunos");
	
	aluno1 = ler.next();
	aluno2 = ler.next();
	aluno3 = ler.next();
	
	System.out.println("O nome de seus alunos são: "+aluno1+", "+aluno2+", "+aluno3);
	}
	
}
