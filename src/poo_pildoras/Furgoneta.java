package poo_pildoras;

public class Furgoneta extends Coche//extends se utiliza para indicar que una clase hereda de otra
{          //subclase//    //superclase//
           ////hijo///     ////padre////

    private int capacidad_carga;

    private int plazas_extra;

    public Furgoneta(int plazas_extra, int capacidad_carga)//método constructor para Furgoneta
    {
        super();//super llama al método constructor de la clase padre(Coche)

        this.capacidad_carga=capacidad_carga;//recordamos que this es para diferenciar la variable local
        // del argumento que se pasa por parámetro cuando tienen el mismo nombre

        this.plazas_extra=plazas_extra;
    }


    public String dimeDatosFurgoneta() {

        return "La capacidad de carga es: "+capacidad_carga
        +"Y las plazas son: "+plazas_extra;
    }
}
