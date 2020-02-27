package Udemy_POO;

public class CedenaDeHerencia
{
    public static void main(String[] args)
    {
        Clase4 miobj=new Clase4();

        miobj.metodo1();

    }
}

class Clase1
{
    public void metodo1()
    {

    }
}

class Clase2 extends Clase1
{
    public void metodo2()
    {

    }
}

class Clase3 extends Clase2
{
    public void metodo3()
    {

    }
}

class Clase4 extends Clase3
{
    public void metodo4()
    {

    }

}