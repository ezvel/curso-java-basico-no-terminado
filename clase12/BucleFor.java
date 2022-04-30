/*
Ciclos for

Un ciclo o bucle es un estructura repetitiva que 
se repite HASTA que la CONDICION SE CUMPLA

Partes claves
	Condición
	instrucción
	contador de bucles. Se incrementará por cada vuelta

for(inicio; condicion; incremento){
  instrucción1
  ...
  ...
}

Proceso
	Hagase un bucle
	Que inicie por aquí
	Hasta aquí | condición
	Estamos en esta vuelta. Incremente
	Repetir si la condición no se cumplió 

Incrementos en 1 en 1 -> i++
Incrementos en 10 en 10 -> i+=10

for(int i = 1; i <= 5; i++){ 
  //System.out.println(i + ", "); <- Para saltos de linea
  System.out.print(i + ", "); <- Sin saltos de linea
}

Salida
	1, 2, 3, 4, 5

*/


public class BucleFor {
  public static void main(String args[]) {

   for(int i = 1; i <= 5; i++) {
    System.out.print(i + ", "); 
  } 
  
   System.out.print(" "); 
 }
}

