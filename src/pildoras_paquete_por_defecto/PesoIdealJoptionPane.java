package pildoras_paquete_por_defecto;

import javax.swing.*;

public class PesoIdealJoptionPane
{
    public static void main(String[] args)
    {
        String genero="";

        do
        {
            genero=JOptionPane.showInputDialog("introduce tu g�nero (H/M)");

        } while (genero.equalsIgnoreCase("H")==false&&genero.equalsIgnoreCase("M")==false);
        //con genero.equalsIgnoreCase nos aseguramos de que nos valga el caracter tanto
        // en may�scula como en min�scula(por eso ignora Case)

        int altura=Integer.parseInt(JOptionPane.showInputDialog("introduce tu altura en cent�metros"));
        //variable entera que hay que parsear a int porque el m�todo showinputdialog utiliza string

        int pesoideal=0;

        if (genero.equalsIgnoreCase("H"))
        {
            pesoideal=altura-110;
        }
        else if (genero.equalsIgnoreCase("M"))
        {
            pesoideal=altura-120;
        }
        System.out.println("tu peso ideal es: "+pesoideal);
    }
}
