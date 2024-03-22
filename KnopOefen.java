import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
 class MyRectangle extends JPanel{//Rectangle class already exists
 
   boolean swoosh;//needs it here
   public void setSwoosh(boolean trueFalse){swoosh = trueFalse;}
   public boolean getSwoosh(){return swoosh;}
   @Override
    protected void paintComponent(Graphics g) {
 
      //if (swoosh == false) {
     // g.setColor(Color.blue);
 
      //g.fillRect(20, 50, 100, 100);
 
      //}  else {
      //g.setColor(Color.red);
 
      //g.fillRect(20, 50, 100, 100);
      //}
      super.paintComponent(g);//almost always needed
      g.setColor(swoosh? Color.red:Color.blue);
      g.fillRect(20, 50, 100, 100);//only need it once, after setting color to blue or red
     }
  }
class KnopOefen implements ActionListener {
 
  JFrame frame;
  MyRectangle recty;//listener needs to reference it
 
  public static void main(String[] args) {
    //boolean swoosh = true;
    //KnopOefen knop = new KnopOefen();
    //knop.go();
    new KnopOefen().go();
 
  }
 
  public void go() {
    frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
    JButton button = new JButton("Click to make the square red!");
    button.addActionListener(this);
 
    //MyRectangle recty = new MyRectangle();//moved declaration to class field
    recty = new MyRectangle();
 
    frame.getContentPane().add(BorderLayout.SOUTH, button);
    frame.getContentPane().add(BorderLayout.CENTER, recty);
    frame.setSize(300,300);
    frame.setVisible(true);
  }
 
  public void actionPerformed(ActionEvent event) {
    //boolean swoosh = false;
    //KnopOefen knip = new KnopOefen();
    //knip.go();
    recty.setSwoosh(!recty.getSwoosh());
    recty.repaint();
  }
 
}