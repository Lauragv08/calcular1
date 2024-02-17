package CalcularN;
import java.util.Scanner;

public class Repasito {

	static Scanner scanner = new Scanner(System.in);
	static int opc;
	
	public static void main(String[] args) {
		Menu();
	}
		
	public static void Menu() {
		do {
			System.out.println("______________________________________");
			System.out.println("Seleccione una opción: ");
			System.out.println("1: Calcular el cuadrado de un número ");
			System.out.println("2: Repartir nueces para ardillas ");
			System.out.println("3: Convertir duración de película ");
			System.out.println("4: Salir ");
			System.out.println("______________________________________");
			int opc = scanner.nextInt();
			
			if(opc==1) {
				calcularCuadrado();
			}
			if(opc==2) {
				ardillas();
			}
			if(opc==3) {
				calcularDuracion();
			}
		}while(opc!=4);		
	}
	
	public static void calcularCuadrado() {

		System.out.println("Ingrese un número: ");
		double numero = scanner.nextInt();
		double numeroCuadrado = Math.pow(numero, 2);
		System.out.println("El resultado es: "+numeroCuadrado);
		}
	
	public static void ardillas() {
		System.out.println("Ingrese el número de ardillas: ");
		int numeroArdillas = scanner.nextInt();
		System.out.println("Ingrese el número de nueces: ");
		int numeroNueces = scanner.nextInt();
		int  resultado = numeroNueces/numeroArdillas; 
		int nueces = numeroNueces%numeroArdillas;
		System.out.println("A cada ardilla le corresponden: "+resultado+" nueces.");
		System.out.println("Sobraron " + nueces);
	}
	
	public static void calcularDuracion() {
		int duracion, segundos=0, minutos = 0, horas = 0;
		System.out.println("Ingrese la duración de la película: ");
		duracion = scanner.nextInt();
		horas = duracion/3600;
		minutos = (duracion-(horas*3600))/60;
		segundos = duracion-((horas*3600)+(60*minutos));
		System.out.println("La duración de la película son "+horas+": "+minutos+": "+segundos);
	}
}
