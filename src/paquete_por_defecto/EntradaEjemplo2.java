package paquete_por_defecto;

import javax.swing.*;

public class EntradaEjemplo2
{
    public static void main(String[] args)
    {
        String NombreUsuario=JOptionPane.showInputDialog("introduce tu nombre porfavor");
        //  clase  objeto         clase     m�todo est�tico
        //                         javax.
        //                         swing

        String edad= JOptionPane.showInputDialog("introduce la edad,por favor");
        //el m�todo JOtionPane almacena por defecto en String

        int edadUsuario=Integer.parseInt(edad);
        //de esta forma conseguimos transformar el string introducido en int

        edadUsuario++;

        System.out.println("Hola "+NombreUsuario+" el a�o que viene tendr�s "+(edadUsuario)+" a�os ");
    }
}
