package LibroJava.Programacion_estructurada;

//Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
//0).
//Ejemplo 1:
//Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
//Por favor, introduzca el valor de a: 2
//Ahora introduzca el valor de b: 1
//x = -0.5
//Ejemplo 2:
//Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
//Por favor, introduzca el valor de a: 0
//Ahora introduzca el valor de b: 7
//Esa ecuación no tiene solución real.

import javax.swing.*;

public class CondicionalesEjercicio4_Ecuaciones
{
    public static void main(String[] args)
    {
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");

        double a = Double.parseDouble(JOptionPane.showInputDialog("Por favor, introduzca el valor de a"));

        double b = Double.parseDouble(JOptionPane.showInputDialog("Ahora introduzca el valor de b"));

        if (a == 0)
        {
            System.out.println("La ecuación no tiene solución real");//en este caso la ecuación nunca podria establecer
            // una igualdad a ambos lados del símbolo =
        }
        else
        {
            System.out.println("x= "+(-b/a) );//en todos los demás casos, independientemente del valor que aportemos a
            // nuestras variables el resultado lo conseguimos pasándo los valores al otro lado del igual cambiados de signo
            //(despejar la x)

        }
    }
}
