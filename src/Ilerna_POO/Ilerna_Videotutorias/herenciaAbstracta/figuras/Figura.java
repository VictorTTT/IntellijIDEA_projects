package Ilerna_POO.Ilerna_Videotutorias.herenciaAbstracta.figuras;

public abstract class Figura {// De esta clase no podremos crear objetos, pero servir� a las que hereden de ella
    //para utilizar sus atributos y m�todos. Las clases abstractas se utilizan para ahorrar c�digo y tambi�n para crear
    //una estructura b�sica que las dem�s clases que hereden de ella tengan que utilizar.
    protected int lados;//  todas las figuras tienen varios lados
    protected double[] longitudLado;//  cada lado lo vamos a almacenar en una posici�n del array

    public abstract void area();//  funci�n abstracta que no debemos implementar, sino que sirve para "obligar" a las clases que heredan a hacerlo
    public abstract void perimetro();//  funci�n abstracta que no debemos implementar, sino que sirve para "obligar" a las clases que heredan a hacerlo
    protected final void perimetro(String nombreFigura){//  este m�todo al ser final las clases que herden podr�n utilizarlo pero no sobreescribirlo
        double total=0;
        for(int i=0;i<longitudLado.length;i++){
            total+=longitudLado[i];
        }
        System.out.println("Perimetro de la figura "+nombreFigura+":"+total);
    }

}
