package LibroJavaEjercicios;

//Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
//convertir deberá estar almacenada en una variable.

import javax.swing.*;

public class EjercicioVariables5_ConversorPesetasEuros
{
    public static void main(String[] args)
    {
        double pesetas=Double.parseDouble(JOptionPane.showInputDialog(" introduce la cantidad de pesetas que quieres " +
                "convertir a euros"));

        double euros=pesetas/166.386;

        System.out.printf(pesetas+" pesetas  son %.3f euros ",euros);//ejemplo de salida con formatode 3 decimales
    }
}
