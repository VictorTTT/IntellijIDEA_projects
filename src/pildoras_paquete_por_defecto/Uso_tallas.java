package pildoras_paquete_por_defecto;

import java.util.*;

public class Uso_tallas
{


    enum Talla
    {
        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

        private final String abreviatura;

        Talla(String abreviatura)
        {

            this.abreviatura = abreviatura;
        }

        public String dameAbreviatura()
        {
            return abreviatura;
        }


    }

    public static void main(String[] args)
    {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE ");

        String entrada_datos = entrada.next().toUpperCase();

        Talla la_talla = Enum.valueOf(Talla.class, entrada_datos);

        System.out.println("Talla=" + la_talla);

        System.out.println("Abreviatura=" + la_talla.dameAbreviatura());


    }
}
