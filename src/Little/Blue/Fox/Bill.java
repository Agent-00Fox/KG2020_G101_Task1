package Little.Blue.Fox;

import java.awt.*;

public class Bill implements Drawable {
    private int x, y, r1, r2;

    public Bill(int x, int y, int r1, int r2) {
        this.x = x;
        this.y = y;
        this.r1 = r1;
        this.r2 = r2;
    }

    @Override
    public void draw(Graphics2D g) {
        drawBill(g, this.x, this.y, this.r1, this.r2);
    }

    public static void drawBill(Graphics2D g, int x, int y, int r1, int r2) {

        g.setColor(Color.yellow);
        Polygon body = new Polygon(); // тело.
        body.addPoint(x, y); // центральная вершина.
        body.addPoint(x + 80, y + 160); // правая вершина.
        body.addPoint(x - 80, y + 160); // левая вершина.

        g.fillPolygon(body);
        g.setColor(Color.black);
        g.drawPolygon(body);

        g.setColor(Color.black); // нижняя часть.
        g.drawLine(x-50, y+100, x+50, y+100);
        g.drawLine(x-60, y+120, x+60, y+120);
        g.drawLine(x-70, y+140, x+70, y+140);

        // 1 ярус слева-направо.
        g.drawLine(x-30, y+100, x-30, y+120);
        g.drawLine(x, y+100, x, y+120);
        g.drawLine(x+30, y+100, x+30, y+120);

        // 2 ярус слева-направо.
        g.drawLine(x-50, y+120, x-50, y+140);
        g.drawLine(x-15, y+120, x-15, y+140);
        g.drawLine(x+15, y+120, x+15, y+140);
        g.drawLine(x+50, y+120, x+50, y+140);

        // 3 ярус слева-направо.
        g.drawLine(x-70, y+140, x-70, y+160);
        g.drawLine(x-30, y+140, x-30, y+160);
        g.drawLine(x, y+140, x, y+160);
        g.drawLine(x+30, y+140, x+30, y+160);
        g.drawLine(x+70, y+140, x+70, y+160);

        g.setColor(Color.white); // Глаз.
        g.fillOval(x-20, y+40, r1, r2);
        g.setColor(Color.black);
        g.drawOval(x-20, y+40, r1, r2);
        g.fillOval(x-10, y+40, (int)r1/2, r2);

        g.setColor(Color.black); // Цилиндр.
        g.fillRect(x-30, y-15, 60, 15);
        g.fillRect(x-10, y-70, 20, 70);

        g.setColor(Color.black);// Ноги.
        g.drawLine(x-20, y+160, x-40, y+230); // Левая.
        g.drawLine(x-40, y+230, x-60, y+210);
        g.drawLine(x+20, y+160, x+40, y+230); // Правая.
        g.drawLine(x+40, y+230, x+60, y+210);

        g.setColor(Color.black); // Руки
        g.drawLine(x-45, y+90, x-90, y+110); // Левая.
        g.drawLine(x-90, y+110, x-130, y+80);
        g.drawLine(x-130, y+80, x-140, y+90);
        g.drawLine(x-130, y+80, x-143, y+80);
        g.drawLine(x-130, y+80, x-142, y+70);
        g.drawLine(x-130, y+80, x-133, y+67);
        g.drawLine(x+45, y+90, x+90, y+110); // Правая.
        g.drawLine(x+90, y+110, x+130, y+80);
        g.drawLine(x+130, y+80, x+140, y+90);
        g.drawLine(x+130, y+80, x+143, y+80);
        g.drawLine(x+130, y+80, x+142, y+70);
        g.drawLine(x+130, y+80, x+133, y+67);

        g.setColor(Color.black); // Бабочка.
        Polygon bTieRight = new Polygon();
        Polygon bTieLeft = new Polygon();
        bTieLeft.addPoint(x, y+110);
        bTieLeft.addPoint(x-20, y+100);
        bTieLeft.addPoint(x-20, y+120);
        g.fillPolygon(bTieLeft);
        bTieRight.addPoint(x, y+110);
        bTieRight.addPoint(x+20, y+100);
        bTieRight.addPoint(x+20, y+120);
        g.fillPolygon(bTieRight);
    }
}
