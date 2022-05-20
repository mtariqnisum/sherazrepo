import javax.swing.*;

public class RunException {
    public static void main(String arg[])
    {
 JFrame frame=new JFrame("Custom Exception");

        // setting close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // sets 500 width and 600 height
        frame.setSize(600, 600);
        frame.add(new MyRobot(600, 600));
        // uses no layout managers
        frame.setLayout(null);

        // makes the frame visible
        frame.setVisible(true);
    }
}
