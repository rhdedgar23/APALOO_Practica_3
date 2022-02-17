/* ***********************DOCUMENTACION***********************
- Programa: Practica 3
- Version: Martes 30 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: Clase RaicesImaginariasException; una excepcion
  definida por el autor que advierte de un determinante menor 
  que cero (raices imaginarias) al obtener la raiz de una 
  ecuacion de segundo grado. 
- Datos de entrada: Sin datos de entrada
- Datos de salida: Sin datos de salida
**************************DOCUMENTACION*********************** */

public class RaicesImaginariasException extends Exception {
	
	RaicesImaginariasException(){
		super("Determinante menor que cero. Raices imaginarias.");
	}
	
	RaicesImaginariasException(String mensaje){
		super(mensaje);
	}
}
