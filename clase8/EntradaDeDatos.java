/*

Scanner

Podemos hacer la programación mucho más dinámico, y hacer uso de condicionales de manera más
dinámica con las entradas de datos por pantalla. Es decir, podemos pedir datos al usuario, y que
dependiendo de lo que se ingrese por pantalla o consola se realicen determinadas operaciones y 
se obtengan determinados resultados

Para ello vamos a hacer uso de una librería que posee el jkd, es decir, el kit de desarrollo
de Java, llamada Scanner. 

Aclaración
Una librería es un conjunto de clases que contienen atributos y métodos, es decir, son un 
conjunto de códigos ya escritos que al nombrarlos, o bien, llamarlos podemos ejecutar ese código.

Entonces procedemos a importarla

import java.util.Scanner;

nextLine
nextInt

*/


import java.util.Scanner;

public class EntradaDeDatos{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   String nombre = "";
   int num1 = 0, num2 = 0, resultado = 0;
   
   System.out.println("Ingrese su nombre: ");
   nombre = in.nextLine();

   System.out.println("Ingrese primer valor");
   num1 = in.nextInt();

   System.out.println("Ingrese el segundo valor");
   num2 = in.nextInt();

   resultado = num1 + num2;
 
   System.out.println("Su nombre es " + nombre + ". El resultado de su suma es " + resultado);
 }
}


/*
Errores:
	┌─[±][main ↑1 ?:2 ✗][clase8][]
	└─▪ javac EntradaDeDatos.java 
	EntradaDeDatos.java:34: error: cannot find symbol
	   int num1 = 0; num2 = 0; resultado = 0;

No puedo separar en una misma linea por puntos y comas (;), porque pertencen a la misma
linea, 3 variables con el mismo tipo de dato. NO SON LINEAS DIFERENTES. Usar comas(,)


*/


