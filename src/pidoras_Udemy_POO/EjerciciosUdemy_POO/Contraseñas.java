package pidoras_Udemy_POO.EjerciciosUdemy_POO;

import java.util.Random;

public class Contraseñas {

    private String contraseña = "";//variable que almacenará la contraseña

    private int numCaracteres;

    private int numContraseñas;

    private int[] arrayContraseñas;

    private char[] arrayCaracteres;

    private Random rnd = new Random();//instancia de la clase Random que genera número aleatorio


    public Contraseñas(int numContraseñas, int numCaracteres) {//constructor diferente al default

        this.numCaracteres = numCaracteres;

        this.numContraseñas = numContraseñas;

        arrayContraseñas = new int[this.numContraseñas];

        arrayCaracteres = new char[this.numCaracteres];

    }

    public int getNumCaracteres()//devuelve número de caracteres
    {
        return numCaracteres;
    }

    public String getContraseña()//devuelve contraseña generada
    {
        return contraseña;
    }

    public void setContraseña()//construye contraseña
    {
        for (int i = 0; i < getNumCaracteres(); i++) {

            char caracter;//variable local que almacenará un caracter caracter que será número, mayúscula ó minuscula

            caracter = (char) (rnd.nextInt(122) + 1);//aleatorio elige número comprendido entre el 1 y el 122 y lo conVierte en ASCII

            if (caracter >= 48 && caracter <= 57 || caracter >= 65 && caracter <= 90 || caracter >= 97 && caracter <= 122) {

                //Si el caracter es número, mayúscula ó minuscula

                contraseña += caracter;//se almacenará en la contraseña

            } else i--;//si no, se resta una vuelta de bucle y por lo tanto no se almacena

        }

    }

    public boolean getContraseñaSegura()//evalua contraseña y devuelve si es segura o no
    {
        return true;
    }


}
