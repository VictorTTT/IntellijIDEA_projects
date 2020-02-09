package VictorTTT_programs;

import javax.swing.*;

public class Uso_Humano
{
    public static void main(String[] args)
    {
        Nino Enzo = new Nino("  ", 20);

        Adulto Victor = new Adulto("con hipoteca", 1, " actualmente está baja");

        Enzo.setRaza(JOptionPane.showInputDialog("introduce raza para Enzo"));
        Enzo.setEstatura(Double.parseDouble(JOptionPane.showInputDialog("Introduce estatura para Enzo")));
        Enzo.setPeso(Double.parseDouble(JOptionPane.showInputDialog("introduce peso para Enzo")));
        Enzo.setCasado(JOptionPane.showInputDialog("¿Enzo está casado?"));


        System.out.println("Enzo es un niño humano " +
                Enzo.dime_datos_generalesHumano() +
                Enzo.dimeDatosNino());

        Victor.setRaza(JOptionPane.showInputDialog("introduce raza para Victor"));
        Victor.setEstatura(Double.parseDouble(JOptionPane.showInputDialog("Introduce estatura para Victor")));
        Victor.setPeso(Double.parseDouble(JOptionPane.showInputDialog("introduce peso para Victor")));
        Victor.setCasado(JOptionPane.showInputDialog("¿Victor está casado?"));

        System.out.println("Victor es un adulto humano " +
                Victor.dime_datos_generalesHumano() +
                Victor.dimeDatosAdulto());
    }
}
