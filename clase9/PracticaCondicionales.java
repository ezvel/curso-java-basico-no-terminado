/*
Clase 9
Práctica

Enunciado:
La empresa Coca-Cola Company solicita un sistema que determine los días vacacionales
a los que tiene derecho un trabajador, tomando en cuenta las siguientes características:

Existen tres departamentos dentro de la empresa con sus respectivas claves:

	1. Departamento de Atención al cliente. (Clave 1)
	2. Departamento de logística. (Clave 2)
	3. Gerencia. (Clave 3)

Trabajadores con clave 1 (Atención al cliente):

	Con 1 año de servicio, reciben 6 días de vacaciones.
	Con 2 a 6 años de servicio, reciben 14 días de vacaciones.
	A partir de 7 años de servicio, reciben 20 días de vacaciones.

Trabajadores con clave 2 (Logística):

	Con 1 año de servicio, reciben 7 días de vacaciones.
	Con 2 a 6 años de servicio, reciben 15 días de vacaciones.
	A partir de 7 años de servicioo, reciben 22 días de vacaciones.

Trabajadores con clave 3 (Gerencia):

	Con 1 año de servicio, reciben 10 días de vacaciones.
	Con 2 a 6 años de servicio, reciben 20 días de vacaciones.
	A partir de 7 años de servicio, reciben 30 días de vacaciones.

Nota
El sistema debe de solicitar el "Nombre", "Clave del departamento" y "Antiguedad" del trabajador,
posteriormente mostrar un mensaje que contenga el nombre del trabajador y los días de vacaciones
a los que tiene derecho.

Ejemplos

	*Gerardo clave 3, tiene 3 años de servicio. Merece 20 días de vacaciones.
	*Luis clave 1, tiene 1 años de servicio. Merece 6 días de vacaciones.
	*Felix clave 2, tiene 12 años de servicio. Merece 22 días de vacaciones.
*/

//Mensaje de bienvenida:
//	Bienvenido al sistema vocacional de Coca-Cola Company

//Solución del problema

import java.util.Scanner;

public class PracticaCondicionales{
  public static void main(String args[]){
 
   //Variables
   String nombre;
   int clave;
   int antiguedad;

   //Instanciar clase Scanner
   Scanner input = new Scanner(System.in);
   
   //Bienvenida
   System.out.println("Bienvenido al sistema vocacional de Coca-Cola Company");

   //Solicitud de datos al usuario a procesar
   System.out.println("Indique su nombre: ");
   nombre = input.nextLine();
   System.out.println("Indique la clave a la que pertence: ");
   clave = input.nextInt();
   System.out.println("Indique sus años de antiguedad: ");
   antiguedad = input.nextInt();

   //Determinar días de vacaciones correspondidos

   //clave 1
   if (clave == 1) {

    if (antiguedad == 1) {
     System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " años de servicio. Merece 6 días de vacaciones");
   } else if (antiguedad >= 2 && antiguedad <= 6) {
     System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " años de servicio. Merece 14 días de vacaciones");
   } else if (antiguedad >= 7) {
     System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " años de servicio. Merece 20 días de vacaciones");
   }

  //clave 2
  }else if (clave == 2){

    if (antiguedad == 1) {
     System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " años de servicio. Merece 7 días de vacaciones");
   } else if (antiguedad >= 2 && antiguedad <= 6){
     System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " años de servicio. Merece 15 días de vacaciones");
   } else if (antiguedad >= 7) {
     System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " años de servicio. Merece 22 días de vacaciones");
   }

  //clave 3
  } else if (clave == 3){

   if (antiguedad == 1) {
     System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " años de servicio. Merece 10 días de vacaciones");
   } else if (antiguedad >= 2 && antiguedad <= 6) {
     System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " años de servicio. Merece 20 días de vacaciones");
   } else if (antiguedad >= 7) {
     System.out.println(nombre + " clave " + clave + ", tiene " + antiguedad + " años de servicio. Merece 30 días de vacaciones");
   }
  }
 }
}



/*
Errores

Así no 
System.out.prinln("variable + "string" + variable + "string"");

Así sí
System.out.prinln(variable + "string" + variable + "string");

*/

/*


Pruebas

	┌─[±][main ?:1 ✗][clase9][]
	└─▪ java PracticaCondicionales 
	Bienvenido al sistema vocacional de Coca-Cola Company
	Indique su nombre: 
	Gerardo
	Indique la clave a la que pertence: 
	3
	Indique sus años de antiguedad: 
	3
	Gerardo clave 3, tiene 3 años de servicio. Merece 20 días de vacaciones
	┌─[±][main ?:1 ✗][clase9][]
	└─▪ java PracticaCondicionales 
	Bienvenido al sistema vocacional de Coca-Cola Company
	Indique su nombre: 
	Luis
	Indique la clave a la que pertence: 
	1
	Indique sus años de antiguedad: 
	1
	Luis clave 1, tiene 1 años de servicio. Merece 6 días de vacaciones
	┌─[±][main ?:1 ✗][clase9][]
	└─▪ java PracticaCondicionales 
	Bienvenido al sistema vocacional de Coca-Cola Company
	Indique su nombre: 
	Félix
	Indique la clave a la que pertence: 
	2
	Indique sus años de antiguedad: 
	12
	Félix clave 2, tiene 12 años de servicio. Merece 22 días de vacaciones
	┌─[±][main ?:1 ✗][clase9][]
	└─▪ 

*/

