package ddd;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		
		Double a, b, reais;
		
		System.out.printf("Quantos dólares você quer converter em reais?: ");
		a = ler.nextDouble();
		
		System.out.printf("Qual a cotação atual?: ");
		b = ler.nextDouble();
		
		reais = a* b;
		
		System.out.printf("O seu dinheiro em dólares para reais foi: %.2f", reais);

		
		
		
	}

}
