package estrutura;

import java.util.Scanner;

public class Cartesiano {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número do plano x ");
		int x = sc.nextInt();
		System.out.println("Digite um número do plano y ");
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if(x>0 && y>0) {
				System.out.println("primeiro quadrante");
			}
			else if (x<0 && y>0) {
				System.out.println("segundo quadrante");
			}
			else if (x<0 && y<0) {
				System.out.println("terceiro quadrante");
			}
			else {
				System.out.println("quarto quadrante");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}

}
