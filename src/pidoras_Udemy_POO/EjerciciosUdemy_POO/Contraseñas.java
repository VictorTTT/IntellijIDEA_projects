package pidoras_Udemy_POO.EjerciciosUdemy_POO;

import java.util.Random;

public class Contrase�as {

    private String contrase�a = "";//variable que almacenar� la contrase�a

    private int numCaracteres;

    private int numContrase�as;

    private int[] arrayContrase�as;

    private char[] arrayCaracteres;

    private Random rnd = new Random();//instancia de la clase Random que genera n�mero aleatorio


    public Contrase�as(int numContrase�as, int numCaracteres) {//constructor diferente al default

        this.numCaracteres = numCaracteres;

        this.numContrase�as = numContrase�as;

        arrayContrase�as = new int[this.numContrase�as];

        arrayCaracteres = new char[this.numCaracteres];

    }

    public int getNumCaracteres()//devuelve n�mero de caracteres
    {
        return numCaracteres;
    }

    public String getContrase�a()//devuelve contrase�a generada
    {
        return contrase�a;
    }

    public void setContrase�a()//construye contrase�a
    {
        for (int i = 0; i < getNumCaracteres(); i++) {

            char caracter;//variable local que almacenar� un caracter caracter que ser� n�mero, may�scula � minuscula

            caracter = (char) (rnd.nextInt(122) + 1);//aleatorio elige n�mero comprendido entre el 1 y el 122 y lo conVierte en ASCII

            if (caracter >= 48 && caracter <= 57 || caracter >= 65 && caracter <= 90 || caracter >= 97 && caracter <= 122) {

                //Si el caracter es n�mero, may�scula � minuscula

                contrase�a += caracter;//se almacenar� en la contrase�a

            } else i--;//si no, se resta una vuelta de bucle y por lo tanto no se almacena

        }

    }

    public boolean getContrase�aSegura()//evalua contrase�a y devuelve si es segura o no
    {
        return true;
    }


}
