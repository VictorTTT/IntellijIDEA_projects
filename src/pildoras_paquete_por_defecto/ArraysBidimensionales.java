package pildoras_paquete_por_defecto;

public class ArraysBidimensionales
{
    public static void main(String[] args)
    {
        //int[][] matriz= new int [4][5];

        int[][] matriz=
                {
                        {10,15,18,19,21,},
                        {5,25,37,41,15},
                        {7,19,32,14,90},
                        {85,2,7,40,27}
                };

        for(int[] fila:matriz) {

            System.out.println();
            //con for each
            for (int z : fila) {

                System.out.print(z+" ");

            }
        }


        System.out.println("\n\n\n");



        for (int i = 0; i <4; i++) //filas
        {
            for (int j = 0; j<5; j++) //columnas
            {                                        //con for
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();///////////
        }


    }
}
