package pildoras_paquete_por_defecto;

public class UsoArrays2Foreach
{
    public static void main(String[] args)
    {
        //String[] matriz=new String[8];

		/*matriz[0]="Espa�a";
		matriz[1]="M�jico";
		matriz[2]="Colombia";
		matriz[3]="Per�";
		matriz[4]="Chile";
		matriz[5]="Argentina";
		matriz[6]="Ecuador";
		matriz[7]="Venezuela";*/



		/*for (int i = 0; i < matriz.length; i++)
		{
			System.out.println("Pa�s "+ (i+1) + " "+matriz[i]);
		}*/

        String[]matriz= {"Espa�a","M�jico","Colombia","Per�","Chile","Argentina","Ecuador","Venezuela"};

        for (String i : matriz)
        {
            System.out.println("Pais "+ i);
        }

        //Esta es la sintaxis para recorrer una matriz con foreach. Como podemos ver,
        //dentro de los par�ntesis se declara una variable del mismo tipo que la matriz
        //a continuaci�n dos puntos y el nombre de la matriz con la que vamos a trabajar
        //con �l ,nos ahorramos el trabajo de ver d�nde comienza y d�nde acaba cada matriz.Muy �til.
    }

}
