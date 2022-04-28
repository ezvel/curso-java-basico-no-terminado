/*
Clase 4
Variables y tipos de datos
Se diferencia los diferentes tipos de datos según la necesidad que permite
alojar

Primitivos
	byte (-128 hasta 127)
	short(-32768 hasta 32767)
	int(-2147483648 hasta 2147483647)
	long(muy grande...)
Decimales
	float(hasta 8 valores después del punto)
	double(hasta 15 valores desués del punto -> mayor precisión)
Otros
	char(un solo caracter, texto o numérico)
	boolean(true o false)

Tipos objeto
Hay que invocarlos
	String(cadena de textos) <- es una clase, una plantilla, un modelo, código a llamar y ejecutar
	
Variable
Espacio en memoria para almacenar datos
Para abrir un espacio en memoria necesito
	Tipo de dato
	Nombre
	
Tarea:
Hacer una suma de dos números

5 + 2 = 7

Necesito guardar los datos en memoria

Fuentes de estudio
https://www.youtube.com/watch?v=3vFjuw2JuXQ&list=PLDfQIFbmwhrfrz0eMwmgkpaDYHpdbXO73&index=3
https://www.youtube.com/watch?v=3vFjuw2JuXQ&list=PLDfQIFbmwhrfrz0eMwmgkpaDYHpdbXO73&index=3
https://youtu.be/Z8zAKYLZBqc?t=756

Notas
Si el tipo de dato es char -> ''
*/


public class VariablesTiposDeDatos{
  public static void main(String args[]){
	
	   
   //Variables prueba <- Los diferentes tipos de datos permiten optimizar el espacio en la memoria
   int numUno = 5;
   int numDos = 2;
   int resultado;
   char caracter = 'c';
   String cadena = "Hola";
   byte variable = 125;
   short variable2 = 32000;
   int variable3 = 20000000;
   long variable4 = 200000000;
   boolean booleano = false;
   boolean booleano2 = true;
   float flotante1 = 3.15f; // <- Se coloca f para distinguir del double
   double flotante2 = 3.45633332457;
   //Variables proyecto
   //Datos en variables
   String nameI = "Carlos";
   String nameHim = "Pedro";
   byte ageI = 23;
   byte ageHim = 25;
   int ageOur;
   float height = 1.70f;
   
  //Operación prueba
  //Operación y manipulación de datos proyecto
  resultado = numUno + numDos;
  ageOur = ageI + ageHim;
  

  //Salida prueba
  System.out.println("El resultado es " + resultado);
  System.out.println("El caracter es " + caracter);
  //variables proyecto 
  //Informacion salida
  System.out.println("Mi nombre es " + nameI + ". Mido " + height + ", y tengo " + ageI + " años. Mi amigo se llama " + nameHim + " y tiene " + ageHim + " años. Entre los dos sumamos " + ageOur + " años.");
 }
}

/*
Los datos son la mínima unidad de información sin sentido alguno, es decir, puede significar
muchas cosas. Por ejemplo, un número 2 puede ser 2 caramelos, 2 chocolates o el día 2 de octubre.
A partir de los datos puedo generar información realizando diferentes operaciones.

En el curso de Lucas se define información:

	"Información es un conjunto de datos organizados que al leerlos nos produce algún significado."

Además brinda un ejemplo:

"""
DATOS:
1er dato: 87654567
2do dato: 01/05
3er dato: 10pm

INFORMACIÓN
Turno renovación de pasaporte para el día 01/05 a las 10pm. EL ID del turno es 87654567

"""

Y dice que "Nosotros cómo programadores trabajamos con datos y generamos información"

La manera de trabajar con datos es con variables


*/

/*
Problema
Intenté sumar dos números byte pero me daba error
Consulté el problema
https://es.stackoverflow.com/questions/324623/por-qu%C3%A9-al-intentar-sumar-dos-variables-de-tipo-byte-short-y-asignar-el-resulta

"Java te está avisando que podría producirse desbordamiento y que eso conllevaría a un problema en el funcionamiento en tu programa"


*/


