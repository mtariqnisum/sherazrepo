import javax.swing.*;
import java.awt.*;

public class Driver{
    public static void main(String args[])
    {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // sets 500 width and 600 height
        frame.setSize(900, 600);
        // adds button in JFrame
        frame.add(new Window(frame.getWidth(),frame.getHeight()));



        // uses no layout managers
        frame.setLayout(null);

        // makes the frame visible
        frame.setVisible(true);
    }
}
