import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.awt.*;

public class MyRobot extends JPanel {
    private Point point;
    private JButton buttonArray[][];
    public MyRobot(int width,int height) {
        point=new Point(0,0);
         setSize(width,height);
         buttonArray=new JButton[10][10];

         addButton();

    }

    private void addButton()
    {
        GridLayout gd=new GridLayout(buttonArray.length,buttonArray[0].length);

        gd.setHgap(4);
        gd.setVgap(4);
        JPanel temp=new JPanel();
        temp.setLayout(gd);

        for(int i=0;i<buttonArray.length;i++)
        {for(int j=0;j<buttonArray[0].length;j++){
              JButton tempButton=new JButton("-");
              tempButton.setBackground(Color.black);
              tempButton.setOpaque(true);
              tempButton.addKeyListener(new ActionHandler());
              buttonArray[i][j]=tempButton;
              temp.add(tempButton);
        }}

        buttonArray[point.x][point.y].setBackground(Color.GREEN);
        this.add(temp,BorderLayout.CENTER);
    }

    private class ActionHandler implements KeyListener
    {

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
             if(e.getKeyCode()==KeyEvent.VK_LEFT)
             {
                 if(point.y-1>=0)
                 {
                     buttonArray[point.x][point.y].setBackground(Color.black);
                     point.y-=1;
                     buttonArray[point.x][point.y].setBackground(Color.green);
                 }
                 else
                 {
                     try {
                         throw new MyException("Robot Can't move Left");
                     } catch (MyException ex) {
                         JOptionPane.showMessageDialog(null,ex.getMessage());
                     }
                 }
             }
             else  if(e.getKeyCode()==KeyEvent.VK_RIGHT)
             {
                 if(point.y+1<buttonArray[0].length)
                 {
                     buttonArray[point.x][point.y].setBackground(Color.black);
                     point.y+=1;
                     buttonArray[point.x][point.y].setBackground(Color.green);
                 }
                 else
                 {
                     try {
                         throw new MyException("Robot Can't move Right");
                     } catch (MyException ex) {
                         JOptionPane.showMessageDialog(null,ex.getMessage());
                     }
                 }
             }
             else  if(e.getKeyCode()==KeyEvent.VK_UP)
             {
                 if(point.x-1>=0)
                 {
                     buttonArray[point.x][point.y].setBackground(Color.black);
                     point.x-=1;
                     buttonArray[point.x][point.y].setBackground(Color.green);
                 }
                 else
                 {
                     try {
                         throw new MyException("Robot Can't move Up");
                     } catch (MyException ex) {
                         JOptionPane.showMessageDialog(null,ex.getMessage());
                     }
                 }
             }
             else  if(e.getKeyCode()==KeyEvent.VK_DOWN)
             {
                 if(point.x+1<buttonArray.length)
                 {
                     buttonArray[point.x][point.y].setBackground(Color.black);
                     point.x+=1;
                     buttonArray[point.x][point.y].setBackground(Color.green);
                 }
                 else
                 {
                     try {
                         throw new MyException("Robot Can't move Down");
                     } catch (MyException ex) {
                         JOptionPane.showMessageDialog(null,ex.getMessage());
                     }
                 }
             }
             else
             {
                 try {
                     throw new MyException("Invalid Key Pressed");
                 } catch (MyException ex) {
                     JOptionPane.showMessageDialog(null,ex.getMessage());
                 }
             }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

}
