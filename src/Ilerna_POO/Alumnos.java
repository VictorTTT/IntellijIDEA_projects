package Ilerna_POO;

//Creamos  la clase alumnos que nos servirá para crear objetos de tipo alumno

public class Alumnos
{
    //Atributos
    
    private String name;
    
    private String course;
    
    //Constructor con parámetros
    
    public Alumnos(String name, String course)
    {
        this.name = name;
        this.course = course;
    }
    
    
    //Métodos Getter y Setter
    
    public String getName()//getter, devuelve los valores de los atributos
    {
        return name;
    }
    
    public void setName(String name)//setter, establece o modifica los valores de los atributos
    {
        this.name = name;
    }
    
    public String getCourse()//getter, devuelve los valores de los atributos
    {
        return course;
    }
    
    public void setCourse(String course)//setter, establece o modifica los valores de los atributos
    {
        this.course = course;
    }
    
    //Métodos creados por el programador
    
    public double evaluar(double nota)//realiza funcionalidad propia de esta clase
    {
        nota=nota*0.7;
        
        return nota;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
