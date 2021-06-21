package LibroJava.POO.Ejercicios;

public class Terminal {

    //Atributos

    private final String numero;
    private int segundos; //tiempo de conversaci�n en segundos

    //Constructor

    public Terminal(String numero){ //en el constructor se recibe el n�mero identificador de la instancia
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

    // M�todos de programa

    public void llamar(Terminal t,int segundos){
        this.segundos+=segundos;
        t.segundos+=segundos;
    }

    @Override
    public String toString() {
        return "N�"+numero+" - "+segundos+"s de conversaci�n";
    }
}
