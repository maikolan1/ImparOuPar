package ImparOuPar;

import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n1;
		
		System.out.println("Digite um número: ");
		n1= sc.nextInt();
		
		if(n1%2==0) {
			System.out.println("Este número é par.");
		}
		else {
			System.out.println("Este número é ímpar.");
		}
		
		sc.close();

	}

}
