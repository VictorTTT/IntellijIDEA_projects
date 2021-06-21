package LibroJava.POO;

public class PruebaMascota {

    public static void main(String[] args) {

        MascotaInterface kuko =new Perro(Animal.Sexo.MACHO,"1234");
        MascotaInterface laika =new Perro(Animal.Sexo.HEMBRA,"1236");

        // me doy cuenta de que la interfaz no se puede instanciar, por eso escribo
        //  MascotaInterface kuko = new Perro

        System.out.println(kuko);
        System.out.println(laika);
        kuko.come("mierdas");
        laika.come("carne");
        kuko.peleaCon((Perro)laika);
        laika.peleaCon((Perro)kuko);



























    }
}
