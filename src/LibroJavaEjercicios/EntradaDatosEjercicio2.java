package LibroJavaEjercicios;

//Escribe un programa que sume, reste, multiplique y divida dos n�meros
//introducidos por teclado.

import javax.swing.*;

public class EntradaDatosEjercicio2
{
    public static void main(String[] args)
    {
        System.out.println("Por favor, introduce 2 n�meros y haremos operacines b�sicas con ellos ");

        int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer n�mero "));

        int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo n�mero "));

        int suma=n1+n2;

        int resta=n1-n2;

        int multiplicci�n=n1*n2;

        int divisi�n=n1/n2;

        System.out.println("has introducido "+n1+" y "+n2+" El resultado de su suma es "+suma+" el resultado de su resta es " +
                +resta+" el resultado de su multilpicaci�n es  "+multiplicci�n+" y el resultado de su divisi�n es "+divisi�n);
    }
}
