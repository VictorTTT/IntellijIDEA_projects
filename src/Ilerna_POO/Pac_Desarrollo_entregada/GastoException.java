package Ilerna_POO.Pac_Desarrollo_entregada;

public class GastoException extends Exception{//clase que genera una excepci�n

    private String error;// variable que almacena el mensaje

    public GastoException(){

        this.error="No  dispone de saldo suficiente para realizar la operaci�n";

    }

    public String getMessage(){//m�todo que devuelve el mensaje

        return error;

    }


}
