import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class FocusListenerExample {
  public static void main(String [] args) {
 
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("FocusListener Example");
    frame.setSize(300,150);
 
    final JLabel label = new JLabel();
    frame.add(label);
 
    frame.addFocusListener( new FocusListener() {
        public void focusGained(FocusEvent fe){
          label.setText("Focus Gained");
        }
        public void focusLost(FocusEvent fe){
          label.setText("Focus Lost");
        }
    });
 
    frame.setVisible(true);			
  }
}
