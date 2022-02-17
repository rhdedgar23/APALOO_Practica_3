/* ***********************DOCUMENTACION***********************
- Programa: Practica 3
- Version: Martes 30 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: 
- Datos de entrada: Sin datos de entrada
- Datos de salida: Sin datos de salida
**************************DOCUMENTACION*********************** */

public class EcuacionSegGrado {
	private double a, b, c;
	private double r1, r2;
	
	public EcuacionSegGrado(){//constructor vacio
		a=0;
		b=0;
		c=0;
	}
	
	public EcuacionSegGrado(double a, double b, double c) {//constructor no vacio
		this.a= a;
		this.b= b;
		this.c= c;
	}
	
	//metodo-funcion que realiza las operaciones para el calculo de una ecuacion de segundo
	//grado donde -b+raiz
	public double CalculaRaizPositiva() {
		double det= (b*b)-(4*a*c);
		r1= (-b + Math.sqrt(det))/(2*a);
		return r1;
	}
	
	//metodo-funcion que realiza las operaciones para el calculo de una ecuacion de segundo
	//grado donde -b-raiz
	public double CalculaRaizNegativa() {
		double det= (b*b)-(4*a*c);
		r1= (-b - Math.sqrt(det))/(2*a);
		return r2;
	}
	
	public void setValores(double a, double b, double c) {
		this.a= a;
		this.b= b;
		this.c= c;
		
	}
}
