import java.awt.*;

public class Square extends Shape{

    public Square(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(),getY(),getWidth(),getHeight());
        g.setColor(Color.BLACK);
        g.drawRect(getX(),getY(),getWidth(),getHeight());

    }

    public int getDistanceBetweenPoints(int a,int b)
    {
        return Math.abs(a-b);
    }
}
