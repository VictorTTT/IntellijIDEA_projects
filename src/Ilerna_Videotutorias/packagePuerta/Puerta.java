package Ilerna_Videotutorias.packagePuerta;

public class Puerta {
    private int ancho = 0;
    private int alto = 0;
    private String color = "";

    //Constructor sin parametros
    public Puerta() {
        ancho = 150;
        alto = 200;
        color = "Blanco";
    }

    //Constructor con 2 parametros
    public Puerta(int ancho, int alto) {
        color = "Blanco";
        this.ancho = ancho;
        this.alto = alto;
    }

    // Constructor con todos los parametros.
    public Puerta(int ancho, int alto, String color) {
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
    }

    public String toString() {

        funcion_privada("FUnción pricada");
        return "La puerta tiene las propiedades: Ancho: " + ancho + ", Alto: " + alto
                + ", el Color: " + color;

    }

    private void funcion_privada(String texto) {
        System.out.println(texto);
    }

    public void funcion_publica(String texto) {
        System.out.println(texto);
    }

    void funcion_package(String texto) {
        System.out.println(texto);
    }

    // getter ancho
    public int getAncho() {
        return ancho;
    }

    // setter ancho
    public void setAncho(int ancho) {
        if (ancho < 100) {
            System.out.println("El ancho debe ser mayor de 100");
        } else {
            this.ancho = ancho;
        }
    }

    // getter alto
    public int getAlto(){
        return alto;
    }

    //setter alto

    public void setAlto(int alto){
        if (alto>200){
            System.out.println("El alto de la no debe ser mayor de 200");
        }else{
            this.alto=alto;
        }
    }
    //curar()
    //curar(Jugador nombre)

    // SObrecarga de metodos
    public void mostrar(){
        System.out.println("Has llamado a la función mostrar sin parametros");
    }
    public void mostrar(String texto){
        System.out.println("has llamado a la funcion mostrar con el texto:");
        System.out.println(texto);
        System.out.println(5);
    }
}
