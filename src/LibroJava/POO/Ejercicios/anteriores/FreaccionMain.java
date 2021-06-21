package LibroJava.POO.Ejercicios;

/*Crea la clase Fracci�n. Los atributos ser�n numerador y denominador. Y algunos de los
m�todos pueden ser invierte, simplifica, multiplica, divide, etc.*/

import java.util.Scanner;

public class FreaccionMain {

    public static void main(String[] args) {

        System.out.println("Este programa trabaja con fracciones");
        int numerador;
        int denominador;
        String respuesta;
        int n;
        Scanner entrada=new Scanner(System.in);

        System.out.println("Por favor, introduce un numerador para la fracci�n");
        numerador=entrada.nextInt();entrada.nextLine();

        System.out.println("Ahora, introduce el denominador de la fracci�n");
        denominador=entrada.nextInt();entrada.nextLine();

        Fraccion miFraccion=new Fraccion(numerador,denominador);

        System.out.println("La fracci�n que has elegido crear es: " +miFraccion.toString()+"\n");

        System.out.println("A la misma fracci�n si le di�semos la vuelta ser�a esta: "+miFraccion.invierte().toString()+"\n");

        System.out.println("Quieres multiplicar la fracci�n que has creado por alg�n n�mero en concreto?");
        respuesta=entrada.nextLine();
        if (respuesta.equalsIgnoreCase("si")){
            System.out.println("Introduce el n�mero que quieras: ");
            n=entrada.nextInt();
            System.out.println("En una fracci�n cuando se multiplica un n�mero solo afecta al numerador, el denominador permanece inalterado");
            System.out.println(miFraccion.multiplica(n));


        }else System.out.println("Continuamos entences...");

        System.out.println("ahora vamos a multiplicar la fracci�n que has creado por otra fracci�n.");
        Fraccion miFraccion2=new Fraccion(90,45);
        System.out.println(miFraccion.multiplica(miFraccion2));

        System.out.println("Pasemos a las divisiones");
        System.out.println("Dividiremos a fracci�n que has creado por 2 porque  no me apetece perder el tiempo pregunt�ndote");
        System.out.println(miFraccion.divide(2));
        System.out.println("Y tambi�n dividiremos la fracc�on por otra fracci�n, en este caso 6/3");
        Fraccion miFraccion3=new Fraccion(6,3);
        System.out.println(miFraccion.divide(miFraccion3));

        System.out.println("Por �ltimo la fracci�n que has creado se puede si,plificar de la siguiente forma:");
        System.out.println(miFraccion.simplifica());










    }
}
