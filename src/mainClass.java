import acm.graphics.*;
import acm.program.*;

import java.awt.*;

public class mainClass extends GraphicsProgram {

    public static final int REFRESH = 50;


    public void run() {
        Aleatori al1 = new Aleatori();
        Aleatori al = new Aleatori();
        style stl = new style();
        setSize(stl.WINDOW_WIDTH, stl.WINDOW_HEIGHT);
        stl.Background();
        addMouseListeners();
        addKeyListeners();
        GRect rect1 = new GRect(30, 30);
        rect1.setLocation(300, 300);
        rect1.setColor(Color.BLUE);
        GRect rect2 = new GRect(10, 10);
        rect2.setLocation(300, 300);
        rect2.setColor(Color.yellow);
        rect2.setFilled(true);
        rect1.setFilled(true);
        add(rect2);
        add(rect1);
        Animals san = new Animals();


        while (true) {
            al1 = new Aleatori();
            rect2.setLocation(rect2.getLocation().getX() + al.numAleatori(), rect2.getLocation().getY() + al1.numAleatori());
            pause(REFRESH);
            rect1.setLocation(rect1.getLocation().getX() + al.numAleatori(), rect2.getLocation().getY() + 2);

        }


    }
}


