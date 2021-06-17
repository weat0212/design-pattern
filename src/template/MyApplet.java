package template;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {

    String message;

    @Override
    public void init() {
        message = "Hello World";
        repaint();
    }

    @Override
    public void start() {
        message = "Now I'm starting up...";
    }

    @Override
    public void stop() {
        message = "Oh, now I'm being stopped...";
    }

    @Override
    public void destroy() {
        // applet is going away...
    }

    @Override
    public void print(Graphics g) {
        g.drawString(message, 5, 15);
    }
}
