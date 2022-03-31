package ddd;
import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c;
		
		System.out.printf("Vamos criar um triangulo");
		
		System.out.printf("Digite o tamanho da base:");
		a = ler.nextInt();
		
		System.out.printf("Digite o tamanho do lado:");
		b = ler.nextInt();
		
		System.out.printf("Digite o tamanho do outro lado:");
		c = ler.nextInt();
		
		if (a+b < c || a + c < b || b+c < a){
			System.out.printf("Isso nao e um triangulo");
		}
		else if (a == b && a == c && b == c) {
		 System.out.printf("é um triangulo equilatero");
		}
		else if (a != b && a != c && b != c) {
			System.out.printf("é um triangulo escaleno");
		}
		else if (a == b || a == c || b == c) {
			System.out.printf("é um triangulo isoceles");
		}
		
	}
}
