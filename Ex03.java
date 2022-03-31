package ddd;
import java.util.Scanner;
public class Ex03 {

	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);

		double a, b, c, soma;
		
		System.out.printf("Digite a base do triangulo:");
		a =ler.nextDouble();
		
		System.out.printf("Digite a altura do triangulo:");
		b = ler.nextDouble();
		
		System.out.printf("Divida por:");
		c = ler.nextDouble();
		
		soma = a *b /c;
		
		
		System.out.printf("A área do triangulo é: = %.2f", soma);
	}
}

	
		
		

