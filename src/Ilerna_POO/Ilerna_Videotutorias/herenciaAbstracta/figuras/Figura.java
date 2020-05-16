package Ilerna_POO.Ilerna_Videotutorias.herenciaAbstracta.figuras;

public abstract class Figura {// De esta clase no podremos crear objetos, pero servirá a las que hereden de ella
    //para utilizar sus atributos y métodos. Las clases abstractas se utilizan para ahorrar código y también para crear
    //una estructura básica que las demás clases que hereden de ella tengan que utilizar.
    protected int lados;//  todas las figuras tienen varios lados
    protected double[] longitudLado;//  cada lado lo vamos a almacenar en una posición del array

    public abstract void area();//  función abstracta que no debemos implementar, sino que sirve para "obligar" a las clases que heredan a hacerlo
    public abstract void perimetro();//  función abstracta que no debemos implementar, sino que sirve para "obligar" a las clases que heredan a hacerlo
    protected final void perimetro(String nombreFigura){//  este método al ser final las clases que herden podrán utilizarlo pero no sobreescribirlo
        double total=0;
        for(int i=0;i<longitudLado.length;i++){
            total+=longitudLado[i];
        }
        System.out.println("Perimetro de la figura "+nombreFigura+":"+total);
    }

}
