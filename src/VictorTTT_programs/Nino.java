package VictorTTT_programs;

public class Nino extends Humano//la clase niño hereda de humano, por loque tendrá
        // todas sus propiedades más las que se definan dentro de ella
{
    private String juguetes;

    private int dientes_de_leche;

    public Nino(String juguetes, int dientes_de_leche)
    {
        super();//aquí llamamos al método constructor de Humano

        this.dientes_de_leche = dientes_de_leche;

        this.juguetes = juguetes;
    }

    public String dimeDatosNino()
    {
        return " y además " +
                " también tiene "+juguetes+" juguetes y "+dientes_de_leche+" dientes de leche";
    }


}
