package Little.Blue.Fox;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel { //ctrl+o(англ)
    private Circles circles = new Circles(150, 50, 500, 500);
    private Bill bill = new Bill(400, 200, 40, 40);
    private Background background = new Background(0, 0);
    private Title title = new Title(0, 0, "");

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D)g;
        background.draw(gr);
        title.draw(gr);
        circles.draw(gr);
        bill.draw(gr);
    }
}
