package LibroJava.POO;

public class Gato extends Animal {

    private String raza;
    private int patas;
    private String sonido;

    /*La palabra reservada super, hace una llamada siempre AL M�TODO EQUIVALENTE DE LA CLASE PADRE m�s cercana en la jererqu�a,
    aqu�  lo podemos comprobar en la  llamada de los constructores y del toString*/


    public Gato(Sexo sexo, String raza) { // El sexo es un par�metro que heredamos da la clase Animal, la raza es un atributo de esta clase
        super(sexo); // para determinar el sexo llama al constructor de la superclase
        this.raza = raza;
    }

    public Gato(Sexo sexo) { // Este constructor recibe el sexo y siempre establece la raza como siam�s
        super(sexo);
        raza = "siam�s";
    }

    public Gato(String raza) { // Este constructor recibe la raza, y siempre establece el sexo como hembra
        super(Sexo.HEMBRA);
        this.raza = raza;
    }

    public Gato() { // Este constructor no recibe nada y establece por defecto tanto sexo como raza
        super(Sexo.HEMBRA);
        this.raza = "siam�s";
    }

    public Gato(String raza, int patas, String sonido, Sexo sexo) {
        super(sexo);
        this.raza = raza;
        this.patas = patas;
        this.sonido = sonido;
    }

    @Override
    public String toString() { // Aqu� vemos c�mo, podemos llamar al to string de la
        // super clase y le a�adimos lo que queremos complementar de esta
        return super.toString() +
                "raza='" + raza + '\'' +
                ",  tiene =" + patas +
                ", patas y='" + sonido + '\''
                ;
    }

    public void ronronea(){
        System.out.println("Rorrorrorro");
    }

    public  void come(String comida){
        if (comida.equals("pescado")){
            System.out.println("Hmmm, que g�enooo");
        }else{
            System.out.println("Lo siento, yo solo como pescado");
        }
    }

    public void peleaCon(Gato contrincante) {
        if (this.getSexo() == Sexo.HEMBRA) {
            System.out.println("no me gusta pelear");
        } else {
            if (contrincante.getSexo() == Sexo.HEMBRA) {
                System.out.println("no peleo contra gatitas");
            } else {
                System.out.println("ven aqu� que te vas a enterar");
            }
        }
    }
}
