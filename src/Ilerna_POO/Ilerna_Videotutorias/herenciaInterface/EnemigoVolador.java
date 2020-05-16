package Ilerna_POO.Ilerna_Videotutorias.herenciaInterface;

public class EnemigoVolador extends Humanoide implements Enemigo, Volador  {
   //Aquí obseervmos una herencia combinbada entre una clase e interfces
    // con esto lo que estamos consiguiendo es decir que nuestro enemigo volador es un humanoide
    //  y las interfaces enemigo y voloador nos irán dando la estructura correcta


    @Override
    public void atacar(double danio) {

    }

    @Override
    public void volar(double distancia) {

    }

    @Override
    public void hablar(String texto) {

    }
}
