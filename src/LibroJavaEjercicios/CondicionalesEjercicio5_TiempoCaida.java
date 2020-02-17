package LibroJavaEjercicios;

/*Realiza un programa que calcule el tiempo que tardará en caer un
        * objeto desde una altura h.
        * t = raiz(2h/g) siendo g = 9.81 m/s2*/

import javax.swing.*;

public class CondicionalesEjercicio5_TiempoCaida
{
    public static void main(String[] args)
    {
        System.out.println("Este programa calcula el tiempo de caida de un determinado objeto");

        double h=Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura en metros"));

        double t=Math.sqrt(2*h/g);

        System.out.printf("El objeto tarda en caer %.2f segundos\n",t);

        System.out.print("desde "+h+" metros ");

    }

    final static double g=9.81;//las constantes se declaran fuera del main
}


