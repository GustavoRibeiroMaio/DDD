package ddd;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, media;
		
		
		System.out.printf("Digite o valor 1: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor 2: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o valor 3: ");
		c = ler.nextDouble();
		
		System.out.printf("Digite o valor 4: ");
		d = ler.nextDouble();
		
		
		media = a + b + c + d;
		
		media = media /4;
		
		System.out.printf("A média Arimética dos quatro numeros é: %.2f", media);
		
		
	}

}
