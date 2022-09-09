package desafio_2;

import java.util.Scanner;

public class desafio_2 {
	// Algoritmo para mostrar tabuada de um número escolhido
	public static void multiplication_table(int number) {
		for (int i = 0; i < 11; i++) {
			int result = number * i;
			System.out.printf("%d x %d = %d%n",number,i,result);
		}
	}
	
	public static void main(String[] args) {
		
		int number;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose a number to know its multiplication table:");
		number = sc.nextInt();
		
		multiplication_table(number);

		sc.close();
	}
}
