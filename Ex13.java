package ddd;
import java.util.Scanner;
public class Ex13 {

public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Double a, b, c;
		
		System.out.printf("Insira o A: ");
		a = ler.nextDouble();
		
		System.out.printf("Insira o B: ");
		b = ler.nextDouble();
		
		System.out.printf("Insira o C: ");
		c = ler.nextDouble();
		
		if (a > b && a > c) {
			
			System.out.printf("A é o maior deles");
						
		}else if(b > a && b > c){
			
				System.out.printf("B é o maior deles");
		
		}else{
			
			System.out.printf("C é o maior deles");
				
		}
	}
}

