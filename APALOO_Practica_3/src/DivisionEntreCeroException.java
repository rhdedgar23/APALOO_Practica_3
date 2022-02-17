/* ***********************DOCUMENTACION***********************
- Programa: Practica 3
- Version: Martes 30 de noviembre de 2021
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: Clase DivisionEntreCeroException; una excepcion
  definida por el autor que advierte de una division entre cero
  al obtener la raiz de una ecuacion de segundo grado. 
- Datos de entrada: Sin datos de entrada
- Datos de salida: Sin datos de salida
**************************DOCUMENTACION*********************** */

public class DivisionEntreCeroException extends Exception {
	
	public DivisionEntreCeroException() {
		super("Division entre cero! No puedes dividir entre cero.");
	}
	
	public DivisionEntreCeroException(String mensaje) {
		super(mensaje);
	}
}
