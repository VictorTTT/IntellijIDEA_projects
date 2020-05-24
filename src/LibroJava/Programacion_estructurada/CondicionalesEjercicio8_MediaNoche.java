package LibroJava.Programacion_estructurada;

//Escribe un programa que dada una hora determinada (horas y minutos), calcule
//los segundos que faltan para llegar a la medianoche.

import javax.swing.*;

public class CondicionalesEjercicio8_MediaNoche
{
    public static void main(String[] args)
    {
        System.out.println("Este programa te dice cuántos segundos quedan hasta media noche" +
                " a partir de una hora indicada");
        
        int hora=Integer.parseInt(JOptionPane.showInputDialog("Introduce la hora"));
        
        int minutos=Integer.parseInt(JOptionPane.showInputDialog("Introduce los minutos"));
        
        int segundosDeHora=hora*3600;
        
        int segundosDeMinutos=minutos*60;
        
        int segundosTotales=segundosDeHora+segundosDeMinutos;
    
        System.out.println("la hora introducida expresada en segundos es= "+segundosTotales);
        
        int segundosDia=86400;
        
        int segundosRestantes=segundosDia-segundosTotales;
    
        System.out.println("Faltan "+segundosRestantes+" segundos para llegar a media noche");
        
    
        
        
        
    }
    
}
