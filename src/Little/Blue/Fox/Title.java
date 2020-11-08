package Little.Blue.Fox;

import java.awt.*;

public class Title implements Drawable {
    private int x, y;
    private String string;

    public Title(int x, int y, String string) {
        this.x = x;
        this.y = y;
        this.string = string;
    }

    @Override
    public void draw(Graphics2D g) {
        drawTitle(g, this.x, this.y, this.string);
    }
    public static void drawTitle(Graphics2D g, int x, int y, String string) {
        g.setColor(Color.white);
        g.setFont(new Font("TimesRoman", Font.ITALIC, 30));
        g.drawString("Реальность -", x+60, y+50);
        g.drawString("иллюзия!", x+70, y+90);
        g.drawString("Вселенная -", x+590, y+50);
        g.drawString("голограмма!", x+580, y+90);
    }
}