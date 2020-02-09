package VictorTTT_programs;

public class Humano implements Hombre,Mujer
//propiedades generales que compartirán todos los objetos
{
    private final int piernas;

    private final int pies;

    private final int brazos;

    private final int manos;

    private final int dedos;

    private String raza;

    private double estatura,peso;

    private boolean casado;


    public Humano()//método constructor establece estado inicial para las propiedades
    {
        piernas=2;

        pies=2;

        brazos=2;

        manos=2;

        dedos=20;

        raza="";

        estatura=0;

        peso=0;





    }

    public String dime_datos_generalesHumano()
    {
        return "Todo Humano tiene "+piernas+" piernas "+pies+" pies "
                +brazos+" brazos "+manos+" manos y "+dedos+" dedos, ";
    }

    public void setRaza(String raza)
    {
        this.raza = raza;
    }

    public String getRaza()
    {


        return this.raza;
    }

}
