package LibroJava.POO;
//En el siguiente apartado veremos qu� son las subclases. De momento f�jate en el
//�mbito del atributo y de los m�todos en la definici�n de la clase Animal.

public abstract class Animal {

    /*Una clase abstracta es aquella que no va a tener instancias de forma directa,
aunque s� habr� instancias de las subclases (siempre que esas subclases
no sean tambi�n abstractas). Por ejemplo, si se define la clase Animal como
abstracta, no se podr�n crear objetos de la clase Animal, es decir, no se podr�
hacer Animal mascota = new Animal(), pero s� se podr�n crear instancias de la clase
Gato, Ave o Pinguino que son subclases de Animal.*/

    private Sexo sexo; // Variable de tipo enumerado, un animal solo puede ser macho, hembra o hermafrodita, cuando esto ocurre
    // podemos recurrir a los tipos enumerados para que se pueda elegir �nicamente entre estas tres opciones.

    public Animal(){  // Constructor sin par�metros
        sexo=Sexo.MACHO; // Inicializa el sexo del animal en macho, los tipos enumerados se suelen poner en may�sculas
    }

    public  Animal (Sexo s){ // Constructor con un parametro, que inicializar� el sexo seg�n el valor que le pasemos
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

    public enum Sexo{  // Me doy cuenta de que es como un m�todo pero sin par�ntesis en su declaraci�n.

          MACHO, HEMBRA, HERMAFRODITA
    }




}
