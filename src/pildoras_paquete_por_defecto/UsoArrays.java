package pildoras_paquete_por_defecto;

public class UsoArrays
{
    public static void main(String[] args)
    {

		/*int[] matriz=new int[5];//utilizar este nombre para los arrays, para que el tajo de teclado para crearlas sea más efectivo

	 int matriz1[]=new int[6];//otra forma de declarar matrices, también correcta pero menos usada

	        matriz[0]=5;
	        matriz[1]=38;
	        matriz[2]=-15;
	        matriz[3]=92;
	        matriz[4]=71;

			 /*System.out.println(array[0]);
			 System.out.println(array[1]);
			 System.out.println(array[2]);
			 System.out.println(array[3]);
			 System.out.println(array[4]);*/

        int[] matriz= {5,38,-15,92,71};//segunda forma de declarar matrices, esta vez en una sola línea.

        for (int i = 0; i < matriz.length; i++)
        {
            System.out.println(" valor del índice "+ i+" = "+matriz[i]);
        }



    }

}
