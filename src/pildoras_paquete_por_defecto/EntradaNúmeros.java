package pildoras_paquete_por_defecto;

import javax.swing.*;

public class EntradaN�meros
{
    public static void main(String[] args)

    {
		/*double x =100000.0;

		System.out.printf("%1.4f",x/3);
		//M�todo printf (imprime con formato) para acotar el n�mero de
		//decimales que nos devuelve un resultado, tiene 2 par�metros
		//antes de la coma el formato que le debe aplicar al valor num�rico
		//despu�s de ella, el valor num�rico en si*/

        String num1= JOptionPane.showInputDialog("introduce un numero");
        //pedimos n�mero y lo almacenamos como string en num1

        double num2=Double.parseDouble(num1);
        //parseamos y lo convertimos en double, porque sabemos que el m�todo que
        //utilizaremos as� lo requiere

        System.out.print(" La raiz de " +num2+" es ");
        //Mensaje informando que NO da salto de l�nea

        System.out.printf("%1.7f",Math.sqrt(num2));
        //Imprimimos con formato de dos decimales la raiz cuadrada a trav�s
        //del m�todo est�tico Math.sqrt
    }
}
