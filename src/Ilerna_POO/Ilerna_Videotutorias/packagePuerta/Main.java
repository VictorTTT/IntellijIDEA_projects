package Ilerna_POO.Ilerna_Videotutorias.packagePuerta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        Puerta puerta1 = new Puerta();
        // puerta1.funcion_publica("Es una función publica");
        // puerta1.funcion_package("Es una función package");ç
        puerta1.setAncho(200);
        // System.out.println(puerta1.toString());
        System.out.println("Esto es una linea");
        System.err.println("Hay un error");
        try {
            int numero = System.in.read();
            byte bytes[]= new byte[5];
            System.in.read(bytes);
            
            System.out.println((char) numero);
        }catch(IOException ex){
            System.err.println("Error al leer desde System.in");
        }*/


        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        do {
            System.out.println("Introduce un numero entre el 1 y el 3.");
            System.out.println("Introduzca el 0 para salir");
            eleccion = teclado.nextInt();
        /*
        int eleccion = numero + \n
         */
            switch (eleccion) {
                case 0:
                    System.out.println("Fin del programa");
                    break;
                case 1:
                    System.out.println("Programa de suma en double");
                    System.out.println("Introduce un 1r valor");
                    double numero1 = teclado.nextDouble();
                    System.out.println("Introduce un 2o valor");
                    double numero2 = teclado.nextDouble();
                    System.out.println("La suma de los valores es: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("Introduce un nuevo texto");
                    teclado.nextLine();
                    String texto = teclado.nextLine();
                    System.out.println("El texto introducido es: " + texto);
                    break;
                case 3:
                    break;
                default:
                    System.err.println("Introduzca un valor valido");
            }
        } while (eleccion != 0);


    }
}
