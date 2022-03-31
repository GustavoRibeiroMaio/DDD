package ddd;
import java.util.Scanner;
public class Ex14 {

public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double peso, altura, ideal;
		
		System.out.printf("Digite a altura: ");
		altura = ler.nextDouble();
		
		System.out.printf("Digite o peso: ");
		peso = ler.nextDouble();
		
		ideal = peso / (altura * altura);
		
		System.out.printf("o imc é: %.2f", ideal);

	}
}

