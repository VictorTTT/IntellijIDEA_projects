package LibroJava.Programacion_estructurada;

//Escribe un programa que calcule el área de un triángulo.


import javax.swing.*;

public class EntradaDatosEjercicio4AreaTriangulo
{
    public static void main(String[] args)
    {
        System.out.println("Vamos a calcular el área de un triángulo");
    
        System.out.println("Recuerda que el área del triángulo es= base * altura dividido por 2\n\n");
        
        double base=Double.parseDouble(JOptionPane.showInputDialog("Introduce la base"));
        
        double altura=Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura"));
        
        double areaTriangulo=(base*altura)/2;
    
        System.out.println("El area de tu  triángulo es : "+areaTriangulo);
    
       
        
        
        
    }
}
