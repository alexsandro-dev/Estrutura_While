package estrutura;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha : ");
		int x = sc.nextInt();
		
		
		
		while(x != 2002) {
			
			System.out.println("Senha Inválida");
			x = sc.nextInt();
		} 
		
			System.out.println("Senha Aceita");
	}

}
