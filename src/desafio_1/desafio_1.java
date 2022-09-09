package desafio_1;

import java.util.Scanner;

public class desafio_1 {
	// Algoritmo para descobrir se uma palavra é palíndromo
	public static boolean check_palindrome(String letter) {
		int len_letter = letter.length();
		String reversed_letter = "";
		for (int i = len_letter -1; i >= 0; i-- ){
			reversed_letter = reversed_letter + letter.charAt(i);
		}
		if (letter.equals(reversed_letter)){			
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		
		String letter;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a letter to check if it is palindrome: ");
		letter = sc.nextLine();
		
		boolean result = check_palindrome(letter);
		
		if (result == true) {
			System.out.println("The letter is a palindrome!");
		}else {
			System.out.println("The letter is not a palindrome!");
		}
		
		
		sc.close();
	}
}
