import java.awt.*;
import javax.swing.*;

public abstract class Shape {
    private int x,y, width, height;
    private Color color;

    public Shape(int x, int y, int width, int height,Color color) {
             this.x=x;
             this.y=y;
             this.width=width;
             this.height=height;
             this.color=color;
    }

    public int getX() {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(Graphics  g);

}
