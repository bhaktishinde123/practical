// Java Program to implement 
// AWT ActionListener 
import java.awt.*; 
import java.awt.event.*; 

// Driver Class 
public class main4 { 
	// main function 
	public static void main(String[] args){ 
		
		// Create a frame 
		Frame f = new Frame("AWT ActionListener Example"); 
		
		// Set the size 
		f.setSize(400, 200); 
		
		// Set the layout 
		f.setLayout(null); 
		
		// Make the frame visible 
		f.setVisible(true); 
		
		// Set the background color of the frame 
		f.setBackground(Color.LIGHT_GRAY); 

		// Create a button 
		Button b = new Button("Click Me"); 
		
		// Set the positions 
		b.setBounds(160, 100, 80, 40); 
		
		// Add button to the frame 
		f.add(b); 
		
		// Set the background color of the button 
		b.setBackground(Color.GREEN); 

		// Create a text field 
		TextField tf = new TextField(); 
		
		// Set the positions 
		tf.setBounds(50, 50, 300, 30); 
		
		// Add text field to the frame 
		f.add(tf); 

		// Create a label 
		Label lb = new Label(); 
		
		// Set the positions 
		lb.setBounds(100, 150, 300, 30); 
		
		// Add label to the frame 
		f.add(lb); 

		// Add an action listener to the button 
		b.addActionListener(new ActionListener() { 
			
			// Override the actionPerformed() method 
			public void actionPerformed(ActionEvent e){ 
				
				// Update the text of the label 
				lb.setText("Hey " + tf.getText() + "! "
						+ "Welcome to GeeksforGeeks!"); 
			} 
			
		}); 
	} 
}
