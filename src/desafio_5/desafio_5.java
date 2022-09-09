package desafio_5;

import java.util.Scanner;

public class desafio_5 {
	// Algoritmo que é um console onde você pode escolher de qual forma geométrica quer descobrir a área.
	public static void calc_triangle() {
		float b,h,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter some values to calculate!");
		System.out.println("Enter triangle base:");
		b = sc.nextInt();
		System.out.println("Enter triangle height:");
		h = sc.nextInt();
		
		result = b * h / 2;
		
		System.out.printf("The area of the triangle is: %.1f%n",result);
		sc.close();
	}
	public static void calc_square() {
		float l,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter some values to calculate!");
		System.out.println("Enter square side:");
		l = sc.nextInt();
		
		result = l * l;
		
		System.out.printf("The area of the square is: %.1f%n",result);
		sc.close();
	}
	
	public static void calc_rectangle() {
		float b,h,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter some values to calculate!");
		System.out.println("Enter rectangle base:");
		b = sc.nextInt();
		System.out.println("Enter rectangle height:");
		h = sc.nextInt();
		
		result = b * h;
		
		System.out.printf("The area of the rectangle is: %.1f%n",result);
		sc.close();
	}
	
	public static void main(String[] args) {
		int form;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Which geometric form you want to calculate?%nTriangle:1%nSquare:2%nRectangle:3");
		form = sc.nextInt();
		
		if(form == 1) {
			calc_triangle();
		}else if (form == 2){
			calc_square();
		}else if (form == 3){
			calc_rectangle();
		}else {
			System.out.println("Please, choose a number in our list.");
		}
		
		sc.close();
	}
}
