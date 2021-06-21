package LibroJava.POO;

public class Pinguino extends Ave{
    // Aquí estamos pasando a la tercera línea de herencia
    // un pingüino es un ave y también un animal.
    // Pingüino heredará todos los atributos y métodos tanto de
    // animal com ode ave

    public Pinguino(){
        super(); // Llamada al constructor de la clase padre (Ave)
        // que a su vez llama al constructor de la clase cúspide
        // en la actual jerarquía de clases (Animal)

    }

    public Pinguino(Sexo sexo){
        super(sexo);
    }

    @Override
    public void aVolar() { // Sobreescribimos el método de la clas Ave,pero en esta clase
        // le cambiamos el contenido y por lo tanto el comportamiento. Un método sobreescrito siempre debe llamarse igual,
        // y tener los mismos parámetros aunque el código del mismo puede cambiar. Si en la clase de origen
        //está declarado como final, en ese caso no podrá ser sobreescrito.
        System.out.println("Soy un pájaro muy grande que no puede volar");
    }
}
