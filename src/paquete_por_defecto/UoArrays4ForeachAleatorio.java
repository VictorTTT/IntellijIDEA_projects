package paquete_por_defecto;

public class UoArrays4ForeachAleatorio
{
    public static void main(String[] args)
    {
        int[] matriz=new int[15];

        for (int i = 0; i < matriz.length; i++)
        {
            matriz[i]=(int)Math.round(Math.random()*100);
            //matriz es igual a la refundición en int(porque random devuelve double)
            //redondeo de resultado y número aleatorio de 0 a 100, recordamos que el método
            //random genera double aleatorio entre 0 y 1 y para que sea de un rango int mayor
            //basta con hacer loque vemos aquí:refundición, y multiplicación de unidad seguidad de 0.
        }

        for (int i : matriz)
        {
            System.out.print(i+"-");
        }

    }
}
