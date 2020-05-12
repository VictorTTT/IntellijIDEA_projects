package Ilerna_POO.codigosMaterialDidáctico;

public class ProfesorInterino extends Profesor{
    // Un profesor interino es un profesor, y al ser profesor una clase abstracta deberemos

    //Main

    public static void main(String[] args) {

        ProfesorInterino p= new ProfesorInterino();
        p.NotaMedia(6.5,7,8);
    }

    public ProfesorInterino(){

        super.dni="53376730d";
        super.edad=36;
        super.Nombre="Víctor";
    }

    public double NotaMedia(double pac1,double pac2,double pac3){

        double notaMedia=super.pacs(pac1,pac2, pac3);
        System.out.println(notaMedia);
        return notaMedia;
    }



}
