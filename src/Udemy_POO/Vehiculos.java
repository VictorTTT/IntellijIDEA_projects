package Udemy_POO;

public class Vehiculos
{
    //En la clase creamos todos los atributos generales que compartirán los objetos


    private int ruedas;// debemos encapsularlos con el modificador private para que solo sean accesibles desde la propia clase
    //de ser public sería accesible desde otra clase lo cual no tiene sentido porque se podría modificar desde allí

    private String color;

    private int largo;

    private int ancho;

    private int peso;

    private boolean climatizador;//una variable boolean tiene el valor de false en el momento de su declaración

    private boolean tapiceria_cuero;

    private boolean gps;


    public Vehiculos(int ruedas, int largo, int ancho, int peso)//Constructor de la clase
    {

        //en el constructor le damos un estado inicial  a las propiedades, aunque luego vayan a variar

        this.ruedas = ruedas;

        this.largo = largo;

        this.ancho = ancho;

        this.peso = peso;

        color = "sin color";


    }

    public void setExtra(boolean climatizador)
    {
        this.climatizador = climatizador;
    }

    public void setExtra(boolean gps, boolean climatizador,boolean tapiceria_cuero)//sobrecarga de métodos,
            //mismo nombre, diferente número de parámetros
    {

    }

    public String getExtra()
    {
        if (climatizador)
        {
            return " El coche tiene climatizador ";
        }
        else
        {
            return " El coche no tiene climatizador";
        }
    }

    public void setColor(String color)//metodo setter que se usa para establecer/cambiar/modificar valor de propiedad
    {
        this.color = color;//la palabra reservada this se utiliza para diferenciar un campo de clase de un parámetro que tiene el mismo nombre
        //su ámbito está dentro de la propia clase

    }

    public String getColor()//método getter que se usa para devolver el valor de la propiedad
    {
        return color;
    }

    public String getDatosVehiculo()
    {
        return "Tu vehículo tiene " + ruedas + " ruedas además tiene " + largo + " metros de largo ";
    }


}
