/*
Clase 5
Operadores


Operadores ariméticos

	+,-,*,/,^,(,),%,++

Prioridad entre operadores
	Paréntesis
	Potencia
	Multiplicacion y división
	Suma y resta

Operadores de incremento de decremento

	int a = 5;
	int b = ++a; -> Se incrementa la variable a a 6 y luego se almacena. Por eso la varible b vale 6
	int b = a++ -> Primero se utiliza el valor de la variable a -> 5 y luego se incrementa a 6. Por lo tanto si luego quiero imprimir a, va a valer 6 y b valdrá 5

Operadores de asignación

	variable = <- valor
	a+=100; -> a = a + 100
	a-=100; -> a = a - 100
	a*=100; -> a = a * 100
	a/=100; -> a = a / 100

Los operadores de asignación y de incremento o decremento se utilizá mucho en bucles.


Operadores relacionales

	==
	!=
	<
	<
	<=
	>=

Los operadaores relacionales se utilizan mucho en condicionales. Darán como resultado
un booleano: True o False

Operadores lógicos booleanos

	! not -> negación
	&     -> and
    |     -> or

	int x = 20;
	int y = 20;
	if(x == 20 & y == 30) -> esto dará un false porque las dos en conjunto no son verdadero
    if(x == 20 & y == 30) -> esto dará un true porque una de las dos es verdadero

Más información:
https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=466:operadores-logicos-en-java-igual-distinto-and-or-not-mayor-menor-cortocircuito-cu00634b&catid=68&Itemid=188

Nota:
Los demás operadores se prácticaran en temas posteriores cómo condicionales, bucles, entre otros.

*/


public class Operadores{
  public static void main(String args[]){
   
   int num1 = 2;
   int num2 = 4;
   int sum;
   int rest;
   int mult;
   float div;
   int resultadoSignos1;
   int resultadoSignos2;

   sum = num1 + num2;
   rest = num1 - num2;
   mult = num1 * num2;
   div = num1 / num2;
   resultadoSignos1 = num1 + num2 / 2;
   resultadoSignos2 = (num1 + num2) / 2;
   
   System.out.println("El resultado de la suma es: " + sum);
   System.out.println("El resultado de la resta es: " + rest);
   System.out.println("El resultado de la multiplicación es: " + mult);
   System.out.println("El resultado de la división es: " + div);
   System.out.println("El resultado es: " + resultadoSignos1);
   System.out.println("El resultado es: " + resultadoSignos2);
 }
}






