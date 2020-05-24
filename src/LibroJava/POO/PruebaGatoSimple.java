package LibroJava.POO;

public class PruebaGatoSimple {
    public static void main(String[] args) {

        GatoSimple garfield=new GatoSimple("macho");

        System.out.println("Hola gatito");
        garfield.maulla();
        System.out.println("toma tarta");
        garfield.come("tarta selva negra");
        System.out.println("toma pescado a ver si esto te gusta");
        garfield.come("pescado");

        GatoSimple tom = new GatoSimple("macho");

        System.out.println("Tom, toma sopita de verduras");
        tom.come("sopa de vereduras");

        GatoSimple lisa = new GatoSimple("hembra");

        System.out.println("A ver esoso gatos cómo maullaaaaan, que yo lo oiga");
        garfield.maulla();
        tom.maulla();
        lisa.maulla();

        System.out.println("A PELEAR!!!!");
        System.out.println("Garfield, ataca a Lisa!");
        garfield.peleaCon(lisa);
        System.out.println("Lisa, ataca a Tom!");
        lisa.peleaCon(tom);
        System.out.println("Tom, ataca a Garfield!");
        tom.peleaCon(garfield);














    }
}
