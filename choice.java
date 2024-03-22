// Java Program to create a choice and 
// manually add elements to it 
// (using add(String s) function) 
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 

class choice implements ItemListener, ActionListener { 

	// choice 
	static Choice c; 

	// frame 
	static JFrame f; 

	// label 
	static Label l; 

	// textfield 
	static TextField tf; 

	// default constructor 
	choice() 
	{ 
	} 

	// Main Method 
	public static void main(String args[]) 
	{ 

		// create a frame 
		f = new JFrame("choice"); 

		// object 
		choice ch = new choice(); 

		// create e panel 
		JPanel p = new JPanel(); 

		// create a choice 
		c = new Choice(); 

		// add element to the list 
		c.add("Andrew"); 

		// create a textfield 
		tf = new TextField(7); 

		// create a button 
		Button b = new Button("ok"); 

		// add actionListener 
		b.addActionListener(ch); 

		// add itemListener to it 
		c.addItemListener(ch); 

		// create a label 
		l = new Label(); 
		Label l1 = new Label("add names"); 

		// set the label text 
		l.setText(c.getSelectedItem() + " selected"); 

		// add choice to panel 
		p.add(c); 
		p.add(l); 
		p.add(l1); 
		p.add(tf); 
		p.add(b); 

		// add panel to the frame 
		f.add(p); 

		// show the frame 
		f.show(); 
		f.setSize(250, 300); 
	} 

	// if an item is selected 
	public void itemStateChanged(ItemEvent e) 
	{ 
		l.setText(c.getSelectedItem() + " selected"); 
	} 

	// if button is pressed 
	public void actionPerformed(ActionEvent e) 
	{ 
		// add item to the choice 
		c.add(tf.getText()); 
	} 
} 
