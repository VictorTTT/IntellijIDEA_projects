package Ilerna_POO.Pac_Desarrollo_entregada;

public abstract class Dinero {//clase abstracta que servir� como referencia a las que hereden de ella

    protected double dinero;//solo visible

    protected String description;

     public double getDinero() {// devuelve dinero
         return dinero;
     }

     public void setDinero(double dinero) {// establece dinero
         this.dinero = dinero;
     }

     public String getDescription() {// devuelve descripci�n
         return description;
     }

     public void setDescription(String description) {// establece descripci�n
         this.description = description;
     }
 }
