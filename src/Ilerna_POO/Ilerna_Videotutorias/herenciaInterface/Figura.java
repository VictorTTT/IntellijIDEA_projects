package Ilerna_POO.Ilerna_Videotutorias.herenciaInterface;

public interface Figura { // Una interfaz es muy parecida a una clase abstracta, con la diferencia de que
    //  en las interfaces, todos los m�todos que contengan ser�n abstractos
    //  (en las clases abstractas pod�n haber tanto abstractos como no abstractos)y las clases que hereden de ellas
    //  deber�n implementarlos y darles forma, contienen atributos pero son constantes y no podr�n modificarse
    //  en las clases que hereden de la interfaz.

    /*Las interfaces nos permiten definir la estructura de deiversas clases simulando la herencia m�ltiple*/

    public void area(); // el modificador de acceso de una interfaz es por defecto p�blico por eso nos lo marca en gris
    public void perimetro();// el modificador de acceso de una interfaz es por defecto p�blico por eso nos lo marca en gris
}
