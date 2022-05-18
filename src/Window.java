import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Window extends JPanel{
    private MyCanvas canvas;
    private Graphics graphics;
    private ActionHandler actionHandler;
    private JButton btnCircle;
    private JButton btnSquare;
    private ArrayList<Shape> shapesList;

    private String currentSahpe="Circle";
    private Color color=Color.BLACK;
    private JButton btnColorChooser;

    public Window(int width,int height)  {

        setSize(width,height);
        actionHandler=new ActionHandler();
        canvas=new MyCanvas(width-200,height);
        canvas.addMouseListener(actionHandler);
        canvas.addMouseMotionListener(actionHandler);

        shapesList=new ArrayList<>();

        btnCircle=new JButton("Circle");
        btnCircle.addActionListener(actionHandler);
        btnSquare=new JButton("Square");
        btnSquare.addActionListener(actionHandler);
        btnColorChooser=new JButton("Chose Color");
        btnColorChooser.addActionListener(actionHandler);




        setLayout(new BorderLayout());
        JPanel buttonPanel=new JPanel();

        GridLayout gd=new GridLayout(3,1);
        buttonPanel.setLayout(gd);
        buttonPanel.add(btnCircle);
        buttonPanel.add(btnSquare);
        buttonPanel.add(btnColorChooser);

        add(buttonPanel,BorderLayout.WEST);
        add(canvas,BorderLayout.CENTER);
        canvas.repaint();

    }


    private class MyCanvas extends JPanel
    {

        public MyCanvas(int width,int height) {
           this.setSize(width,height);
            this.setBackground(Color.gray);

        }

        @Override
        public void paint(Graphics g) {
              for(int i=0;i<shapesList.size();i++)
              {
                  shapesList.get(i).draw(g);
              }
    }
    }

    private class ActionHandler implements MouseListener, ActionListener, MouseMotionListener, ChangeListener {
        private boolean mousePressFlag=false,mouseDragFlag=false;
        private int x1,y1,x2,y2;
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
                x1=e.getX();
                y1=e.getY();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if(mouseDragFlag)
            {


                 Shape shape=null;
                 if(currentSahpe.equalsIgnoreCase("circle"))
                 {
                     shape=new Circle(x1,y1,0,0,color);
                     Point point=((Circle)shape).getMidPoint(x1,x2,y1,y2);
                     int  distance = (int) Math.sqrt((point.y - y1) * (point.y - y1) + (point.x - x1) * (point.x - x1));
                     ((Circle)shape).setWidth(distance);
                     ((Circle)shape).setHeight(distance);
                     shapesList.add(shape);
                 }
                 else  if(currentSahpe.equalsIgnoreCase("square"))
                 {
                     shape=new Square(x1,y1,0,0,color);
                     ((Square)shape).setWidth(((Square)shape).getDistanceBetweenPoints(x1,x2));
                     ((Square)shape).setHeight(((Square)shape).getDistanceBetweenPoints(y1,y2));
                     shapesList.add(((Square)shape));
                 }
                mouseDragFlag=false;
                 canvas.repaint();
            }

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
                  if(e.getSource()==btnCircle)
                  {
                      currentSahpe="circle";
                  }
                  else if(e.getSource()==btnSquare)
                  {
                      currentSahpe="square";
                  }else if(e.getSource()==btnColorChooser)
                  {
                       color = JColorChooser.showDialog(null,
                              "Select The Shape Color", Color.BLACK);
                  }
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            mouseDragFlag=true;
           x2=e.getX();
           y2=e.getY();
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }

        @Override
        public void stateChanged(ChangeEvent e) {

        }
    }

}
