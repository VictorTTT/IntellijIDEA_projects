package LibroJava.POO;
/*Del mismo modo que se pueden crear arrays de números enteros, decimales o
cadenas de caracteres, también es posible crear arrays de objetos.*/

//Vamos a definir la clase Alumnopara luego crear un array de objetos de esta clase.

import java.util.Scanner;

public class AlumnoArrayObjetos {

    private String nombre;
    private double notaMedia = 0.0;


    //me doy cuenta de que en estas clase no hay constructor, por lo que se asigna por defecto

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }


}
