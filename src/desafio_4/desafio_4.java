package desafio_4;

import java.util.Scanner;

public class desafio_4 {
	// Algoritmo para comparar dois valores
	public static String check_numbers(String value1, String value2){
		
		int value1_int, value2_int;
		
		value1_int = Integer.parseInt(value1);
		
		value2_int = Integer.parseInt(value2);
		
		if (value1_int == value2_int){
			return "Números iguais";
		}else if (value1_int > value2_int){
			return "Primeiro maior";
		}else {
			return "Segundo maior";
		}
	}
	
	public static void main(String[] args) {
		String value1,value2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first value:");
		value1 = sc.nextLine();
		System.out.println("Enter the second value:");
		value2 = sc.nextLine();
		
		String result = check_numbers(value1,value2);
		System.out.print(result);
		
		sc.close();
	}
}
