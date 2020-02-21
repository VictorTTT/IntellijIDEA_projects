package Udemy_POO;

public class UsoVehiculos
{
    public static void main(String[] args)
    {
        Vehiculos miCoche_1=new Vehiculos(4,2,1,2);//instancia miCoche_1 de la clase Vehiculos
        
        miCoche_1.setColor("Magenta");//llamada al método que establece color
        
        System.out.println(miCoche_1.getColor());//impreisón en pantalla con el método que devuelve el color
        
        Vehiculos miCoche_2=new Vehiculos(4,4,2,1);
        
        miCoche_2.setColor("Rojo");
    
        System.out.println(miCoche_2.getColor());
        
        Vehiculos moto1=new Vehiculos(2,2,2,2);
    
        System.out.println(miCoche_1.getDatosVehiculo());
    
        System.out.println(moto1.getDatosVehiculo());
        
        
        
        
    }
}
