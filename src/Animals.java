import acm.graphics.GImage;

import java.awt.*;
import java.util.Random;

public class Animals extends GImage {

    private int mida;
    //Indiquem on es troba la imatge del camell
    private static String imgPath;



    int id;

    public Animals(int id) {
        super(imgPath);
        this.id = id;
        this.mida = getMida();
    }
    public static void img(int id){
        if(id == 1){
            imgPath ="../resources/camell.gif";
        }else if(id == 2){
            imgPath ="../resources/vaca.gif";
        }
        return;
    }


    public Animals(Image image) {
        super(image);
    }

    //Getters & Setters
    public int getNom() {
        return id;
    }

    public void setNom(int nom) {
        this.id = nom;
    }

    public int getMida() {
        this.setSize(90, 97);
        return mida;
    }

    public void setMida(int mida) {
        this.mida = mida;
    }

    public void mou (){
        Random r = new Random();

        int x = r.nextInt(9);
        int y = r.nextInt(9);
        this.setLocation(getX() + x, getY() + y);
    }
}

