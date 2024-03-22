import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyMouse extends JFrame implements MouseListener
{
  JLabel label;
  MyMouse(){
    addMouseListener(this);
    label = new JLabel();
    label.setBounds(90,80,130,20);
    label.setFont(new Font("Serif", Font.BOLD, 20));
    add(label);
    setSize(250,250);
    setLayout(null);
    setVisible(true);
  }
  public void mouseClicked(MouseEvent e) {
    label.setText("Clicked");
  }
  public void mouseEntered(MouseEvent e) {
    label.setText("Entered");
  }
  public void mouseExited(MouseEvent e) {
    label.setText("Exited");
  }
  public void mousePressed(MouseEvent e) {
    label.setText("Pressed");
  }
  public void mouseReleased(MouseEvent e) {
    label.setText("Released");
  }
  public static void main(String[] args) {
    new MyMouse();
  }
}