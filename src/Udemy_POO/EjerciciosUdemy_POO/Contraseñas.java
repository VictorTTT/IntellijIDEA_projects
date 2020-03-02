package Udemy_POO.EjerciciosUdemy_POO;

import java.util.Random;

public class Contrase�as
{
    private char contrase�a;

    private int numCaracteres;

    private int numContrase�as;

    private  int arrayContrase�as[];

    private char[] arrayCaracteres;

    private Random rnd=new Random();


    public Contrase�as(int numContrase�as,int numCaracteres)//constructor diferente al default
    {
        this.numCaracteres = numCaracteres;

        this.numContrase�as = numContrase�as;

        arrayContrase�as=new int[this.numContrase�as];

        arrayCaracteres=new char[this.numCaracteres];

    }

    public int getNumCaracteres()//devuelve n�mero de caracteres
    {
        return numCaracteres;
    }

    public char getContrase�a()//devuelve contrase�a generada
    {
        return contrase�a;
    }

    public void setContrase�a()//construye contrase�a
    {
        for (int i = 0; i <getNumCaracteres() ; i++)
        {
            arrayCaracteres[i]= (char) (Math.random()*57);

        }
        contrase�a =arrayCaracteres[getNumCaracteres()];
    }

    public boolean getContrase�aSegura()//evalua contrase�a y devuelve si es segura o no
    {
        return true;
    }



}
