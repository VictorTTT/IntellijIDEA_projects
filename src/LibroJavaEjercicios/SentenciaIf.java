package LibroJavaEjercicios;

import javax.swing.*;

public class SentenciaIf
{
    public static void main(String[] args)
    {
        System.out.println("Vamos a ver cómo vas de geografía ");
        
        String respuesta= JOptionPane.showInputDialog("¿Cuál es la capital de Kiribaty?");
        
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
