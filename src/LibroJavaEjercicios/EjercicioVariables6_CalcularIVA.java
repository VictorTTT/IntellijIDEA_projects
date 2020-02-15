package LibroJavaEjercicios;


//Escribe un programa que calcule el total de una factura a partir de la base
//imponible (precio sin IVA). La base imponible estará almacenada en una
//variable.

import javax.swing.*;

public class EjercicioVariables6_CalcularIVA
{
    public static void main(String[] args)
    {
        double baseImponible=Double.parseDouble(JOptionPane.showInputDialog(" Introduce el coste del producto "));

        int porcentaje=Integer.parseInt(JOptionPane.showInputDialog(" Introduce el porcentaje al que está sujeto el producto "));

        double ivaFactura=(baseImponible*porcentaje)/100;

        double precioFactura=ivaFactura+baseImponible;

        System.out.printf("El precio total de la factua es = %.2f\n",precioFactura);

        System.out.printf(" lo que pagas de iva asciende a = %.2f",ivaFactura);

    }
}
