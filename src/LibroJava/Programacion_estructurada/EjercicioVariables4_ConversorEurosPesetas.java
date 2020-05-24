package LibroJava.Programacion_estructurada;

//Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
//convertir deberá estar almacenada en una variable.

import javax.swing.*;

public class EjercicioVariables4_ConversorEurosPesetas
{
    public static void main(String[] args)
    {
        double cantidad= Double.parseDouble(JOptionPane.showInputDialog(" Introduce la cantidad de " +
                "Eurosque quieres convertir a pesetas "));

        double pesetas= cantidad*166.386;

        System.out.println(cantidad+" Euros son "+pesetas+" pesetas ");
    }
}
