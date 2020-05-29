package LibroJava.POO;

//Veamos un ejemplo muy sencillo de implementación de toString. Definiremos la clase
//Cuadrado con el atributo lado, el constructor y el método toString.
public class Cuadrado {
    int lado;
    public Cuadrado(int l) {
        this.lado = l;
    }
    public String toString() {
        int i, espacios;
        String resultado = "";
        for (i = 0; i < this.lado; i++) {
            resultado += "￿￿";
        }
        resultado += "\n";
        for (i = 1; i < this.lado - 1; i++) {
            resultado += "￿￿";

            for (espacios = 1; espacios < this.lado - 1; espacios++) {
                resultado += " ";
            }
            resultado += "￿￿\n";
        }
        for (i = 0; i < this.lado; i++) {
            resultado += "￿￿";
        }
        resultado += "\n";
        return resultado;
    }
}
