package ddd;
import java.util.Scanner;
public class Ex10 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		
		double a, b;
		
		System.out.printf("Insira o A: ");
		a = ler.nextDouble();
		
		System.out.printf("Insira o B: ");
		b = ler.nextDouble();
		
		if(a > b) {
			System.out.printf("A maior que B: ");
			
		}else if(b > a){
			
			System.out.printf("B é maior que A");
			
		}else{
			
			System.out.printf("Os dois valores inseridos foram iguais");
			
		}
		
		
	}
	
}
