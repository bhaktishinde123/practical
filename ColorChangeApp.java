import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.Color;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ColorChangeApp implements ActionListener {
    JFrame f;
    JTextField tf;
    public static void main(String[] args) {
        new ColorChangeApp();
    }
   
    public ColorChangeApp() {
         f = new JFrame("Change colors by button click!");
        JButton b = new JButton("Click Me!");
        b.setBounds(50,50,100,20);
        b.addActionListener(this);
        
        tf = new JTextField();
        tf.setBounds(200,50,100,20);
        f.add(b);
        f.add(tf);
       
        f.setSize(500,500);
        f.setLayout(null);
        
        f.setDefaultCloseOperation(3);
        f.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int r = (int) (Math.random()*256);
        int g = (int) (Math.random()*256);
        int b = (int) (Math.random()*256);
        Color c = new Color(r,g,b);
        f.getContentPane().setBackground(c);
        tf.setText("the color is,"+ r + "," + g + "," + b);
  }
}