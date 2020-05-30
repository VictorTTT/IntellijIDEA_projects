package LibroJava.POO;

public class Perro extends Animal implements MascotaInterface {

    String codigo; // Atributo propio de la clase perro, que no lo hereda ni lo implementa de otro sitio

    public Perro(Sexo sexo, String codigo) { //  el constructor recibe por par�metro el enumerado heredado de la clase animal y el c�digo
        super(sexo); // se llama al constructor de la supercalse
        this.codigo = codigo; // se inicializa la variable con el valor que se pas por par�metro
    }

    @Override
    public String getCodigo() { // el m�todo propuesto por la interfaz, lo codificamos para  que devuelva el codigo
        return this.codigo;
    }

    @Override  // me doy cuenta de que los m�todos  que me obliga a implementar la interfaz deben llevar override
    public void hazRuido() { // el m�todo propuesto por la interfaz lo codificamos para que devuelva el m�todo ladra
        this.ladra();
    }

    public void ladra() { // este m�todo describe el sonido que hace esta clase, ser� establecido tambi�n por la interfaz
        System.out.println("guau guau");
    }

    @Override
    public void come(String comida) { // a los perros les gusta la carne, si le damos otra comida no le va a gustar

        if(comida.equals("carne")){
            super.come();
            System.out.println("HMMMmmmm, que rica la carne para los perretes!!!!");
        }else {
            System.out.println("Lo siento, no me gusta lo que me ofreces");
        }


    }  // 185

    @Override
    public void peleaCon(Animal contrincante) {

    }
}
