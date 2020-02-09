package VictorTTT_programs;

public class Uso_Humano
{
    public static void main(String[] args)
    {
        Nino Enzo = new Nino(" muchos ", 20);

        Enzo.dime_datos_generalesHumano();
        Enzo.dimeDatosNino();
        Enzo.setRaza("caucásica");

        System.out.println("Enzo es un niño humano de raza " +
                Enzo.getRaza() + Enzo.dime_datos_generalesHumano() + Enzo.dimeDatosNino());
    }
}
