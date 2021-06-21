package pildoras_Udemy_POO_Abstract;


// Una interfaz se utiliza en Java para simular la herencia múltiple
// En su interior solamente puede contener métodos abstractos y también constantes
// A difernecia de las clases abstractas una clase puede heredar solo de una interfaz
// sin tener que hacerlo de otras clases, es decir, con las calses abstractas esto es obligatorio
// porque marcan la cadena de herencia. Con las interfaces no
public interface ParaJefes extends ParaTrabajadores{

    void setCargo(String cargo);
    String getCargo();

}
