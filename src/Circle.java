import java.awt.*;

public class Circle extends Shape{
    public Circle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

   /* getCircleCoordinates() {

    }*/

    public void doSomething() {
        for(int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
        }
    }

    @Override
    public void draw(Graphics g1) {
        Graphics2D g= (Graphics2D) g1;
        g.setColor(getColor());
        g.fillOval(getX(),getY(),getWidth(),getHeight());
        g.setColor(Color.BLACK);
        g.drawOval(getX(),getY(),getWidth(),getHeight());
    }

    public Point getMidPoint(int x,int y,int x2,int y2)
    {
        return new Point((x+x2)/2,(y+y2)/2);
    }

    public int getDistanceBetweenPoints(int a,int b)
    {
        return Math.abs(a-b);
    }
}
