package Ilerna_Videotutorias;

public class Main {

    public static void main(String[] args)//aprender de memoria
    {
        Puerta puerta1 = new Puerta();

        puerta1.funcionPublica("Esta es una función pública");

        puerta1.funcionPackage("Esta es una fución package");

        puerta1.setAncho(101);

        Puerta puerta2 = new Puerta(200, 400);

        Puerta puerta3 = new Puerta(50, 50, "Rojo");

        System.out.println(puerta1.toString());

        System.out.println(puerta2.toString());

        System.out.println(puerta3.toString());
    }
}
