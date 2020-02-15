package pildoras_paquete_por_defecto;

import javax.swing.*;

public class UsoArrays3Foreach
{
    public static void main(String[] args)
    {
        String[] matriz=new String[8];

        for (int i = 0; i < matriz.length; i++)
        {
            matriz[i]= JOptionPane.showInputDialog("introduce un pais");
        }//rellenar una matriz con for

        for (String string : matriz)
        {
            System.out.println("Pais "+ string);
        }//imprimir contenido de una matriz con foreach



    }

}
