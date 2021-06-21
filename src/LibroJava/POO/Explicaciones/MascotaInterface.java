package LibroJava.POO;
/*Una interfaz contiene únicamente la cabecera de una serie de métodos (opcionalmente
también puede contener constantes) es decir las variables que eventualmente se declaren en una interfaz
serán una constantes.

Por tanto se encarga de especificar un
comportamiento que LUEGO tendrá que ser implementado. La interfaz no especifica
el “cómo” ya que no contiene el cuerpo de los métodos, solo el “qué”.*/

/*La interfaz indica “qué” hay que hacer y la implementación especifica “cómo”
se hace.
Una interfaz puede tener varias implementaciones.
Una interfaz no se puede instanciar.
La implementación puede contener métodos adicionales cuyas cabeceras no
están en su interfaz.*/


public interface MascotaInterface {

    String getCodigo(); // Quiere decir, que la clase que implmente esta interfaz , deberá darle forma a este método
    void hazRuido();//"
    void come(String comida);//"
    void peleaCon(Animal contrincante);//"

    /*Me doy cuenta de que todoos los métodos que se incluyen en la interfaz,
     luego se han de codificar en las clases que la implementen*/














}
