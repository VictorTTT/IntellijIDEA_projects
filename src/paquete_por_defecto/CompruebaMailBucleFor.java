package paquete_por_defecto;

import javax.swing.*;

public class CompruebaMailBucleFor
{
    public static void main(String[] args)
    {
        int arroba=0;

        int dot=0;


        String mail= JOptionPane.showInputDialog("introduce Mail");

        for (int i = 0; i < mail.length(); i++) //para i igual a cero; mientras que i sea menor que la longitud de mail;incrementa i de 1 en 1
        {
            if (mail.charAt(i)=='@') //evalua a cada vuelta de bucle si la posici�n que marca i contiene una '@'
            {
                arroba++;
            }
            if (mail.charAt(i)=='.')//evalua a cada vuelta de bucle si la posici�n que marca i contiene un '.'
            {
                dot++;
            }
        }

        if (arroba==1 && dot>=1)//tienen que cumplirse las 2
        {
            System.out.println("es correcto");
        }
        else
        {
            System.out.println("no es correcto");
        }


    }
}
