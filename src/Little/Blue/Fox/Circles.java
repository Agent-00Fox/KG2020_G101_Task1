package Little.Blue.Fox;

import java.awt.*;

public class Circles implements Drawable {
    private int x, y, width, height;

    public Circles(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    @Override
    public void draw(Graphics2D g) {
        drawCircles(g, this.x, this.y, this.width, this.height);
    }

    public static void drawCircles(Graphics2D g, int x, int y, int width, int height) {

        Color c1 = new Color(255, 163, 1, 141);
        Color c2 = new Color(253, 213, 0, 170);
        Color c3 = new Color(254, 232, 0, 170);

        g.setColor(c1);
        g.fillOval(x, y, width, height); //150, 50, 500, 500
        g.setColor(Color.black);
        g.drawOval(x, y, width, height); //150, 50, 500, 500

        g.setColor(c2);
        g.fillOval(x+10, y+10, width-20, height-20); //160, 60, 480, 480
        g.setColor(Color.black);
        g.drawOval(x+10, y+10, width-20, height-20); //160, 60, 480, 480

        g.setColor(c1);
        g.fillOval(x+60, y+60, width-120, height-120); //210, 110, 380, 380
        g.setColor(Color.black);
        g.drawOval(x+60, y+60, width-120, height-120); //210, 110, 380, 380

        g.setColor(c3);
        g.fillOval(x+70, y+70, width-140, height-140); //220, 120, 360, 360
        g.setColor(Color.black);
        g.drawOval(x+70, y+70, width-140, height-140); //220, 120, 360, 360

        int count = 200;
        int r = 240;
        int R = 190;
        double da = 2*Math.PI/count;
        for (int i=0; i<count; i++) {
            double dx1 = r*Math.cos(da*i);
            double dy1 = r*Math.sin(da*i);
            double dx2 = R*Math.cos(da*i);
            double dy2 = R*Math.sin(da*i);

            g.drawLine(x+(int)dx1+width/2, y+(int)dy1+height/2, x+(int)dx2+width/2, y+(int)dy2+height/2);
        }
    }
}