package LibroJava.POO.Ejercicios;

public class Terminal {

    //Atributos

    private final String numero;
    private int segundos; //tiempo de conversación en segundos

    //Constructor

    public Terminal(String numero){ //en el constructor se recibe el número identificador de la instancia
        this.numero=numero;
        this.segundos=0;// y se inicializa el tiempo a 0 de cada instancia

    }

    //Getters y Setters

    public String getNumero() {
        return numero;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    // Métodos de programa

    public void llamar(Terminal t,int segundos){
        this.segundos+=segundos;
        t.segundos+=segundos;
    }

    @Override
    public String toString() {
        return "Nº"+numero+" - "+segundos+"s de conversación";
    }
}
