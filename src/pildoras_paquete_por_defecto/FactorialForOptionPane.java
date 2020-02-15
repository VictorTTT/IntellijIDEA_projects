package pildoras_paquete_por_defecto;

import javax.swing.*;

public class FactorialForOptionPane
{
    public static void main(String[] args)
    {
        long resultado=1L;
        //declaramos como Long para garantizar que el resultado se pueda mostrar

        int numero=Integer.parseInt(JOptionPane.showInputDialog("introduce el número del que quieres saber el factorial"));
        //declaramos variable que antes de convierte el string en int y luego pide número por ventana

        for (int i = numero; i >0; i--)
        {
            resultado=resultado*i;
        }
        System.out.println(" El factorial de "+numero+" es "+resultado);
    }
}
