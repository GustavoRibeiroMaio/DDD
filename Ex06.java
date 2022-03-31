package ddd;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b;
		
		System.out.printf("informe a temperatura em °C: ");
		a = ler.nextDouble();
		
		b = a * 1.8 + 32;
		
		System.out.printf("a transformação de °F para °C foi: %.2f", b);
	}

	}

