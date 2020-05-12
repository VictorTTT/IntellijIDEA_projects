package Ilerna_POO.codigosMaterialDidáctico;

public abstract class Profesor {
    /*Esta clase abstracta sirve como gúia para "obligar" a las clases que posteriormente
    * hereden de ella a implementar los métodos y los atributos que ella propone,
    * de esta forma los objetos que se instancien en las subclases siempre tendrán estos atributos métodos
    * Las clases abstractas no pueden instanciar objetos, se hace a través de las subclases*/

    //atributos

    String Nombre ;
    String dni;
    int edad;

    //Métodos


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
       this.Nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double pacs( double pac1,double pac2,double pac3){

        double nota_final;
        nota_final=(pac1+pac2+pac3)/3;
        return nota_final;

    }
    public double pacs( double p1,double p2,double p3,double p4){

        double nota_final;
        nota_final=(p1+p2+p3+p4)/4;
        return nota_final;
    }

}
