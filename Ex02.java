package ddd;
import java.util.Scanner;
public class Ex02 {

	public static void main(String [] args) {
		Scanner ler =new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.printf("Digite o primeiro lado do quadrado:");
		a =ler.nextInt();
		
		System.out.printf("Digite o segundo lado do quadrado:");
		b = ler.nextInt();
		
		soma = a*b;
		
		System.out.printf("A área do quadrado é: %d", soma);
		
		
		
	}
	
}


