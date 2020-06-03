package LibroJava.POO.Ejercicios;
/*¿Cuáles serían los atributos de la clase PilotoDeFormula1? ¿Se te ocurren algunas
instancias de esta clase?*/

public class PilotoDeFormula1_E1 {

    //Atributos

    private String nombre;
    private String edad;
    private String sexo;
    private double peso;
    private double estatura;
    private String escuderia;

    public PilotoDeFormula1_E1(String nombre, String edad, String sexo, double peso, double estatura, String escuderia) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.estatura = estatura;
        this.escuderia = escuderia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    @Override
    public String toString() {

        String cadena="\n-----------------------------------";
        cadena+="\nNombre "+this.nombre;
        cadena+="\nEdad "+this.edad;
        cadena+="\nPeso "+this.peso;
        cadena+="\nEstatura "+this.estatura;
        cadena+="\nEscudería "+this.escuderia;
        cadena+="\n-----------------------------------";

        return cadena;
    }
}

