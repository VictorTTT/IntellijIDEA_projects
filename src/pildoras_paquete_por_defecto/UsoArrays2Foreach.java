package pildoras_paquete_por_defecto;

public class UsoArrays2Foreach
{
    public static void main(String[] args)
    {
        //String[] matriz=new String[8];

		/*matriz[0]="España";
		matriz[1]="Méjico";
		matriz[2]="Colombia";
		matriz[3]="Perú";
		matriz[4]="Chile";
		matriz[5]="Argentina";
		matriz[6]="Ecuador";
		matriz[7]="Venezuela";*/



		/*for (int i = 0; i < matriz.length; i++)
		{
			System.out.println("País "+ (i+1) + " "+matriz[i]);
		}*/

        String[]matriz= {"España","Méjico","Colombia","Perú","Chile","Argentina","Ecuador","Venezuela"};

        for (String i : matriz)
        {
            System.out.println("Pais "+ i);
        }

        //Esta es la sintaxis para recorrer una matriz con foreach. Como podemos ver,
        //dentro de los paréntesis se declara una variable del mismo tipo que la matriz
        //a continuación dos puntos y el nombre de la matriz con la que vamos a trabajar
        //con él ,nos ahorramos el trabajo de ver dónde comienza y dónde acaba cada matriz.Muy útil.
    }

}
