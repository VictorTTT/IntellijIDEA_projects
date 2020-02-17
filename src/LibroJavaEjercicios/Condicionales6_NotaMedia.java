package LibroJavaEjercicios;

//Realiza un programa que calcule la media de tres notas.

import javax.swing.*;

public class Condicionales6_NotaMedia
{
    public static void main(String[] args)
    {
        System.out.println("Introduce las notas de 3 exámens para saber la media");

        double nota1=Double.parseDouble(JOptionPane.showInputDialog("Nota de examen 1"));

        double nota2=Double.parseDouble(JOptionPane.showInputDialog("Nota de examen 2"));

        double nota3=Double.parseDouble(JOptionPane.showInputDialog("Nota de examen 3"));

        double notaMedia=(nota1+nota2+nota3)/3;

        System.out.printf("La nota media de los tres exámenes es: %.2f ",notaMedia);

    }
}
