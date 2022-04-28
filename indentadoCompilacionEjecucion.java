/*

CLASE 2 JAVA
INDENTADO, COMPILACIÓN Y EJECUCIÓN

Una clase es una plantilla donde escribiremos el codigo
El código se lee de arriba a abajo y de derecha a izquierda
Escribir primero el nombre de clase
El metodo main va a dar inicio al programa o su arranque
Sin el método main no arrancará el programa
va a ser de tipo publico <- va a ser una clase <- nombre de clase

1.Una vez finalizado, se guarda con extensión .java y con el mismo nombre que el nombre de la clase
2.Una vez guardado, abrir la terminal y me dirijo a la carpeta que contiene el archivo
3.A través de javac puedo comunicarme con el archivo .java
4.Javac traduce el codigo escrito a lenguaje máquina o bytecode con el compilador
5.javac indentado-compilacion-ejecucion.java 
6.Genera un archivo .class escrito en código máquina o bytecode
7.Ejecuto el archivo .class sin el nombre de la extensión
java indentadoCompilacionEjecucion

*/



public class indentadoCompilacionEjecucion{     // <- nombre de la clase {}
  public static void main(String args[]){         // <- nombre metodo main {}
   System.out.println("Hello world!");             // <- nombre de la instruccion ;
 }
}



