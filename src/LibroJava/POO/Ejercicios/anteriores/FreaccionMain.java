package LibroJava.POO.Ejercicios;

/*Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de los
métodos pueden ser invierte, simplifica, multiplica, divide, etc.*/

import java.util.Scanner;

public class FreaccionMain {

    public static void main(String[] args) {

        System.out.println("Este programa trabaja con fracciones");
        int numerador;
        int denominador;
        String respuesta;
        int n;
        Scanner entrada=new Scanner(System.in);

        System.out.println("Por favor, introduce un numerador para la fracción");
        numerador=entrada.nextInt();entrada.nextLine();

        System.out.println("Ahora, introduce el denominador de la fracción");
        denominador=entrada.nextInt();entrada.nextLine();

        Fraccion miFraccion=new Fraccion(numerador,denominador);

        System.out.println("La fracción que has elegido crear es: " +miFraccion.toString()+"\n");

        System.out.println("A la misma fracción si le diésemos la vuelta sería esta: "+miFraccion.invierte().toString()+"\n");

        System.out.println("Quieres multiplicar la fracción que has creado por algún número en concreto?");
        respuesta=entrada.nextLine();
        if (respuesta.equalsIgnoreCase("si")){
            System.out.println("Introduce el número que quieras: ");
            n=entrada.nextInt();
            System.out.println("En una fracción cuando se multiplica un número solo afecta al numerador, el denominador permanece inalterado");
            System.out.println(miFraccion.multiplica(n));


        }else System.out.println("Continuamos entences...");

        System.out.println("ahora vamos a multiplicar la fracción que has creado por otra fracción.");
        Fraccion miFraccion2=new Fraccion(90,45);
        System.out.println(miFraccion.multiplica(miFraccion2));

        System.out.println("Pasemos a las divisiones");
        System.out.println("Dividiremos a fracción que has creado por 2 porque  no me apetece perder el tiempo preguntándote");
        System.out.println(miFraccion.divide(2));
        System.out.println("Y también dividiremos la fraccíon por otra fracción, en este caso 6/3");
        Fraccion miFraccion3=new Fraccion(6,3);
        System.out.println(miFraccion.divide(miFraccion3));

        System.out.println("Por último la fracción que has creado se puede si,plificar de la siguiente forma:");
        System.out.println(miFraccion.simplifica());










    }
}
