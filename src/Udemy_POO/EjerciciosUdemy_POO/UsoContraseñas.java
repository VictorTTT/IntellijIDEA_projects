package Udemy_POO.EjerciciosUdemy_POO;

import VictorTTT_Metodos.Consola;

import javax.swing.*;

public class UsoContraseñas
{
    public static void main(String[] args)
    {
        int numContraseñas;

        int numCaracteres;

        System.out.println("Bienvenido al programa que genera contraseñas");

        System.out.println("Introduzca cuántas contraseñas desea generar en la ventana emergente");

        numContraseñas=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas contraseñas?"));

        System.out.println("Ahora introduzca cuantos caracteres deben tener las contraseñas");

        numCaracteres=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos caracteres?"));

        Contraseñas peticion1=new Contraseñas(numContraseñas,numCaracteres);

        System.out.println(peticion1.getContraseña());










    }
}
