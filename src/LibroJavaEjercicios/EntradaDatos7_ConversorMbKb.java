package LibroJavaEjercicios;

//Realiza un conversor de Mb a Kb.

import javax.swing.*;
import java.util.Scanner;

public class EntradaDatos7_ConversorMbKb
{
    public static void main(String[] args)
    {
        System.out.println("Vamos a realizar un con versor de Mb>Kb y Kb>Mb");
        
        System.out.println("recuerda que 1Mb equivale a 1000Kb\n");
        
        System.out.println("¿Qué opción quieres introducir M o K? ");
        
        Scanner entrada = new Scanner(System.in);
        
        String opcion = entrada.nextLine();
    
    
        switch (opcion)
        {
            case "M":
                
                int Mb = Integer.parseInt(JOptionPane.showInputDialog("Introduce los megas"));
                
                System.out.println(Mb + " Megabytes equivale a " + Mb * 1000 + " Kilobytes ");
                
                break;
            
            case "K":
                
                int Kb = Integer.parseInt(JOptionPane.showInputDialog("Introduce los KiliBytes"));
                
                System.out.println(Kb + " Kilobytes equivalen a  " + Kb / 1000 + " Megabytes ");
                
                break;
                
            default:
                
                System.out.println("La opción introducida no es correcta");
        }
        
        
    }
    
}
