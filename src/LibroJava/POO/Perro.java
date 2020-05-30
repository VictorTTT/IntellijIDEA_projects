package LibroJava.POO;

public class Perro extends Animal implements MascotaInterface {

    String codigo; // Atributo propio de la clase perro, que no lo hereda ni lo implementa de otro sitio

    public Perro(Sexo sexo, String codigo) { //  el constructor recibe por parámetro el enumerado heredado de la clase animal y el código
        super(sexo); // se llama al constructor de la supercalse
        this.codigo = codigo; // se inicializa la variable con el valor que se pas por parámetro
    }

    @Override
    public String getCodigo() { // el método propuesto por la interfaz, lo codificamos para  que devuelva el codigo
        return this.codigo;
    }

    @Override  // me doy cuenta de que los métodos  que me obliga a implementar la interfaz deben llevar override
    public void hazRuido() { // el método propuesto por la interfaz lo codificamos para que devuelva el método ladra
        this.ladra();
    }

    public void ladra() { // este método describe el sonido que hace esta clase, será establecido también por la interfaz
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
