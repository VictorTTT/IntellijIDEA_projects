package LibroJava.Programacion_estructurada;

//Escribe un programa que calcule el �rea de un tri�ngulo.


import javax.swing.*;

public class EntradaDatosEjercicio4AreaTriangulo
{
    public static void main(String[] args)
    {
        System.out.println("Vamos a calcular el �rea de un tri�ngulo");
    
        System.out.println("Recuerda que el �rea del tri�ngulo es= base * altura dividido por 2\n\n");
        
        double base=Double.parseDouble(JOptionPane.showInputDialog("Introduce la base"));
        
        double altura=Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura"));
        
        double areaTriangulo=(base*altura)/2;
    
        System.out.println("El area de tu  tri�ngulo es : "+areaTriangulo);
    
       
        
        
        
    }
}
