package LibroJava.Programacion_estructurada;

//Si en lugar de texto necesitamos datos num�ricos, deberemos convertir la cadena
//introducida en un n�mero con el m�todo adecuado. Como se muestra en el ejemplo,
//Integer.parseInt() convierte el texto introducido por teclado en un dato num�rico,
//concretamente en un n�mero entero.

import javax.swing.*;
import java.util.Scanner;

public class EntradaDatosNumericosTeclado
{
    public static void main(String[] args)
    {
        int numero;

        int numero1;

        System.out.println(" Por favor, introduce un n�mero por consola");

        Scanner entrada=new Scanner(System.in);

        numero=entrada.nextInt();


        numero1=Integer.parseInt(JOptionPane.showInputDialog(" Introduce otro n�mermo por esta ventanita "));

        System.out.println(" Has introducido por consola el n�mero "+numero
        +" y por ventana el "+numero1);



    }
}
