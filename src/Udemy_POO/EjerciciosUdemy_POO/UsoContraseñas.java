package Udemy_POO.EjerciciosUdemy_POO;

import VictorTTT_Metodos.Consola;

import javax.swing.*;

public class UsoContrase�as
{
    public static void main(String[] args)
    {
        int numContrase�as;

        int numCaracteres;

        System.out.println("Bienvenido al programa que genera contrase�as");

        System.out.println("Introduzca cu�ntas contrase�as desea generar en la ventana emergente");

        numContrase�as=Integer.parseInt(JOptionPane.showInputDialog("�Cuantas contrase�as?"));

        System.out.println("Ahora introduzca cuantos caracteres deben tener las contrase�as");

        numCaracteres=Integer.parseInt(JOptionPane.showInputDialog("�Cuantos caracteres?"));

        Contrase�as peticion1=new Contrase�as(numContrase�as,numCaracteres);

        System.out.println(peticion1.getContrase�a());










    }
}
