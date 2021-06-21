package LibroJava.POO;

import java.util.Scanner;

public class PruebaAlumnoArrayObjetos {
    public static void main(String[] args) {

        //A continuación se define un array de objetos alumno de 5 posiciones
        //pero aún no creamos los objetos.

        AlumnoArrayObjetos[] alum = new AlumnoArrayObjetos[5];
        String nombreIntroiducido;
        double notaIntroducida = 0;
        Scanner entrada = new Scanner(System.in);
        double sumaDeMedias = 0;


        //Pedimos los datos de los alumnos

        System.out.println("Introduce nombre de alumno y su nota media");

        for (int i = 0; i < alum.length; i++) {

            alum[i] = new AlumnoArrayObjetos(); //en cada vuelta de bucle la posición del array
            //es igual a la creación de un nuevo objeto Alumno.

            System.out.println("Nombre: ");
            nombreIntroiducido = entrada.nextLine(); // recogemos nombre
            alum[i].setNombre(nombreIntroiducido); // asignamos nombre mediante setter

            System.out.println("Nota: ");
            notaIntroducida = entrada.nextDouble();
            entrada.nextLine(); // recogemos nota y limpiamos el buffer
            alum[i].setNotaMedia(notaIntroducida); // asignamos nota mediante setter


        }

        // Mostramos los datos de los alumnos

        System.out.println("Los datos introducidos son los siguientes: ");

        for (int i = 0; i < alum.length; i++) {

            System.out.println("El alumno " + alum[i].getNombre() + " tiene una nota " +
                    "media de " + alum[i].getNotaMedia());

            sumaDeMedias += alum[i].getNotaMedia();


        }

        System.out.println("\nLa nota media de todos los alumnos es " + sumaDeMedias / alum.length);

    }
}
