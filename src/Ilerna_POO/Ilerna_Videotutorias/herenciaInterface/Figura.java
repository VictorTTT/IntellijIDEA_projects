package Ilerna_POO.Ilerna_Videotutorias.herenciaInterface;

public interface Figura { // Una interfaz es muy parecida a una clase abstracta, con la diferencia de que
    //  en las interfaces, todos los métodos que contengan serán abstractos
    //  (en las clases abstractas podín haber tanto abstractos como no abstractos)y las clases que hereden de ellas
    //  deberán implementarlos y darles forma, contienen atributos pero son constantes y no podrán modificarse
    //  en las clases que hereden de la interfaz.

    /*Las interfaces nos permiten definir la estructura de deiversas clases simulando la herencia múltiple*/

    public void area(); // el modificador de acceso de una interfaz es por defecto público por eso nos lo marca en gris
    public void perimetro();// el modificador de acceso de una interfaz es por defecto público por eso nos lo marca en gris
}
