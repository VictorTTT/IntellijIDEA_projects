package Ilerna_Videotutorias;

public class Puerta
{
    private int ancho = 0;

    private int alto = 0;

    private String color = "";

    public Puerta()
    {
        ancho = 150;

        alto = 200;

        color = "Blanco";
    }

    public Puerta(int ancho, int alto)//por convención las variables de los constructores siempre se llaman igual
           // que los campos de clase y deberemos utilizar la palabra this para diferenciarlos
    {
        color ="Blanco";

        this.ancho=ancho;

        this.alto=alto;
    }

    public Puerta(int ancho, int alto, String color)
    {
        this.ancho=ancho;

        this.alto=alto;

        this.color=color;
    }

    public String toString()//Método para imprimir String en Java
    {
        return "La puerta tiene las propiedades: Ancho: "+ancho+", Alto: "+alto
                +", el Color: "+color;//luego lo devolvemos por si queremos hacer alguna otra cosa con ello
    }


}
