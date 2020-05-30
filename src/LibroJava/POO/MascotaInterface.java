package LibroJava.POO;
/*Una interfaz contiene �nicamente la cabecera de una serie de m�todos (opcionalmente
tambi�n puede contener constantes) es decir las variables que eventualmente se declaren en una interfaz
ser�n una constantes.

Por tanto se encarga de especificar un
comportamiento que LUEGO tendr� que ser implementado. La interfaz no especifica
el �c�mo� ya que no contiene el cuerpo de los m�todos, solo el �qu�.*/


public interface MascotaInterface {

    String getCodigo(); // Quiere decir, que la clase que implmente esta interfaz , deber� darle forma a este m�todo
    void hazRuido();//"
    void come(String comida);//"
    void peleaCon(Animal contrincante);//"

    /*Me doy cuenta de que todoos los m�todos que se incluyen en la interfaz,
     luego se han de codificar en las clases que la implementen*/














}
