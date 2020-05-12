package Ilerna_POO.Ilerna_Videotutorias;

import java.util.Scanner;

public class VideoTutuoria4 {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        int eleccion=0;

        do {

            System.out.println("introduce número entre 1 y 3");
            System.out.println("introduzca el 0 para salir");
            eleccion=teclado.nextInt();





            switch (eleccion) {

                case 0:
                    System.out.println("fin del programa");
                    break;

                case 1:
                    System.out.println("programa de suma en double");
                    System.out.println("introduce un primer valor");
                    double numero1 = teclado.nextDouble();
                    System.out.println("introduce un segundo valor");
                    double numero2 = teclado.nextDouble();
                    System.out.println("la suma de ambos valores es= " + (numero1 + numero2));
                    break;

                case 2:
                    System.out.println("introduce un nuevo texto ");
                    teclado.next();
                    String texto = teclado.nextLine();
                    System.out.println("El texto introducido es : " + texto);
                    break;

                case 3:
                    break;

                default:
                    System.err.println("valor erroneo");





            }
        }while (eleccion!=0);

    }


}
