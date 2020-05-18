package Ilerna_POO.Ilerna_Videotutorias.Excepciones;

import pidoras_Udemy_POO.EjerciciosUdemy_POO.Alumno;

public class AlumnosException extends RuntimeException{

    /*Hay que tener muy claro que en Java que todas las clases que declaremos
    * como excepciones deberán heredar o de Exception o de Runtime exception,
    * con la diferencia de que cuando herede de Exception, deberemos controlar
    * la excepción dentro de un bloque try catch
    *
    * Siempre que Java encuentra un error termina con la ejecuión del programa de forma repentina
    * con estas excepciones podemos lanzar un mensaje (en el caso de runtime exception)
    * ó indicarle al programa que siga con el ya mencionado try catch*/

    public AlumnosException(){  // creamos un constructor que no recibe parametros

        super("no existe el alumno seleccionado") ;

        /*Dentro de él llamamos al constructor de la clase padre y le pasamos el mensaje que queremos que
        * aparezca coundo se cometa el error */

    }

    public AlumnosException (String msg){  //podemos crear distintos constructores ,
        // en este recibimos el mensaje que queremos mostrar en la llamada del mismo
        super(msg);
    }

    /*También podemos sobreescribir los métodos que nos ofrecen las clases de las que estamos heredando
    * con la ayuda en IntelliJ Alt+insert override methods. Podemos comprobar que hay gran cantidad de ellos
    * y que podemos utilizar el que mejor nos convenga*/

    /*public String getMessage() {
        return "Mira que bien que ya se cómo se hace el tema de las excepciones";
        //  Si comentamos este constructor nos va a sacar el mensaje de los constructores de arriba
    }*/
}
