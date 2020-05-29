package LibroJava.POO;

public class Pinguino extends Ave{
    // Aqu� estamos pasando a la tercera l�nea de herencia
    // un ping�ino es un ave y tambi�n un animal.
    // Ping�ino heredar� todos los atributos y m�todos tanto de
    // animal com ode ave

    public Pinguino(){
        super(); // Llamada al constructor de la clase padre (Ave)
        // que a su vez llama al constructor de la clase c�spide
        // en la actual jerarqu�a de clases (Animal)

    }

    public Pinguino(Sexo sexo){
        super(sexo);
    }

    @Override
    public void aVolar() { // Sobreescribimos el m�todo de la clas Ave,pero en esta clase
        // le cambiamos el contenido y por lo tanto el comportamiento. Un m�todo sobreescrito siempre debe llamarse igual,
        // y tener los mismos par�metros aunque el c�digo del mismo puede cambiar. Si en la clase de origen
        //est� declarado como final, en ese caso no podr� ser sobreescrito.
        System.out.println("Soy un p�jaro muy grande que no puede volar");
    }
}
