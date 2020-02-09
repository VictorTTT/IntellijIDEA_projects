package VictorTTT_programs;

public class Adulto extends Humano//la clase Adulto hereda de Humano, por loque tendrá
        // todas sus propiedades más las que se definan dentro de ella
{
    private boolean hipoteca;

    private int hijos;

    private boolean trabajo;



    public Adulto(boolean hipoteca, int hijos, boolean trabajo)
    {
        super();//Llamamos al constructor de Humano.

        this.hipoteca = hipoteca;//esta variable que tiene el mismo nombe
        // que el parámetro del método constructor, almacenará lo que se le pase desde el main

        this.hijos = hijos;//esta variable que tiene el mismo nombe
        // que el parámetro del método constructor, almacenará lo que se le pase desde el main

        this.trabajo = trabajo;//esta variable que tiene el mismo nombe
        // que el parámetro del método constructor, almacenará lo que se le pase desde el main
    }

    public String dimeDatosAdulto()
    {
        return " y también tiene  "
                +hijos+" hijos ";

    }

    public String setHipoteca()
    {
        if (hipoteca)
        {
            return " Tiene hipoteca ";
        }
        else
        {
            return " No tiene hipoteca ";
        }
    }

    public String trabajo()
    {
        if (trabajo)
        {

            return " Tiene trabajo";
        }
        else
        {
            return "No tiene trabajo";
        }
    }
}



