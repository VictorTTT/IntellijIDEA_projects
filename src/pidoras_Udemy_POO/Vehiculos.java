package pidoras_Udemy_POO;

public class Vehiculos
{
    //En la clase creamos todos los atributos generales que compartir�n los objetos


    private int ruedas;// debemos encapsularlos con el modificador private para que solo sean accesibles desde la propia clase
    //de ser public ser�a accesible desde otra clase lo cual no tiene sentido porque se podr�a modificar desde all�

    private String color;

    private int largo;

    private double ancho;

    private int peso;

    private boolean climatizador;//una variable boolean tiene el valor de false en el momento de su declaraci�n

    private boolean tapiceria_cuero;

    private boolean gps;


    public Vehiculos(int ruedas)//Constructor de la clase
    {

        //en el constructor le damos un estado inicial  a las propiedades, aunque luego vayan a variar

        this.ruedas = ruedas;

        largo = 2;

        ancho = 1;

        peso = 2;

        color = "sin color";


    }

    public  Vehiculos(int ruedas, int largo, double ancho, int peso) //sobrecarga de constructores
    {
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

    public void setExtra(boolean gps, boolean climatizador, boolean tapiceria_cuero)//sobrecarga de m�todos,
    //mismo nombre, diferente n�mero de par�metros
    {
        this.climatizador = climatizador;

        this.gps = gps;

        this.tapiceria_cuero = tapiceria_cuero;
    }

    public String getExtra()
    {
        if (climatizador && !gps && !tapiceria_cuero)

        {
            return " El veh�culo lleva el pack 1 de extras, sin" +
                    " gps ni tapicer�a de cuero";
        }
        else if (climatizador && gps && tapiceria_cuero)
        {
            return "El veh�culo lleva el pack 3 de extras, full equipe!";

        }
        else
        {
            return " La combinaci�n de extras no se admite ";
        }
    }

    public void setColor(String color)//metodo setter que se usa para establecer/cambiar/modificar valor de propiedad
    {
        this.color = color;//la palabra reservada this se utiliza para diferenciar un campo de clase de un par�metro que tiene el mismo nombre
        //su �mbito est� dentro de la propia clase

    }

    public String getColor()//m�todo getter que se usa para devolver el valor de la propiedad
    {
        return color;
    }

    public String getDatosVehiculo()
    {
        return "Tu veh�culo tiene " + ruedas + " ruedas adem�s tiene " + largo + " metros de largo ";
    }


}
