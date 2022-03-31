package ddd;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, e;
		double total, carteira;
		
		System.out.printf("Digite o preço do produto 1: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o preço do produto 2: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o preço do produto 3: ");
		c = ler.nextDouble();
		
		System.out.printf("Digite o preço do produto 4: ");
		d = ler.nextDouble();
		
		System.out.printf("Digite o preço do produto 5: ");
		e = ler.nextDouble();
		
		total = a + b + c + d + e;
		
		System.out.printf("Digite com quanto vocę irá pagar: ");
		carteira = ler.nextDouble();
	
		carteira = total - carteira;
		
		System.out.printf("O seu troco deu: %.2f", carteira);
		
		
	}

}
