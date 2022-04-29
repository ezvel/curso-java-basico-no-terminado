/*
Sentencia if anidada

Recursos:
https://www.youtube.com/watch?v=pPG66_BZ8-c&list=PLyvsggKtwbLX9LrDnl1-K6QtYo7m0yXWB&index=8
https://www.youtube.com/watch?v=ikzZXoU3P1c


Problema:

Realizar un programa que pueda realizar una suma, una resta, una multipliación o una división de dos
números enteros, dependiendo de la desición del usuario:

	Si la operación es igual a 1, realizar una suma
	Si la operación es igual a 2, realizar una resta
	Si la operación es igual a 3, realizaar una multiplicación
	Si la operación es igual a 4, realizar una división

Entender el problema
Lo que me está pidiendo el programa es que le solicite al usuario dos números y que 
con esos dos números haga determinadas operaciones aritmética. Solo se hará una, es decir
una suma, resta, multiplicació o división. Eso lo determinará el usuario. Este me dará determinadas
señales. Si me indica un 1 por pantalla, debo hacer una suma y así.

*/

/*
import java.util.Scanner;

public class SentenciaIfAnidada{
  public static void main(String args[]){
   
   //variables
   int num1 = 0;
   int num2 = 0;
   int resultado = 0;
   int suma = 0;
   int resta = 0;
   int multiplicacion = 0;
   float division = 0;
   int señal = 0;

   //instanciar clase Scanner
   Scanner entrada = new Scanner(System.in);
   
   //Solicitar números a usuarios y almacenarlos en variables
   System.out.println("Indique el primer número");
   num1 = entrada.nextInt();
   System.out.println("Indique el segundo número");
   num2 = entrada.nextInt();
   
   //Realizar operaciones alternativas
   suma = num1 + num2;
   resta = num1 - num2;
   multiplicacion = num1 * num2;
   division = num1 / num2;

  //Indicar la señal detonante del usuario para realizar una determinada operacion
  System.out.println("Indique que operación quiere realizar con los números que indicó: " + "\n" +  "1 = suma" + "\n" + "2 = resta" + "\n" + "3 = multiplicacion" + "\n" + "4 = division");

  señal = entrada.nextInt();

  if (señal == 1) {
    System.out.println("Indicó la suma: " +  num1 +  " + " + num2 + " = " + suma);
  }
  if (señal == 2) {
    System.out.println("Indicó la resta: " +  num1 + " + " + num2 + " = " + resta);
  }
  if (señal == 3) {
    System.out.println("Indicó la multiplicación: " +  num1 + " * " + (num2) + " = " + multiplicacion);
  }
  if (señal == 4) {
    System.out.println("Indicó la división: " +  (num1) + " / " + (num2) + " = " + division);
  }
 }
}

*/
/*

Pruebas

	┌─[±][main ↑2 U:1 ?:2 ✗][clase7][]
	└─▪ java SentenciaIfAnidada 
	Indique el primer número
	856
	Indique el segundo número
	349
	Indique que operación quiere realizar con los números que indicó: 
	1 = suma
	2 = resta
	3 = multiplicacion
	4 = division
	3
	Indicó la multiplicación: 856 * 349 = 298744


*/

/*

Notas: Tener en cuenta todas las ocaciones posibles. ¿Que ocurriría si el usuario marca una
señal diferente. Podriamos colocar "La opción que escogió no existe"?

*/

//Ahora lo voy a hacer luego de aprender else if o condiciones anidadaes

/*
Diferentes tipos de condicionales

Condicionales simples
Si ocurre esto
	Haz esto
Continuar programa...


Condicionales compuestos
Si ocurre esto
	Haz esto
Sino
	Haz esto
Continuar programa...

Condicionales anidados

Si ocurre esto
	Haz esto
Si ocurre esto
	Haz esto
Si ocurre esto
	Haz esto
Sino
	Haz esto
continuar programa...

Con operadores lógicos

Si (ocurre esto) y (ocurre lo otro) ...
Si (ocurre esto) o (ocurre lo otro) ...
...

*/


