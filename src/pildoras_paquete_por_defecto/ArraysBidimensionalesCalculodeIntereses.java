package pildoras_paquete_por_defecto;

public class ArraysBidimensionalesCalculodeIntereses
{



        public static void main(String[] args)
        {
            double acumulado;
            double interes=0.10;

            double[][] matriz=new double [5][6];

            for (int i = 0; i <5; i++)
            {
                matriz [i][0]	=10000;
                acumulado=10000;

                for (int j = 1; j < 6; j++)
                {
                    acumulado=acumulado+(acumulado*interes);
                    matriz[i][j]=acumulado;
                }

                interes=interes+0.01;
            }


            for (int z = 0; z < 5; z++)
            {
                System.out.println();

                for (int h = 0; h < 6; h++)
                {
                    System.out.printf("%1.2f",matriz[z][h]);

                    System.out.print(" ");
                }
            }

        }



    //Este programa toma su ejemplo del video n� 26 del curso java pildoras inform�ticas
    //Es un c�lculo y representaci�n de una acumulaci�n de intereses, cualquier duda acudir al video.

}
