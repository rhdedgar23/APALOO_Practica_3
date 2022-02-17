/* ***********************DOCUMENTACION***********************
- Programa: Practica 3
- Version: Martes 30 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: Clase Principal3 que crea dos instancias de la 
  clase EcuacionSegGrado; la primer instancia sea crea con el
  constructor vacio y la segunda con el constructor no vacio.
  Para ambas, se implementan dos nuevas excepciones: 
  DivisionEntreCeroException y RaicesImaginariasException. 
  Tambien se catchea el InputMismatchException: se piden los
  valores de los coeficientes de nuevo. 
- Datos de entrada: Los coeficientes para cada ecuacion. 
- Datos de salida: Las raices positivas y negativas.

**************************DOCUMENTACION*********************** */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal3 {

	public static void main(String[] args) {
		
		Scanner lector= new Scanner(System.in);
		
		//aqui empieza la primera ecuacion; 
		//el objeto ec1 es creado a partir del constructor vacio
		ecuacion1(lector);
		
		//aqui empieza la segunda ecuacion
		//el objeto ec2 es creado con el constructor con parametros
		ecuacion2(lector);
		
	}
	
	public static void ecuacion1(Scanner lector) {
		try {
			System.out.println("Para la ecuacion 1, por favor ingresa el valor de los coeficientes: \na: ");
			double varAE1= lector.nextInt();
			System.out.println("b: ");
			double varBE1= lector.nextInt();
			System.out.println("c: ");
			double varCE1= lector.nextInt();
			
			if(varAE1==0) {
				throw new DivisionEntreCeroException();
			}
			else {
				double determinante= (varBE1*varBE1)-(4*varAE1*varCE1);
				
				if(determinante<0){
					throw new RaicesImaginariasException();
				}
				else {
					EcuacionSegGrado ec1= new EcuacionSegGrado();//creamos un objeto con el constructor vacio
					ec1.setValores(varAE1, varBE1, varCE1);
					System.out.println("La ecuacion 1 tiene las raices r1= " + ec1.CalculaRaizPositiva() + " y r2= " + ec1.CalculaRaizNegativa() + ".");
				}
			}
		}
		catch(DivisionEntreCeroException dece) {
			System.out.println(dece.getMessage());
		}
		catch(RaicesImaginariasException rie) {
			System.out.println(rie.getMessage());
		}
		catch(InputMismatchException ime) {
			System.out.println("Lo que ingresaste no es un numero. Por favor, vuelve a intentar.");
			ecuacion1(lector);
		}
	}
	
	public static void ecuacion2(Scanner lector) {
		try {
			System.out.println("\nPara la ecuacion 2, por favor ingresa el valor de los coeficientes: \na: ");
			double varAE2= lector.nextInt();
			System.out.println("b: ");
			double varBE2= lector.nextInt();
			System.out.println("c: ");
			double varCE2= lector.nextInt();
		
			if(varAE2==0) {
				throw new DivisionEntreCeroException();
			}
			else {
				double determinante= (varBE2*varBE2)-(4*varAE2*varCE2);
				
				if(determinante<0){
					throw new RaicesImaginariasException();
				}
				else {
					EcuacionSegGrado ec2= new EcuacionSegGrado(varAE2, varBE2, varCE2);//creamos otro objeto pero con el constructor no vacio
					System.out.println("La ecuacion 2 tiene las raices r1= " + ec2.CalculaRaizPositiva() + " y r2= " + ec2.CalculaRaizNegativa() + ".");
				}
			}
		}
		catch(DivisionEntreCeroException dece) {
			System.out.println(dece.getMessage());
		}
		catch(RaicesImaginariasException rie) {
			System.out.println(rie.getMessage());
			ecuacion2(lector);
		}
	}
}
