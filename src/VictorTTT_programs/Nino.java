package VictorTTT_programs;

public class Nino extends Humano//la clase ni�o hereda de humano, por loque tendr�
        // todas sus propiedades m�s las que se definan dentro de ella
{
    private String juguetes;

    private int dientes_de_leche;

    public Nino(String juguetes, int dientes_de_leche)
    {
        super();//aqu� llamamos al m�todo constructor de Humano

        this.dientes_de_leche = dientes_de_leche;

        this.juguetes = juguetes;
    }

    public String dimeDatosNino()
    {
        return " y adem�s " +
                " tambi�n tiene "+juguetes+" juguetes y "+dientes_de_leche+" dientes de leche";
    }


}
