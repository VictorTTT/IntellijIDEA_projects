package LibroJavaEjercicios;

//Escribe un programa que calcule el volumen de un cono según la fórmula


import javax.swing.*;

public class EntradaDatos6_VolumenCono
{
    public static void main(String[] args)
    {
        System.out.println(" Este programa te permitirá saber el volumen de un cono ");
    
        System.out.println("Recuerda que el volumen de un con es= PI* radio(al cuadrado)*altura,todo ello /3");
        
        double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio de la base del cono"));
        
        double altura=Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura del cono"));
        
        double areaCono=(Math.PI*Math.pow(radio,2)*altura)/3;
    
        System.out.printf("El area del cono es %.2f",areaCono);
    }
}
