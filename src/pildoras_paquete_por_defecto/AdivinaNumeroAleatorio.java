package pildoras_paquete_por_defecto;

import java.util.Scanner;

public class AdivinaNumeroAleatorio
{
    public static void main(String[] args)
    {
        int aleatorio=(int)(Math.random()*100);
        //sintaxis de refundición + número random de 0 a 100

        /*System.out.println(Math.random());
        esta es la forma de crear un número aleatorio lo que pasa es
        que el método estático random de la clase Math,
        del paquete java.util(API JAVA), nos devuelve un double entre 0 y 1
        nosotrosqueremos un int entre 0 y 100 entonces...
        multiplicamos el random por  100
        para desplazar la coma
        y aplicamosuna refundición(CASTING) para pasarlo a int
         */


        Scanner read=new Scanner(System.in); //objeto Scanner

        int numero=-1;
        /*declaramos esta variable a -1 porque cabe la posibilidad de que el número
        aleatorio tome el valor de0, si pasara esto no entraría en el while.*/

        int intentos=0;

        while(numero!=aleatorio)//mientras el número introducido sea diferente del aleatorio
        {
            intentos++;

            System.out.println("introduce un número, por favor\n");

            numero=read.nextInt();
            //igualamos la variable número al siguiente entero introducido por consola

            if (aleatorio<numero)
            {
                System.out.println("más bajo");

            }
            else if (aleatorio > numero)
            {
                System.out.println("más alto");
            }
        }
        System.out.println("Correcto, has necesitado "+intentos+" intentos para averiguarlo");
    }
}
