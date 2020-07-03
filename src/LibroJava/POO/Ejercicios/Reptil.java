package LibroJava.POO.Ejercicios;

public abstract class Reptil extends Animal {


    public Reptil() {
        super();
    }

    public void tomarElSol(){
        System.out.println("Estoy tomando el sol");

    }

    public void regularTemperatura(){
        System.out.println("Estoy regulando mi temperatura croporal, solamente los reptiles podemos hacerlo");
    }

    public void escondete(){
        System.out.println("Me acabo de esconder y ya no puedes verme");
    }

    @Override
    public String toString() {
        return super.toString()+" es un REPTIL ";
    }
}