/*
ERRORES

LOS NOMBRES DE LOS METODOS SIN GUIONES, SINO 
indentacionCompilacionEjecucion
POR LO TANTO LOS NOMBRES DE LOS ARCHIVOS
indentacionCompilacionEjecucion.java
ES System.out.println Y NO System.out.printin

Error: LinkageError occurred while loading main class indentadoCompilacionEjecucion
	java.lang.UnsupportedClassVersionError: indentadoCompilacionEjecucion has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 55.0

EL PROBLEMA ES QUE COMPILA JAVA A UNA VERSIÓN MÁS ACTUAL
https://stackoverflow.com/questions/64742252/how-to-fix-java-unsupportedclassversionerror

Buscar java major version numbers en Google
https://stackoverflow.com/questions/9170832/list-of-java-class-file-format-major-version-numbers

PASOS HACIA LA SOLUCIÓN
https://www.youtube.com/watch?v=KeMuaR4R_1o

	─[curso_java_basico][]
	└─▪ echo $JAVA_HOME
 
	┌─[curso_java_basico][]
	└─▪ cd /usr/lib/jvm/
	┌─[jvm][]
	└─▪ ll
	total 12K
	lrwxrwxrwx 1 root  root    25 mar 24 09:02 default-java -> java-1.11.0-openjdk-amd64/
	lrwxrwxrwx 1 root  root    21 mar 27 06:32 java-1.11.0-openjdk-amd64 -> java-11-openjdk-amd64/
	-rw-r--r-- 1 root  root  2,0K abr 22 10:06 .java-1.11.0-openjdk-amd64.jinfo
	drwxr-xr-x 7 root  root  4,0K abr 28 11:21 java-11-openjdk-amd64/ <- COPIAR
	drwxr-xr-x 9 10668 10668 4,0K abr 25 16:47 jdk-17/
	┌─[jvm][]
	└─▪ cd /usr/lib/jvm/java-11-openjdk-amd64 <- PEGAR Y COPIAR
	┌─[jvm][]
	└─▪ export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64/ <- PEGAR
	┌─[jvm][]
	└─▪ echo $JAVA_HOME
	/usr/lib/jvm/java-11-openjdk-amd64/ 
	┌─[jvm][]
	└─▪ export PATH=$PATH:$JAVA_HOME/bin
	┌─[jvm][]
	└─▪ echo $PATH
	/home/ezvelq/.nvm/versions/node/v16.14.2/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin:/snap/bin:/usr/lib/jvm/java-11-openjdk-amd64//bin

He leído este artículo sobre lo hecho anteriormente pero sigo sin entenderlo
https://javiermartinalonso.github.io/java/2016/11/06/java-Variables-Entorno-JAVA.html#:~:text=JAVA_HOME%2C%20es%20una%20variable%20de,la%20activa%20en%20el%20sistema.

En este video entendí que el comando java no funcion si no tiene una variable de entorno
https://www.youtube.com/watch?v=MIIJkx9diu4

Siguiente artículo de cursos del MIT
https://missing.csail.mit.edu/2020/course-shell/
En este artícul entendí que los comandos que volcamos en la terminal son programas que se ejecutan, así cómo cuándo escribimos lo siguiente

	java --version
	javac --version

Frente a esto nos podemos preguntar lo que se pregunta el autor o los autores:
¿Cómo sabe el shell cómo encontrar los programas date o echo?, o en nuestro caso:
¿Cómo sabe el shell cómo encontrar el programa java al tipearlo en la termonal?
El artículo sigue, la terminal es un entorno de programación, por lo tanto al escribir comandos está escribiendo código que ejecutará la shell, a ver si entiendo bien, el shell debe ejecutar buscando en una lista de directorios dónde se encuentra el programa a ejecutar. Esa ruta nos las brinda el PATH, que es "es una variable de entorno del sistema que informa al Sistema Operativo sobre la ruta de distintos directorios fundamentales para el funcionamiento de los programas. En la variable PATH debemos indicar donde se encuentran los programas ejecutables de Java necesarios para el desarrollo de aplicaciones como pueden ser el compilador (javac) y el intérprete(java). Es donde el intérprete de comandos buscará los comandos de ejecución que escribamos en la consola, siempre y cuando no usemos una ruta específica para llamar al comando."

y el JAVA_HOME es, "una variable de entorno del sistema que informa al Sistema Operativo sobre la ruta dónde se encuentra instalado Java. Por ejemplo si tenemos instalada más de una versión de Java, sirve para indicar cuál es la activa en el sistema""

Sinteizando, el shell busca el programa que quiere ejecutar escrito en la terminal en un ruta establecida por el PATH, luego la ejecuta. Por eso es importante configurar el PATH cuándo instalamos Java para que no nos salte algo cómo esto

"Java" no se reconoce cómo un comando interno o externo...

Es decir, cómo se dice en el presente curso:

	"NO PORQUE HAYAS INSTALADO EL JDK SIGNIFICA QUE YA PUEDES PROGRAMAR EN JAVA(...)"


Por esta razón en los comandos anteriores desarrollamos el siguiente proceso lógico

1. Le pedimos que imprima en pantalla la ruta del $JAVA_HOME
	echo $JAVA_HOME
	...
 
2. Nos dirijimos hacia la ubicación de la maquina virtual de Java
	cd /usr/lib/jvm/

3. Copiamos la ruta de java y lo pegamos en la ruta
	cd /usr/lib/jvm/java-11-openjdk-amd64

4. Agregamos la ruta a JAVA_HOME
	export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64/

5. Ahora el Sistema operativo sabe dónde está instalado Java. 
	echo $JAVA_HOME
	/usr/lib/jvm/java-11-openjdk-amd64/ 

6. Procedemos agegarlo al PATH para que al ejecutar el comando en la terminal lo encuentra en la lista de directorios
	export PATH=$PATH:$JAVA_HOME/bin
	/home/ezvelq/.nvm/versions/node/v16.14.2/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/games:/usr/local/games:/snap/bin:/snap/bin:/usr/lib/jvm/java-11-openjdk-amd64//bin

7 . Listo



CONTINÚA EL ERROR
https://www.youtube.com/watch?v=T5aDBfZ9j-k

EL ERROR OCURRÍA PORQUE ESTABA COMPILANDO MI ARCHIVO A ARCHIVO.JAVA EN UNA VERSIÓN MÁS RECIENTE. ES DECIR EL JDK O KIT DE DESARROLLO DE JAVA TENÍA UNA VERSIÓN MÁS RECIENTE QUE EL JRE O ENTORNO DE DESARROLLO
DE JAVA

EL JDK COMPILA
EL JRE EJECUTA

POR ESA RAZÓN INTENTAR EJECUTAR A UNA VERSIÓN ANTERIOR DEL JRE LUEGO DE UNA COMPILACIÓN A UNA VERSIÓN
POSTERIOR CON EL JDK ME SURGÍA EL ERROR

https://www.digitalocean.com/community/tutorials/how-to-install-java-with-apt-on-ubuntu-20-04-es

ESTE ARTÍCULO ME AYUDÓ A INSTALAR EL JDK POR DEFECTO, EQUIPARANDO LA VERSIÓN DEL JDK A LA MISMA QUE EL JRE SOLUCIONANDO, ENTONCES, EL ERROR DE COMPILACIÓN

	sudo apt install default-jdk
	javac -version

	┌─[curso_java_basico][]
	└─▪ java --version
	openjdk 11.0.15 2022-04-19 <-
	OpenJDK Runtime Environment (build 11.0.15+10-Ubuntu-0ubuntu0.22.04.1)
	OpenJDK 64-Bit Server VM (build 11.0.15+10-Ubuntu-0ubuntu0.22.04.1, mixed mode, sharing)
	┌─[curso_java_basico][]
	└─▪ javac --version
	javac 11.0.15              <-

AHORA TODO SE EJECUTA SIN NINGÚN PROBLEMA

	┌─[curso_java_basico][]
	└─▪ ls
	indentadoCompilacionEjecucion.class  indentadoCompilacionEjecucion.java
	┌─[curso_java_basico][]
	└─▪ java indentadoCompilacionEjecucion 
	Hello world
	┌─[curso_java_basico][]
	└─▪ 

PRUEBAS
CAMBIO HELLO WORLD POR HELLO WORLD!
INTENTO EJECUTARLO PERO...

	┌─[curso_java_basico][]
	└─▪ java indentadoCompilacionEjecucion 
	Hello world
	┌─[curso_java_basico][]
	└─▪ 

ESTO OCURRE PORQUE COMPILAS UNA VEZ Y EJECUTAS MUCHAS VECES. EN OTRAS PALABRAS, POR MÁS QUE GUARDE
EL ARCHIVO DEBO COMPILARLO NUEVAMENTE PORQUE LO HE MODIFICADO. ES DECIR, AL EJECUTAR, EJECUTA EL
CÓDIGO COMPILADO. CUÁNDO LO GUARDÉ, HE GUARDADO EL ARCHIVO .JAVA, PERO EL CÓDIGO COMPILADO
A LENGUAJE MÁQUINA A EJECUTAR ES .CLASS. POR LO TANTO LUEGO DE GUARDAR VOY A COMPILAR EL CÓDIGO DE NUEVO, Y AHORA LO COMPILO. AL EJECUTARLO SUCEDE LO SIGUIENTE

Luego de modificar y guardar mi código:

	┌─[curso_java_basico][]
	└─▪ javac indentadoCompilacionEjecucion.java 
	┌─[curso_java_basico][]
	└─▪ ls
	indentadoCompilacionEjecucion.class  indentadoCompilacionEjecucion.java
	┌─[curso_java_basico][]
	└─▪ java indentadoCompilacionEjecucion 
	Hello world!
	┌─[curso_java_basico][]
	└─▪ 

Por lo tanto cada vez que guardas en Java, debes compilar el código y verificar que todo
esté correcto ejecutandolo.

TEMAS IMPORTANTES
https://www.youtube.com/watch?v=X8axa8-HuVI&list=PLDfQIFbmwhrfrz0eMwmgkpaDYHpdbXO73

¿Qué es JDK?
JDK es un kit de desarrollo para java donde se encuentra el compilador javac que permite compilar
los programas que se han gurdado. Lo que hace es transformar el código java a lenguaje máquina o bitcode que comprende las computadoras. Es decir, funciona cómo un traductor. Por lo tanto "el compilador es un traductor del código". 

¿Qué es el JRE?
Es un entorno de desarrollo de Java que se encarga de la ejecución del programa

¿Qué es la JVM?
Es la máquina virtual de Java se instala en el sistema operativo y ejecuta los archivos compilados en cualquier tipo de máquina: Linux Mac o Window

En resumen
https://www.youtube.com/watch?v=cjxR1n-al8g
El jdk es cómo una caja de herramienta dónde encontramos el compilador javc para traducir o compilar
el código digitado en Java a codigo máquina generando un archivo .class
El JRE es el entorno de ejecución de Java. Es una de las herramientas que posee la máquina virtual especificada para implementar el propósito de la máquina virtul instaladas en los sitemas operativos cómo Linux, Mac, Windows: Ejecutar los programas. Con esto podemos entender que podemos compilar una vez y ejecutarlos las veces que queramos en cualquier sistema operativo, ya que estos tienen instalados el JVM o máquina virtual de Java


Por lo tanto:

1. Se crea un programa Java escrito en ese lenguaje
2. Se genera un archivo .java
3. Lo compilamos con el compiador javac. Se crean los arhivos .class
4. Con el comando java podemos ejecutar los archivos .class. Lo ejecuta la maquina virtual de Java



*/
