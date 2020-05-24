package LibroJava.POO;

public class GatoSimple {
    // atributos

    String color, raza, sexo;
    int edad;
    double peso;


    public GatoSimple() {//constructor por defecto

    }

    public GatoSimple(String sexo) { //constructor que recibe solo un par�metro
        this.sexo = sexo;
    }

    public GatoSimple(String color, String raza, String sexo, int edad, double peso) {
        //constructor que recibe todos los par�metros
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void maulla() {  //setter que establece el sonido que hace el gato
        System.out.println("Miau");
    }

    public void ronronea() { //setter que establece el sonido que hace el gato
        System.out.println("mrrrrr");
    }

    public void come(String comida) { //setter que establece lo que hace el gato cuando come, recibe por par�mtero el
        //tipo de comida y si coincide con lo que le gusta imprime una cosa, sino la otra
        if (comida.equals("pescado")) {  //Compares this string to the specified object
            System.out.println("Qu� rico!!!!!");
        } else {
            System.out.println("No me gusta lo que me ofreces");
        }

    }

    public void peleaCon(GatoSimple contrincante) {  // a este m�todo le pasamos como par�metro un objeto
        //de la clase GatoSimple, cuando lo llamemos desde el main llamar� al constructor de esta clse y lo crear�
        if (this.sexo.equals("hembra")) {
            System.out.println("No necesito pelear, yo soy la que mira quien gana");
        } else if (contrincante.getSexo().equals("hembra")) {
            System.out.println("no peleo contra gatitas");
        } else {
            System.out.println("ven aqu� que te vas a enterar");
        }
    }
}
