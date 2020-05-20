package Ilerna_POO.Ilerna_Videotutorias.Mapas;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap<String,AlumnoMapas>  alumnos = new HashMap<>();//  Este tipo de coleccion, no tiene orden, pero accede rápidamente al tipo/objeto
        // deseado mediante una llave/identificador. Dentro de de los diamantes tenemos que poner a la izqierda el
        // identificador y a la derecha el valor(k/v)

        alumnos.put("53376730D",new AlumnoMapas("Víctor Tena",36));
        //  De esta forma hemos creado un alumno que se encuentra dentro de un Map, identificado por su dni.
        //  Como podemos observar, dentro del método put de la clase hasmap hemos puesto el string deseado que será la clave y
        // lo hemos asociado con el constructor de la clase alumno que recibe nombre y edad.
        alumnos.put("53376731D",new AlumnoMapas("Perdrito",37));
        alumnos.put("53376732D",new AlumnoMapas("Pablito",38));
        alumnos.put("53376743D",new AlumnoMapas("Paquito",39));
        alumnos.put("53376736D",new AlumnoMapas("Salmon",31));
        alumnos.put("53376735D",new AlumnoMapas("Pechuga ",26));
        alumnos.put("53376737D",new AlumnoMapas("Langosta",46));
        alumnos.put("53376738D",new AlumnoMapas("Bogavante",96));
        alumnos.put("53376739D",new AlumnoMapas("Pimiento",32));
        //  Se pueden tener diferentes clves para mismos elementos
        alumnos.put("53377551W",new AlumnoMapas("Víctor Tena",36));

        System.out.println(alumnos.get("53376730D")); //  Forma de recuperar un elementoi del Map

        System.out.println(alumnos.keySet());  //  Forma de recuperar todas las claves que componen el HasMap

        System.out.println(alumnos.get("53376738D"));  //  El bogavante

        Scanner entrada= new Scanner(System.in);  //  Ahora vamos a hacer que el programa te pida el alumnoo que debes introducir

        String alumno= entrada.next();  //  almacenamos

        System.out.println(alumnos.get(alumno));  //  Pasamos el String al método get, en la ejecución comprobamos que
         //Se nos ofrecen todas las claves y que podemos simplemente copiar y pegar la que deseamos


        System.out.println("Todods los alumnos: ");
        for (AlumnoMapas a:alumnos.values()){  //  Aquí estamos iterando con un for each el hasmap
            // combinado con el método values que nos devolverá  el valor del alumno a cada vuelta de bucle
            System.out.println(a);

        }

        System.out.println(alumnos.get("ASD"));  //  Cuando intentamos recuperar un valor que no existe nos devuelve un null
        //  Pero no se detiene el programa


    }
}
