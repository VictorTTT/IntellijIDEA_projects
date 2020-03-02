package Udemy_POO.EjerciciosUdemy_POO;

import java.util.Random;

public class Contraseñas
{
    private char contraseña;

    private int numCaracteres;

    private int numContraseñas;

    private  int arrayContraseñas[];

    private char[] arrayCaracteres;

    private Random rnd=new Random();


    public Contraseñas(int numContraseñas,int numCaracteres)//constructor diferente al default
    {
        this.numCaracteres = numCaracteres;

        this.numContraseñas = numContraseñas;

        arrayContraseñas=new int[this.numContraseñas];

        arrayCaracteres=new char[this.numCaracteres];

    }

    public int getNumCaracteres()//devuelve número de caracteres
    {
        return numCaracteres;
    }

    public char getContraseña()//devuelve contraseña generada
    {
        return contraseña;
    }

    public void setContraseña()//construye contraseña
    {
        for (int i = 0; i <getNumCaracteres() ; i++)
        {
            arrayCaracteres[i]= (char) (Math.random()*57);

        }
        contraseña =arrayCaracteres[getNumCaracteres()];
    }

    public boolean getContraseñaSegura()//evalua contraseña y devuelve si es segura o no
    {
        return true;
    }



}
