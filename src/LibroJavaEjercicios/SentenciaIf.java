package LibroJavaEjercicios;

import javax.swing.*;

public class SentenciaIf
{
    public static void main(String[] args)
    {
        System.out.println("Vamos a ver c�mo vas de geograf�a ");
        
        String respuesta= JOptionPane.showInputDialog("�Cu�l es la capital de Kiribaty?");
        
        if (respuesta.equalsIgnoreCase("Tarawa"))//para comparar dos cadenas de caracteres se utiliza equals().
        {
            System.out.println("La respuesta es correcta");
        }
        else
        {
            System.out.println("Lo siento, respuesta incorrecta");
        }
        
        
    }
}
