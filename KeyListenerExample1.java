import java.awt.*;    
import java.awt.event.*;     

public class KeyListenerExample1 extends Frame implements KeyListener {    
    Label l;    
    TextArea area;    
 
    KeyListenerExample1() {    
           l = new Label();    
		   l.setBounds (20, 50, 200, 20);    
 		   area = new TextArea();    
		   area.setBounds (20, 80, 300, 300); 
   
          // adding KeyListener to the text area   
		  area.addKeyListener(this);   
 
		 // adding label and text area to frame  
  		 add(l);  
		 add(area);  
  
		// setting size, layout and visibility of frame  
        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }    
	public void keyPressed(KeyEvent e) {}  
  
    // overriding the keyReleased() method of KeyListener interface   
		public void keyReleased (KeyEvent e) {    
        String text = area.getText();  
  		String words[] = text.split ("\\s");    
		l.setText ("Words: " + words.length + " Characters:" + text.length());    
    }    
    public void keyTyped(KeyEvent e) {}   
 	public static void main(String[] args) {    
        new KeyListenerExample1();    
    }    
}    