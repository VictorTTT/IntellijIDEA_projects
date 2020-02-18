package LibroJavaEjercicios;

//Escribe un programa que nos diga el horóscopo a partir del día y el mes de
//nacimiento.

import javax.swing.*;

public class CondicionalesEjercicio7_Horoscopo
{
    public static void main(String[] args)
    {
        System.out.println("Introduce tu fecha de nacimiento para indicarte a que horóscopo perteneces\n");
        
        int dia = Integer.parseInt(JOptionPane.showInputDialog("introduce el día"));
        
        int mes = Integer.parseInt(JOptionPane.showInputDialog("introduce el mes"));
        
        
        if (dia >= 22 && mes == 12 || dia <= 20 && mes == 1)
        {
            System.out.println("Capricornio");
        }
        if (dia >= 21 && mes == 1 || dia <= 19 && mes == 2)
        {
            
            System.out.println("Acuario");
        }
        if (dia >= 20 && mes == 2 || dia <= 20 && mes == 3)
        {
            System.out.println("Piscis");
        }
        if (dia >= 21 && mes == 3 || dia <= 20 && mes == 4)
        {
            System.out.println("Aries");
        }
        if (dia >= 21 && mes == 4 || dia <= 21 && mes == 5)
        {
            System.out.println("Tauro");
        }
        if (dia >= 22 && mes == 5 || dia <= 21 && mes == 6)
        {
            System.out.println("Géminis");
        }
        if (dia >= 22 && mes == 6 || dia <= 23 && mes == 7)
        {
            System.out.println("Cáncer");
        }
        if (dia >= 24 && mes == 7 || dia <= 23 && mes == 8)
        {
            System.out.println("Leo");
        }
        if (dia >= 24 && mes == 8 || dia <= 23 && mes == 9)
        {
            System.out.println("Virgo");
        }
        if (dia >= 24 && mes == 9 || dia <= 23 && mes == 10)
        {
            System.out.println("Libra");
        }
        if (dia >= 24 && mes == 10 || dia <= 22 && mes == 11)
        {
            System.out.println("Escorpio");
        }
        if (dia >= 23 && mes == 11 || dia <= 21 && mes == 12)
        {
            System.out.println("Sagitario");
        }
        
        
    }
}
