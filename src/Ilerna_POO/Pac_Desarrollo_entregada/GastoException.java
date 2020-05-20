package Ilerna_POO.Pac_Desarrollo_entregada;

public class GastoException extends Exception{//clase que genera una excepción

    private String error;// variable que almacena el mensaje

    public GastoException(){

        this.error="No  dispone de saldo suficiente para realizar la operación";

    }

    public String getMessage(){//método que devuelve el mensaje

        return error;

    }


}
