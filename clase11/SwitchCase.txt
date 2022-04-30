/*
Clase 11
https://www.youtube.com/watch?v=a79CwgcvNIg&list=PLDfQIFbmwhrfrz0eMwmgkpaDYHpdbXO73&index=16

Estructuras de control Switch - Case

Agiliza la toma de desiciones múltiples
Cómo una lista de opciones

Dentro del switch va parámetros
Parametro es una varible utilizada para introducir
valores de entrada para utilizar en el programa
En switch solo podemos colocar enteros o caracteres
Siempre colocar breaks
Terminar con un default

*/

import java.util.Scanner;

public class SwitchCase {
  public static void main(String args[]) {

   //variables
   int n = 0;
   String dia;
   
   //Instanciar scanner
   Scanner input = new Scanner(System.in);

   //Solicitud de datos al usuario
   System.out.println("Ingrese un día de la semana (número del 1 al 7)");
   n = input.nextInt();
   System.out.println(" ");
   
   //switch
   switch(n) {
    
    case 1:
      dia = "Lunes";
      break;
    case 2:
      dia = "Martes";
      break;
    case 3:
      dia = "Miercoles";
      break;
    case 4:
      dia = "Jueves";
      break;
    case 5:
      dia = "viernes";
      break; 
    case 6:
      dia = "sabado";
      break;
    case 7:
      dia = "Domingo";
      break;
    default:
      dia = "Día incorrecto. Debe ser entre 1 a 7.";
      break;
  }
   
   System.out.println("El día es: " + dia);
 }
}
