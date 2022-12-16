package es.iessoterohernandez.daw.endes;

import java.util.Scanner;



public class MainFibonacci{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		System.out.print("Escribe un numero ");
		Fibonacci f = new Fibonacci(sc.nextInt());

		f.mostrarSucesion();

		sc.close();
	}

}
