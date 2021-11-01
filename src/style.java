import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.awt.*;

public class style  extends GraphicsProgram {
    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 800;
    public static final int REFRESH = 50;

    //Indiquem quin volem que sigui el noste fons de pantalla
    public void Background(){
        GImage background = new GImage("../resources/background.jpg");
        background.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        add(background);

    }
}
