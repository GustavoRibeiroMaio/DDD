package ddd;
import java.util.Scanner;
public class Ex08 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		double a, b;
		
		System.out.printf("Digite o valor 1: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor 2: ");
		b = ler.nextDouble();
		
		if (a > b){
		
		System.out.printf("A é maior que valor 2");
		}else if( a < b  ){
			
			System.out.printf("B é maior que valor 1");
			
			}else {
				
				System.out.printf("A(%.1f) e B(%.1f) claramente são iguais", a, b);
			}
	}

}

