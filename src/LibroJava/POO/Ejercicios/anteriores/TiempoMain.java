package LibroJava.POO.Ejercicios;

import java.util.Scanner;

public class TiempoMain {
    public static void main(String[] args) {

        int horas, minutos, segundos;
        Scanner entrada=new Scanner(System.in);


        System.out.println("Bienvenido al programa que calcula la suma o la resta entre dos tiempos");

        System.out.println("Introduce horas: ");
        horas=entrada.nextInt();entrada.nextLine();

        System.out.println("Introduce minutos: ");
        minutos=entrada.nextInt();entrada.nextLine();

        System.out.println("Introduce segundos: ");
        segundos=entrada.nextInt();entrada.nextLine();

        Tiempo tiempo1=new Tiempo(horas,minutos,segundos);
        System.out.println("El primer tiempo que has introducido es: "+tiempo1.toString());

        System.out.println("ahora introduce otro tiempo para hacer las operaciones: ");

        System.out.println("Introduce horas: ");
        horas=entrada.nextInt();entrada.nextLine();

        System.out.println("Introduce minutos: ");
        minutos=entrada.nextInt();entrada.nextLine();

        System.out.println("Introduce segundos: ");
        segundos=entrada.nextInt();entrada.nextLine();

        Tiempo tiempo2=new Tiempo(horas,minutos,segundos);
        System.out.println("El segundo tiempo que has introducido es: "+tiempo1.toString());

        System.out.println("El tiempo 1 + el tiempo 2 da como resultado: "+tiempo1.sumaTiempo(tiempo2));
        System.out.println("El tiempo 1 - el tiempo 2 da como resultado: "+tiempo1.restaTiempo(tiempo2));



    }
}
