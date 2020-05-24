package LibroJava.Programacion_estructurada;

//Realiza un programa que calcule la media de tres notas.

//Ampl�a el programa anterior para que diga la nota del bolet�n (insuficiente,
//suficiente, bien, notable o sobresaliente).

import javax.swing.*;

public class CondicionalesEjercicio6_NotaMedia
{
    public static void main(String[] args)
    {
        System.out.println("Introduce las notas de 3 ex�menes para saber la media");
        
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota de examen 1"));
        
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota de examen 2"));
        
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Nota de examen 3"));
        
        if (nota1 < 5 || nota2 < 5 || nota3 < 5)
        
        {
            System.out.println("No puedes hacer media con examen suspendido ");
        }
    
        double notaMedia = (nota1 + nota2 + nota3) / 3;
    
       
        
        
        if (nota1 > 5 && nota2 > 5 && nota3 > 5)
        {
    
            System.out.printf("La nota media de los tres ex�menes es: %.2f ", notaMedia);
            
            
            if (notaMedia < 5)
            {
                System.out.println("Insuficiente ");
            }
            if (notaMedia >= 5 && notaMedia < 7)
            {
                System.out.println("Bien ");
            }
            if (notaMedia >= 7 && notaMedia < 9)
            {
                System.out.println("Notable");
            }
            if (notaMedia >= 9)
            {
                System.out.println("Sobresaliente");
            }
        }
        
    }
}
