/*
Clase 13 
Bucle While

Mientras la condición sea false
Repetir hasta que la condición sea verdadera
Incrementar por cada bucle

Ejercicio:
Realizar un programa que imprima en pantalla la siguiente serie numérica: 1, 3, 5, 7, 9

int i = 1;

while(i < 10){
  System.out.println(i + ", ");
  i+=2;
}


*/

public class BucleWhile {
  public static void main(String args[]) {
   int i = 1;
   while(i < 10) {
    System.out.println(i + ", ");
    i+=2;
  }
 }
}


/*
Salida

	┌─[±][main ↑1 ?:1 ✗][clase13][]
	└─▪ java BucleWhile 
	1, 
	3, 
	5, 
	7, 
	9, 

*/




