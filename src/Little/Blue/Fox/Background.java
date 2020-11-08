package Little.Blue.Fox;

import java.awt.*;

public class Background implements Drawable {
    private int x, y;

    public Background(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        drawBackground(g, this.x, this.y);
    }

    public static void drawBackground(Graphics2D g, int x, int y) {
        Color bg = new Color(11, 5, 88, 255);

        g.setColor(bg);
        g.fillRect(x, y, 800, 600);

        g.setColor(Color.black);
        Polygon tree1 = new Polygon();
        tree1.addPoint(x, y+50);
        tree1.addPoint(x+80, y+200);
        tree1.addPoint(x+40, y+200);
        tree1.addPoint(x+160, y+400);
        tree1.addPoint(x+80, y+400);
        tree1.addPoint(x+240, y+600);
        tree1.addPoint(x, y+600);
        g.fillPolygon(tree1);

        g.setColor(Color.black);
        Polygon tree2 = new Polygon();
        tree2.addPoint(x+800, y+50);
        tree2.addPoint(x+720, y+200);
        tree2.addPoint(x+760, y+200);
        tree2.addPoint(x+640, y+400);
        tree2.addPoint(x+720, y+400);
        tree2.addPoint(x+560, y+600);
        tree2.addPoint(x+800, y+600);
        g.fillPolygon(tree2);
    }
}