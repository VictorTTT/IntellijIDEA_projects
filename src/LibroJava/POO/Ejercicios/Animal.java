package LibroJava.POO.Ejercicios;

/*Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
al menos, tres métodos específicos de cada clase y redefine el/los método/s
cuando sea necesario. Prueba las clases creadas en un programa en el que se
instancien objetos y se les apliquen métodos.*/


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public abstract class Animal {

    //Esta clase es abstracta porque no vamos  a crear ninguna instancia de ella, la utilizaremos para marcar unas directrices
    //comunes a todas las subclases que hereden de ella.

    //Atributos

    public enum Sexo {MACHO,HEMBRA} //la forma de crear tipos de  datos enumerados se hace igual que un método pero sin paréntesis
    private Sexo sexo; // Después de creados los tipos, declaramos la variable con el tipo creado
    private int patas; //toddo animal tiene un número patas, diferentes segun la especie
    private String sonido; // cada animal emitirá un sonido distinto
    private String fechaNacimiento; // este atributo es de tipo localdate, en caso de duda consultar la api
    private String nombre;
    //Constructores

    public Animal() {

    }


    //Getters y Setters


    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Hola Enzo soy un Animal " +
                  sexo +
                ", tengo " + patas +" patas"+
                ", mi sonido es " + sonido  +
                ", me llamo " + nombre ;
    }

    // Métodos que serán comunes a todas las subclases

    public void dormir(){
        System.out.println("Estoy durmiendo");
    }

    public void comer(){
        System.out.println("Estoy comiendo");
    }

    public void nacer(){
        System.out.println("Acabo de llegar al mundo");
    }

    public void morir(){
        System.out.println("He muerto");

    }

    public void aparearse(Animal pareja){

        if (this.getSexo().equals(Sexo.MACHO)&&pareja.getSexo().equals(Sexo.HEMBRA)){
            System.out.println("La reproducción es posible");

        }else if (this.getSexo().equals(Sexo.HEMBRA)&&pareja.getSexo().equals(Sexo.MACHO)){
            System.out.println("La reproducción es posible");

        }else{
            System.out.println("La reproducción es inviable");
        }

    }

    public Period averiguaEdad(CharSequence fechaNac){ // método que recibe una secuencia de caracteres (puede ser un String, preferiblemente en el formato dd/mm/yyyy)
        //El método devuelve un periodo en formato fecha
        DateTimeFormatter formatoFecha=DateTimeFormatter.ofPattern("dd/MM/yyyy");  // Esta clase mediante el método ofPattern marca el formato de la fecha para poder trabajar con ella
        LocalDate fechaNacimiento=LocalDate.parse(fechaNac,formatoFecha); // La clase LocalDate recibe la secuencia de caracteres que viene como parámetro en la llamada del método, y la parsea con el objeto de la clase DaetTimeFormatter
        LocalDate fechaActual= LocalDate.now(); // creamos un objeto  de la clase LacalDate y utilizamos el método now para almacenar en él la fecha actual,

        return Period.between(fechaNacimiento,fechaActual); // Utilizamos la clase Period con el método between, lo que nos va a permitir
        //devolver el periodo comprendido entre la fecha proporcionada y la actual.
        // Para ofrecer el resultado obtenido al usuario es interesante formatear la impresión en pantalla con un mensaje entendible, toddo esto ya en el main.
        /*System.out.println(String.format("Tienes %d años, %d meses y %d días."
                ,perro1.averiguaEdad(fechaNacimiento).getYears(),perro1.averiguaEdad(fechaNacimiento).getMonths(),perro1.averiguaEdad(fechaNacimiento).getDays()));*/
    }





}
