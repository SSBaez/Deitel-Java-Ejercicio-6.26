package com.ssbaez.ejercicio626;

import java.util.Scanner;

public class InvertirDigitos {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n%s%n%s",
						  "Aplicacion que invierte el orden de los digitos de un entero",
						  "Ingrese un numero entero",
						  "----> ");
		
		int num1 = input.nextInt();
		System.out.print("Numero invertido: ");
		invertirDigitos(num1);
		
	}
	
	public static void invertirDigitos(int num) {
		
		for(int i = num; i > 1; i /= 10) {
			
			System.out.printf("%d", i % 10);
			
		}
		
	}

}
