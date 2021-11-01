import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Animals extends GraphicsProgram {

    public void cria(){
        GRect rect3 =  new GRect(60,30);
        rect3.setLocation(150,150);
        rect3.setColor(Color.red);
        rect3.setFilled(true);
        add(rect3);
    }
}
