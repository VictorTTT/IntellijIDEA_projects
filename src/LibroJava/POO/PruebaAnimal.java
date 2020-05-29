package LibroJava.POO;

/*Con el siguiente programa se prueba la clase Animal y todas las subclases que derivan
de ella*/
public class PruebaAnimal {
    public static void main(String[] args) {

        Gato garfield = new Gato(Animal.Sexo.MACHO, "romano");
        Gato tom = new Gato(Animal.Sexo.MACHO);
        Gato lisa = new Gato(Animal.Sexo.HEMBRA);
        Gato silvestre = new Gato();
        Gato adoptado = new Gato("Callejero", 4, "maulla", Animal.Sexo.HERMAFRODITA);

        System.out.println(garfield);
        System.out.println(tom);
        System.out.println(lisa);
        System.out.println(silvestre);
        System.out.println(adoptado);

        Ave miLoro = new Ave();  //los objetos miLoro y pingu actúan de manera polimórfica porque
        miLoro.aseate();       // a ambos se les aplican los métodos aseate y aVolar.
        miLoro.aVolar();
        Ave rapaz=new Ave(Animal.Sexo.MACHO,"Dos", Ave.Pico.LARGO);
        rapaz.aseate();
        rapaz.aVolar();

        Pinguino pingu = new Pinguino(Animal.Sexo.HEMBRA);
        pingu.aseate();
        pingu.aVolar();
        System.out.println(rapaz);
        System.out.println(miLoro);
        System.out.println(pingu);


         /*Polimorfismo
          En Programación Orientada a Objetos, se llama polimorfismo a la capacidad
          que tienen los objetos de distinto tipo (de distintas clases) de responder al
          mismo método.*/


    }
}
