package Udemy_POO;

public class Vehiculos
{
    //En la clase creamos todos los atributos generales que compartir�n los objetos
    
    
    private int ruedas;// debemos encapsularlos con el modificador private para que solo sean accesibles desde la propia clase
    //de ser public ser�a accesible desde otra clase lo cual no tiene sentido porque se podr�a modificar desde all�
    
    private String color;
    
    private int largo;
    
    private int ancho;
    
    private int peso;
    
    
    public Vehiculos(int ruedas,int largo, int ancho, int peso )//Constructor de la clase
    {
        
        //en el constructor le damos un estado inicial  a las propiedades, aunque luego vayan a variar
        
        this.ruedas = ruedas;
        
        this.largo=largo;
        
        this.ancho=ancho;
        
        this.peso=peso;
        
        color="sin color";
        
        
    }
    
    public void setColor(String color)//metodo setter que se usa para establecer/cambiar/modificar valor de propiedad
    {
        this.color=color;//la palabra reservada this se utiliza para diferenciar un campo de clase de un par�metro que tiene el mismo nombre
        //su �mbito est� dentro de la propia clase
        
    }
    
    public String getColor()//m�todo getter que se usa para devolver el valor de la propiedad
    {
        return color;
    }
    
    public String getDatosVehiculo()
    {
        return "Tu veh�culo tiene "+ruedas+" ruedas adem�s tiene "+largo+" metros de largo ";
    }
    
    
    
}
