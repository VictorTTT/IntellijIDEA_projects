package VictorTTT_programs;

public class Humano implements Hombre, Mujer
        //propiedades generales que compartirán todos los objetos
{
    private final int piernas;

    private final int pies;

    private final int brazos;

    private final int manos;

    private final int dedos;

    private String raza;

    private double estatura, peso;

    private String casado;


    public Humano()//método constructor establece estado inicial para las propiedades
    {
        piernas = 2;

        pies = 2;

        brazos = 2;

        manos = 2;

        dedos = 20;

        raza = "";

        estatura = 0;

        peso = 0;


    }

    public String dime_datos_generalesHumano()
    {

        return " como Humano tiene " + piernas + " piernas " + pies + " pies "
                + brazos + " brazos " + manos + " manos y " + dedos + " dedos, " +
                " como datos que pueden variar diremos que " +
                " es de raza " + getRaza() + " tiene una estatura de " + getEstatura() +
                " centímetros, un peso de " + getPeso() + " kg y su estado civil es " + getCasado();
    }

    public void setRaza(String raza)
    {
        this.raza = raza;
    }

    public String getRaza()
    {
        return this.raza;
    }

    public void setEstatura(double estatura)
    {
        this.estatura = estatura;
    }

    public double getEstatura()
    {
        return estatura;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setCasado(String casado)
    {
        this.casado = casado;
    }

    public String getCasado()
    {
        if (casado.equalsIgnoreCase("si"))
        {
            return " casado ";
        }
        else
        {
            return " soltero";
        }

    }
}
