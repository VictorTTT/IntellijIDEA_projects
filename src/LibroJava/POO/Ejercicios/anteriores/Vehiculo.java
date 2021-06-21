package LibroJava.POO.Ejercicios;

/*Crea la clase Vehiculo, as� como las clases Bicicleta y Coche como subclases de
la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreados y
kilometrosTotales, as� como el atributo de instancia kilometrosRecorridos. Crea
tambi�n alg�n m�todo espec�fico para cada una de las subclases. Prueba las
clases creadas mediante un programa con un men� como el que se muestra a
continuaci�n:
VEH�CULOS
=========
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opci�n (1-8):*/

public abstract class Vehiculo {

    //Atributos de clase
    private static int vehiculosCreados = 0;    //atributo de clase que usaremos para llevar una cuenta total de vehiculos
    private static int kilometrosTotales = 0;   //atributo de clase que usaremos para saber todos los kilometros de todos los veh�culos

    public static int getVehiculosCreados(){    // m�todo p�blico y est�tico para acceder desde el main
        return vehiculosCreados;
    }

    public static int getKilometrosTotales(){   // m�todo p�blico y est�tico para acceder desde el main
        return kilometrosTotales ;
    }

    //Atributos de instancia

    private int kilometrosRecorridos;

    public int getKilometrosRecorridos(){
        return this.kilometrosRecorridos;
    }

    //M�todo que podr�n utilizar todas las clases que hereden de veh�culo

    public void setKilometrosRecorridos(int kilometrosRecorridos){
        this.kilometrosRecorridos+=kilometrosRecorridos;
        Vehiculo.kilometrosTotales+=kilometrosRecorridos;
    }


}


