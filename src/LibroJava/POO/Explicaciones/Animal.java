package LibroJava.POO;
//En el siguiente apartado veremos qué son las subclases. De momento fíjate en el
//ámbito del atributo y de los métodos en la definición de la clase Animal.

public abstract class Animal {

    /*Una clase abstracta es aquella que no va a tener instancias de forma directa,
aunque sí habrá instancias de las subclases (siempre que esas subclases
no sean también abstractas). Por ejemplo, si se define la clase Animal como
abstracta, no se podrán crear objetos de la clase Animal, es decir, no se podrá
hacer Animal mascota = new Animal(), pero sí se podrán crear instancias de la clase
Gato, Ave o Pinguino que son subclases de Animal.*/

    private Sexo sexo; // Variable de tipo enumerado, un animal solo puede ser macho, hembra o hermafrodita, cuando esto ocurre
    // podemos recurrir a los tipos enumerados para que se pueda elegir únicamente entre estas tres opciones.

    public Animal(){  // Constructor sin parámetros
        sexo=Sexo.MACHO; // Inicializa el sexo del animal en macho, los tipos enumerados se suelen poner en mayúsculas
    }

    public  Animal (Sexo s){ // Constructor con un parametro, que inicializará el sexo según el valor que le pasemos
        sexo = s;
    }

    public Sexo getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "El sexo del animal es: " + sexo ;
    }

    public  void duerme(){
        System.out.println("Zzzzzzz");
    }

    public void come(){
        System.out.println("Soy cualquier animal comiendo");
    }

    /*Ahora vamos a declarar el tipo enumerado de la siguiente forma*/

    public enum Sexo{  // Me doy cuenta de que es como un método pero sin paréntesis en su declaración.

          MACHO, HEMBRA, HERMAFRODITA
    }




}
