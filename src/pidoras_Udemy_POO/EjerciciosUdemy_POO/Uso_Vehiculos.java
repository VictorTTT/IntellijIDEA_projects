package pidoras_Udemy_POO.EjerciciosUdemy_POO;


public class Uso_Vehiculos {

    public static void main(String[] args) {



        Vehiculo [] arrayVehiculos= new Vehiculo[4];

        arrayVehiculos[0]=new Coche(60);
        arrayVehiculos[1]=new Coche(70);
        arrayVehiculos[2]=new Moto(80);
        arrayVehiculos[3]=new Moto(90);

        arrayVehiculos[0].acelerar(90);
        arrayVehiculos[1].frenar(10);
        arrayVehiculos[2].acelerar(120);
        arrayVehiculos[3].frenar(23);

        System.out.println(" Un coche de esta aplicación tiene " + arrayVehiculos[0].plazas()+" plazas.");
        System.out.println(" Una moto de esta aplicación tiene " + arrayVehiculos[2].plazas()+" plazas.");








    }
}
