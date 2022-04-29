/*
Condicionales

Problema

Realizar un programa que calcule el promedio final de tres materias y que el programa
nos indique si el alumno aprobó o reprobó

Nota para aprobar: 6

Calificaciones

	Matemáticas: 5
	Biología: 8
	Qúimica: 3

*/


public class SentenciaIf{
  public static void main(String args[]){

   int matematica = 5;
   int biologia = 8;
   int quimica = 6;
   int promedio = 0;

   promedio = (matematica + biologia + quimica) / 3;

   if (promedio >= 6) {
    System.out.println("El alumno aprobó con " + promedio);
  }else{
    System.out.println("El alumno desaprobó con " + promedio);
  }
 }
}










 
