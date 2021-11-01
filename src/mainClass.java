import acm.graphics.GImage;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

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


    public void run() {
        Aleatori numAlt = new Aleatori();




        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        Background();
        addMouseListeners();
        addKeyListeners();

        Animals camells = new Animals("a");
        double la = Math.random()*5+1;

        int n = 100;
        camells.getMida();
        camells.setLocation(1,n);
        add(camells);

        //Fem que corrin
        int j=0;
        do {

            for (int i = 0; i<50; i++){

                camells.mou();
            }
            pause(REFRESH);

        }while(j!=3);

}}

