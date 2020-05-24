package LibroJava.Programacion_estructurada;

//Si en lugar de texto necesitamos datos numéricos, deberemos convertir la cadena
//introducida en un número con el método adecuado. Como se muestra en el ejemplo,
//Integer.parseInt() convierte el texto introducido por teclado en un dato numérico,
//concretamente en un número entero.

import javax.swing.*;
import java.util.Scanner;

public class EntradaDatosNumericosTeclado
{
    public static void main(String[] args)
    {
        int numero;

        int numero1;

        System.out.println(" Por favor, introduce un número por consola");

        Scanner entrada=new Scanner(System.in);

        numero=entrada.nextInt();


        numero1=Integer.parseInt(JOptionPane.showInputDialog(" Introduce otro númermo por esta ventanita "));

        System.out.println(" Has introducido por consola el número "+numero
        +" y por ventana el "+numero1);



    }
}
