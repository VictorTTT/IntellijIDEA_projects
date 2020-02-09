package VictorTTT_programs;

import javax.swing.*;

public class Nino extends Humano//la clase niño hereda de humano, por loque tendrá
        // todas sus propiedades más las que se definan dentro de ella
{
    private String juguetes;

    private int dientes_de_leche;

    public Nino(String juguetes, int dientes_de_leche)
    {
        super();//aquí llamamos al método constructor de Humano

        this.dientes_de_leche = Integer.parseInt(JOptionPane.showInputDialog(" introduce el número de dientes de leche que le quedan "));

        this.juguetes = JOptionPane.showInputDialog(" introduce cuántos jugetes tiene el niño ");
    }

    public String dimeDatosNino()
    {
        return " y como niño que es" +
                " también tiene "+juguetes+" juguetes y "+dientes_de_leche+" dientes de leche";
    }


}