/*
Repetir problema

Problema:

Realizar un programa que pueda realizar una suma, una resta, una multipliación o una división de dos
números enteros, dependiendo de la desición del usuario:

	Si la operación es igual a 1, realizar una suma
	Si la operación es igual a 2, realizar una resta
	Si la operación es igual a 3, realizaar una multiplicación
	Si la operación es igual a 4, realizar una división

Entender el problema
Lo que me está pidiendo el programa es que le solicite al usuario dos números y que 
con esos dos números haga determinadas operaciones aritmética. Solo se hará una, es decir
una suma, resta, multiplicació o división. Eso lo determinará el usuario. Este me dará determinadas
señales. Si me indica un 1 por pantalla, debo hacer una suma y así.


*/

import java.util.Scanner;

public class SentenciaIfAnidada{
  public static void main(String args[]){
   
   //variables
   int opcion;
   int num1;
   int num2;
   int suma;
   int resta;
   int multiplicacion;
   int division;
   
   //Instancia la clase Scanner;
   Scanner entrada = new Scanner(System.in);
   
   //Solicitar los números al usuario
   System.out.println("¡¡Bienvenidos al juego de las operaciones!!");
   System.out.println("Indique el primer número: ");
   num1 = entrada.nextInt();
   System.out.println("Indique el segundo número: ");
   num2 = entrada.nextInt();
   
   //Solicitar la opción al usuario
   System.out.println("Indique que operación quiere realizar con los números que indicó: " + "\n" +  "1 = suma" + "\n" + "2 = resta" + "\n" + "3 = multiplicacion" + "\n" + "4 = division");
   opcion = entrada.nextInt();
   
   //Realizar la operación según la opción indicada por el usuario
   if (opcion == 1) {
    suma = num1 + num2;
    System.out.println("Escogío la suma. " + " El resultado es:  " + num1 + " + " + num2 + " = " + suma);
  }else if(opcion == 2){
    resta = num1 - num2;
    System.out.println("Escogío la resta. " + " El resultado es:  " + num1 + " - " + num2 + " = " + resta);
  }else if(opcion == 3){
    multiplicacion = num1 * num2;
    System.out.println("Escogío la multiplicacion. " + " El resultado es:  " + num1 + " * " + num2 + " = " + multiplicacion);
  }else if(opcion == 4){
    division = num1 / num2;
    System.out.println("Escogío la division. " + " El resultado es:  " + num1 + " / " + num2 + " = " + division);
  }else{
    System.out.println("La opción que escogió no existe. Por favor indica la opción dentro del rango indicado");
  }
 }
}

/*
SALIDA POR PANTALLA

	┌─[±][main ↑2 U:1 ?:2 ✗][clase7][]
	└─▪ java SentenciaIfAnidada 
	¡¡Bienvenidos al juego de las operaciones!!
	Indique el primer número: 
	45
	Indique el segundo número: 
	57
	Indique que operación quiere realizar con los números que indicó: 
	1 = suma
	2 = resta
	3 = multiplicacion
	4 = division
	2
	Escogío la resta.  El resultado es:  45 - 57 = -12  
	┌─[±][main ↑2 U:1 ?:2 ✗][clase7][]
	└─▪ java SentenciaIfAnidada 
	¡¡Bienvenidos al juego de las operaciones!!
	Indique el primer número: 
	48
	Indique el segundo número: 
	92
	Indique que operación quiere realizar con los números que indicó: 
	1 = suma
	2 = resta
	3 = multiplicacion
	4 = division
	3
	Escogío la multiplicacion.  El resultado es:  48 * 92 = 4416
	┌─[±][main ↑2 U:1 ?:2 ✗][clase7][]
	└─▪ 

Fuentes
https://www.delftstack.com/es/howto/java/print-new-line-java/
Me ayudó a entender cómo imprimir por pantalla en varias lineas

	   System.out.println("Indique que operación quiere realizar con los números que indicó: " + "\n" +  "1 = suma" + "\n" + "2 = resta" + "\n" + "3 = multiplicacion" + "\n" + "4 = division");
	   opcion = entrada.nextInt();

Resultado
	Indique que operación quiere realizar con los números que indicó: 
	1 = suma
	2 = resta
	3 = multiplicacion
	4 = division


*/








