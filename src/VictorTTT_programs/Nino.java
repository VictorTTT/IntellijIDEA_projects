package VictorTTT_programs;

import javax.swing.*;

public class Nino extends Humano//la clase ni�o hereda de humano, por loque tendr�
        // todas sus propiedades m�s las que se definan dentro de ella
{
    private String juguetes;

    private int dientes_de_leche;

    public Nino(String juguetes, int dientes_de_leche)
    {
        super();//aqu� llamamos al m�todo constructor de Humano

        this.dientes_de_leche = Integer.parseInt(JOptionPane.showInputDialog(" introduce el n�mero de dientes de leche que le quedan "));

        this.juguetes = JOptionPane.showInputDialog(" introduce cu�ntos jugetes tiene el ni�o ");
    }

    public String dimeDatosNino()
    {
        return " y como ni�o que es" +
                " tambi�n tiene "+juguetes+" juguetes y "+dientes_de_leche+" dientes de leche";
    }


}
