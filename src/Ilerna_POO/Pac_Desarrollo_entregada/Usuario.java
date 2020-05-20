package Ilerna_POO.Pac_Desarrollo_entregada;

public class Usuario {

    private String nombre;//
                          //
    private int edad;     //Encapsulamiento de variables
                          //
    private String DNI;   //

    public Usuario() {     //constructor vac�o que crea objetos de tipo suario

    }

    public String getNombre() {// devuelve el nombre del usuario
        return nombre;
    }

    public void setNombre(String nombre) {// establece el n�mbre del usuario
        this.nombre = nombre;
    }

    public int getEdad() {// devuelve la edad del usuario
        return edad;
    }

    public void setEdad(int edad) {// establece la edad del usuario
        this.edad = edad;
    }

    public String getDNI() {// devuelve el DNI del usuario
        return DNI;
    }

    public boolean setDNI(String DNI) {// establece el DNI del usuario. Si el introducido
        //tiene formato correcto lo acepta, si no lo rechaza.


        if (DNI.matches("[0-9]{8}[A-Z]") || DNI.matches("[0-9]{8}[-][A-Z]")){

            this.DNI = DNI;//El DNI es asignado �nicamente si es v�lido

            return true;// devuelve que es v�lido

        }else {

            return false;// devuelve que es incorrecto
        }


    }

    @Override
    public String toString() {// Devuelve el contenido del objeto Usuario
        return "El Usuario de la cuenta es " + getNombre() +
                " tiene " + getEdad() + " a�os, con DNI " + getDNI();

    }
}
