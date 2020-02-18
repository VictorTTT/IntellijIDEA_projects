package LibroJavaEjercicios;

//Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un
//n�mero de 4 cifras. El programa nos pedir� la combinaci�n para abrirla. Si no
//acertamos, se nos mostrar� el mensaje �Lo siento, esa no es la combinaci�n�
//y si acertamos se nos dir� �La caja fuerte se ha abierto satisfactoriamente�.
//Tendremos cuatro oportunidades para abrir la caja fuerte.

import javax.swing.*;

public class BuclesEjercicio7_CajaFuerte
{
    public static void main(String[] args)
    {
        int combinacion = 1234;
        
        int intentos = 0;
        
        int claveIntroducida;
        
        
        do
        {
            intentos++;
            
            claveIntroducida = Integer.parseInt(JOptionPane.showInputDialog("Introduce la combinaci�n para abrir la caja fuerte"));
            
            if (claveIntroducida == combinacion)
            {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                
                break;
                
            }else{
                System.out.println("Lo siento, esa no es la combinaci�n");
            }
            
        }while (intentos<4);
    
        if (intentos==4)System.out.println("Has superado los intentos permitidos, caja bloqueada");
    }
}
