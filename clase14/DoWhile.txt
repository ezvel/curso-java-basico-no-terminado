/*
Clase 14
Do While

Hacer..
..mientras la condición sea verdadera

do {
  ...
}while(condicion);

https://www.google.com/search?q=cu%C3%A1ndo+usar+un+while+y+cu%C3%A1ndo+un+do+while+en+java&sxsrf=ALiCzsb7Tb2aJHSlW-Fvn3AynZmPl4ZURg%3A1651358669225&source=hp&ei=zbttYsjVC_TL1sQPrY2ZwAQ&iflsig=AJiK0e8AAAAAYm3J3SQgDnWu59XXV4cj6btF4XSMdeOA&oq=&gs_lcp=Cgdnd3Mtd2l6EAEYATIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJzIHCCMQ6gIQJ1AAWABgmRVoAXAAeACAAQCIAQCSAQCYAQCwAQo&sclient=gws-wiz

https://www.youtube.com/watch?v=-5ECh0fAVJU&t=308s


Ejercicio
Realizar un programa que imprima en pantalla la siguiente serie numérica:
1000, 800, 600, 400, 200, 0,

*/


public class DoWhile {
  public static void main(String args[]) {
   
   int i = 1000;
   do {
    System.out.println(i + ", ");
    i-=200;
  }while(i >= 0);
 }
}

/*
Salida
	┌─[±][main ↑2 ?:1 ✗][clase14][]
	└─▪ java DoWhile 
	1000, 
	800, 
	600, 
	400, 
	200, 
	0, 

*/


