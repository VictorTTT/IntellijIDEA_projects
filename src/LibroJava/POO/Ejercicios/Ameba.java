package LibroJava.POO.Ejercicios;

/*Las amebas son seres unicelulares de forma cambiante ya que carecen de
pared celular. Fagocitan cualquier cosa que se les pone por delante. Crea la
clase Ameba con el atributo peso, un n�mero entero que indica los microgramos
que pesa el bicho. Al tratarse de una unidad tan peque�a, no se tienen en
cuenta los decimales, ser� un dato entero. Cuando Dios crea una ameba de la
nada � new Ameba() � su peso es de 3 microgramos. Al comer, va incrementando
su peso; gasta un microgramo en el proceso de fagocitar y el resto hace que
aumente de peso. Por ejemplo, si come una part�cula de 6 microgramos � por
ej. miAmeba.come(6) � engordar�a 5 microgramos. Una ameba se puede comer
a otra ameba. En este caso, sucede lo mismo que anteriormente, se gasta
un microgramo en el proceso de fagocitado y el resto lo engorda la ameba
que come. Por ejemplo, si una ameba de 7 microgramos se come a una de
4, acaba pesando 10 microgramos. La ameba comida no se destruye sino
que se quedar�a con un peso de 0 microgramos, una pena de ameba vamos.
Posteriormente, una ameba comida podr�a recuperarse si ella misma come
algo. N�tese que el m�todo come est� sobrecargado.*/

public class Ameba {

    //Atributos

    private int peso;//peso en microgramos

    //Constructor

    public Ameba() {
        this.peso = 3;//cuando Dios crea a una Ameba le da un peso de 3 microgramos
    }

    //Getters-Setters


    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //M�todos programa

    public void come(int peso){
        this.peso+=peso-1;
    }

    public void come (Ameba otraAmeba){
        this.peso+=otraAmeba.getPeso()-1;
        otraAmeba.setPeso(0);
    }

    //toString


    @Override
    public String toString() {
        return "Soy una Ameba y peso "+peso+" microgramos";
    }
}

