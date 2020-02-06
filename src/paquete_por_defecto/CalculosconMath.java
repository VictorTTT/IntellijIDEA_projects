package paquete_por_defecto;

public class CalculosconMath
{
    public static void main(String[] args)
    {
        //double raiz=Math.sqrt(9.52);
        //hemos hecho una raiz cuadrada

		/*double num1=5.85;
		int resultado=(int)Math.round(num1);
		hemos hecho el redondeo de un n�mero aplicando
		la refundici�n (conversi�n expl�cita)*/

        double base=5;
        double exponente=3;
        int resultado=(int)Math.pow(base, exponente);
        System.out.println("El resultado de "+base+
                " elevado a "+exponente+" es "+resultado);

        System.out.println();


    }
}
