package pidoras_Udemy_POO.EjerciciosUdemy_POO;

public class Moto implements Vehiculo{

    private int velInicial;

    public Moto(int velInicial) {
        this.velInicial = velInicial;
    }

    @Override
    public int plazas() {
        return 2;
    }

    @Override
    public void acelerar(int cantidad) {

        int velAumentada = this.velInicial + cantidad;

        if (velAumentada > VELOCIDAD_MAXIMA) {
            System.out.println("Estás conduciendo a " + velAumentada + " km/h. Superando los límtes legales en "
                    + (velAumentada - VELOCIDAD_MAXIMA) + " Km/h");
        }
    }

    @Override
    public void frenar(int cantidad) {

        int velReducida= this.velInicial-cantidad;
        System.out.println("La nueva velocidad es de: " + velReducida + " Km/h");

    }
}
