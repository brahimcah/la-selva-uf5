import acm.graphics.GImage;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;
import java.util.Scanner;

public class mainClass extends GraphicsProgram {

    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 800;
    public static final int REFRESH = 50;


    //Indiquem quin volem que sigui el noste fons de pantalla
    public void Background (){
        GImage background = new GImage("../resources/background.jpg");
        background.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        add(background);

    }
    private static final String NOMS[] = {"Camell1", "Camell2", "Camell3", "Camell4", "Camell5", "Camell6"};


    public void run() {
        Aleatori numAlt = new Aleatori();
        style style = new style();



        setSize(style.WINDOW_WIDTH, style.WINDOW_HEIGHT);
        Background();
        addMouseListeners();
        addKeyListeners();

        double la = Math.random()*5+1;

        Animals camells [] = new Animals[6];
        //Generem els camells
        for (int i = 0; i<camells.length; i++){

            Scanner r = null;
            int quincamell = r.nextInt(5)+1;

            if (quincamell==1){
                camells[i]= new Animals(NOMS[i]);
            }
            else if (quincamell==2){
                camells[i]= new Animals(NOMS[i]);
            }
            else if (quincamell==3){
                camells[i]=new Animals(NOMS[i]);
            }
            else if (quincamell==4){
                camells[i]=new Animals(NOMS[i]);
            }
            else if (quincamell==5){
                camells[i]=new Animals(NOMS[i]);
            }}

        int n = 100;
        add(camells[]);

        //Fem que corrin
        int j=0;
        do {

            for (int p = 0; p<50; p++){

                Animals.mou();
            }
            pause(REFRESH);

        }while(j!=3);

}}}

