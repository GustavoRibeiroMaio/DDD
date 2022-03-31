package ddd;
import java.util.Scanner;
public class Ex12 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b, soma;
		System.out.printf("Digite a base do retangulo:");
		a = ler.nextInt();
		
		System.out.printf("Digite a altura do retangulo:");
		b = ler.nextInt();
		
		soma = a * b;
		
		
		if (soma>100) {
		System.out.printf("Terreno grande");
		}else {
			System.out.printf("Terreno pequeno");
			
		}
		}
		
}


