package VictorTTT_programs;

public class Adulto extends Humano//la clase Adulto hereda de Humano, por loque tendrá
        // todas sus propiedades más las que se definan dentro de ella
{
    private String hipoteca ;

    private int hijos;

    private String trabajo;



    public Adulto( String hipoteca, int hijos, String trabajo)
    {
        super();//Llamamos al constructor de Humano.

        this.hipoteca=hipoteca;

        this.hijos = hijos;//esta variable que tiene el mismo nombe
        // que el parámetro del método constructor, almacenará lo que se le pase desde el main

        this.trabajo = trabajo;//esta variable que tiene el mismo nombe
        // que el parámetro del método constructor, almacenará lo que se le pase desde el main
    }

    public String dimeDatosAdulto()
    {
        return " y como adulto que es tiene  "
                +hijos+" hijos, es "+trabajo+" y su situación inmobiliaria es "+hipoteca;

    }




}



