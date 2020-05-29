package LibroJava.POO;

public class Ave extends Animal{

    private String alas;
    private Pico pico;

    public Ave(Sexo sexo){
        super(sexo); // Llamada al constructor de superclase uqe permite establecer sexo

    }

    public Ave(){
        super(); // Llamada al constructor de la superclase que establece el sexo como macho
    }

    public Ave(Sexo s, String alas, Pico pico) {
        super();
        this.alas = alas;
        this.pico = pico;
    }

    public void aseate(){
        System.out.println("Me estoy limpiendo la mierda");
    }

    public  void  aVolar(){
        System.out.println("Estoy volando");
    }

    public enum Pico{
        LARGO, CORTO
    }

}
