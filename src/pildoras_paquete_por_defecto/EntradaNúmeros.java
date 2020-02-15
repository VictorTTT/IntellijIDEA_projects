package pildoras_paquete_por_defecto;

import javax.swing.*;

public class EntradaNúmeros
{
    public static void main(String[] args)

    {
		/*double x =100000.0;

		System.out.printf("%1.4f",x/3);
		//Método printf (imprime con formato) para acotar el número de
		//decimales que nos devuelve un resultado, tiene 2 parámetros
		//antes de la coma el formato que le debe aplicar al valor numérico
		//después de ella, el valor numérico en si*/

        String num1= JOptionPane.showInputDialog("introduce un numero");
        //pedimos número y lo almacenamos como string en num1

        double num2=Double.parseDouble(num1);
        //parseamos y lo convertimos en double, porque sabemos que el método que
        //utilizaremos así lo requiere

        System.out.print(" La raiz de " +num2+" es ");
        //Mensaje informando que NO da salto de línea

        System.out.printf("%1.7f",Math.sqrt(num2));
        //Imprimimos con formato de dos decimales la raiz cuadrada a través
        //del método estático Math.sqrt
    }
}
