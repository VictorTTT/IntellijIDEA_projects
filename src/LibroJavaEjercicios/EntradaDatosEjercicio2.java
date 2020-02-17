package LibroJavaEjercicios;

//Escribe un programa que sume, reste, multiplique y divida dos números
//introducidos por teclado.

import javax.swing.*;

public class EntradaDatosEjercicio2
{
    public static void main(String[] args)
    {
        System.out.println("Por favor, introduce 2 números y haremos operacines básicas con ellos ");

        int n1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número "));

        int n2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número "));

        int suma=n1+n2;

        int resta=n1-n2;

        int multiplicción=n1*n2;

        int división=n1/n2;

        System.out.println("has introducido "+n1+" y "+n2+" El resultado de su suma es "+suma+" el resultado de su resta es " +
                +resta+" el resultado de su multilpicación es  "+multiplicción+" y el resultado de su división es "+división);
    }
}
