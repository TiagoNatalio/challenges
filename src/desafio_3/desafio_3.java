package desafio_3;

import java.util.Scanner;

public class desafio_3 {
	//Algoritmo para saber o resultado final de um reajuste
	public static float discount_salary(float salary, float perc) {
		float discount = salary * (perc/100);
		return salary + discount;
	}
	
	public static void main(String[] args) {
		
		float perc;
		float salary;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the salary:");
		salary = sc.nextInt();
		System.out.println("Enter the percentage discount:");
		perc = sc.nextInt();
		
		float discount = discount_salary(salary,perc);
		System.out.printf("Your new salary is: R$%.2f",discount);
		sc.close();
	}
}
