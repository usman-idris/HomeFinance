/**
 * The login class
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author Usman Idris Kwaru
 *
 */
public class Login extends JFrame implements ActionListener {
	JPanel loginPanel;
	JTextField txtUserName, txtPassword;
	JLabel lblUserName, lblPassword, lblWelcome;
	
	public Login() {
		this.setTitle("Home Finance"); 
		this.setSize(1400, 800);
		this.setLocationRelativeTo(null); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
