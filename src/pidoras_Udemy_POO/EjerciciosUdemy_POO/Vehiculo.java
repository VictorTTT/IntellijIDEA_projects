package pidoras_Udemy_POO.EjerciciosUdemy_POO;

public interface Vehiculo {

    // Propiedad
    int VELOCIDAD_MAXIMA=120;

    // Comportamientos
    int plazas();
    void acelerar(int cantidad);
    void frenar(int cantidad);

}
