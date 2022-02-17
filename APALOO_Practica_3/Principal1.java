/* ***********************DOCUMENTACION***********************
- Programa: Practica 3
- Version: Martes 30 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: 
- Datos de entrada: Sin datos de entrada
- Datos de salida: Sin datos de salida
**************************DOCUMENTACION*********************** */

import java.util.Scanner;

public class Principal1 {

	public static void main(String[] args) {
		
		Scanner lector= new Scanner(System.in);
		
		System.out.println("Para la ecuacion 1, por favor ingresa el valor de los coeficientes: \na: ");
		int varA= lector.nextInt();
		System.out.println("b: ");
		int varB= lector.nextInt();
		System.out.println("c: ");
		int varC= lector.nextInt();
		
		EcuacionSegGrado ec1= new EcuacionSegGrado();//creamos un objeto con el constructor vacio
		ec1.setValores(varA, varB, varC);
		System.out.println("La ecuacion 1 tiene las raices r1= " + ec1.CalculaRaizPositiva() + " y r2= " + ec1.CalculaRaizNegativa() + ".");
		
		System.out.println("\nPara la ecuacion 2, por favor ingresa el valor de los coeficientes: \na: ");
		varA= lector.nextInt();
		System.out.println("b: ");
		varB= lector.nextInt();
		System.out.println("c: ");
		varC= lector.nextInt();
		
		EcuacionSegGrado ec2= new EcuacionSegGrado(varA, varB, varC);//creamos otro objeto pero con el constructor no vacio
		System.out.println("La ecuacion 2 tiene las raices r1= " + ec2.CalculaRaizPositiva() + " y r2= " + ec2.CalculaRaizNegativa() + ".");
		
		lector.close();
	}
}
