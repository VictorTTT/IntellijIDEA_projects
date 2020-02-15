package pildoras_paquete_por_defecto;

import java.util.Scanner;

public class AdivinaNumeroAleatorio
{
    public static void main(String[] args)
    {
        int aleatorio=(int)(Math.random()*100);
        //sintaxis de refundici�n + n�mero random de 0 a 100

        /*System.out.println(Math.random());
        esta es la forma de crear un n�mero aleatorio lo que pasa es
        que el m�todo est�tico random de la clase Math,
        del paquete java.util(API JAVA), nos devuelve un double entre 0 y 1
        nosotrosqueremos un int entre 0 y 100 entonces...
        multiplicamos el random por  100
        para desplazar la coma
        y aplicamosuna refundici�n(CASTING) para pasarlo a int
         */


        Scanner read=new Scanner(System.in); //objeto Scanner

        int numero=-1;
        /*declaramos esta variable a -1 porque cabe la posibilidad de que el n�mero
        aleatorio tome el valor de0, si pasara esto no entrar�a en el while.*/

        int intentos=0;

        while(numero!=aleatorio)//mientras el n�mero introducido sea diferente del aleatorio
        {
            intentos++;

            System.out.println("introduce un n�mero, por favor\n");

            numero=read.nextInt();
            //igualamos la variable n�mero al siguiente entero introducido por consola

            if (aleatorio<numero)
            {
                System.out.println("m�s bajo");

            }
            else if (aleatorio > numero)
            {
                System.out.println("m�s alto");
            }
        }
        System.out.println("Correcto, has necesitado "+intentos+" intentos para averiguarlo");
    }
}
