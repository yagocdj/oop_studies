import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frmLogin;
	private JPasswordField passwordField;
	private String password = "hardpassword";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setResizable(false);
		frmLogin.setBounds(100, 100, 325, 225);
		frmLogin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(127, 34, 101, 19);
		frmLogin.getContentPane().add(passwordField);
		
		JLabel passwordLabel = new JLabel("Senha");
		passwordLabel.setBounds(72, 37, 45, 13);
		frmLogin.getContentPane().add(passwordLabel);

		JLabel feedbackMessage = new JLabel("");
		feedbackMessage.setBounds(27, 135, 274, 43);
		frmLogin.getContentPane().add(feedbackMessage);
		
		JButton okButton = new JButton("Ok");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String typedPassword = new String(passwordField.getPassword());
				if (typedPassword.equals(password)) {
					Placar placarWindow = new Placar();
					frmLogin.dispose();
				} else {
					feedbackMessage.setText("Ops, a senha não é essa. Tente outra.");
					passwordField.setText(null);
					passwordField.requestFocus();
				}
			}
		});
		okButton.setBounds(72, 91, 85, 21);
		frmLogin.getContentPane().add(okButton);
		
		JButton Leavebutton = new JButton("Sair");
		Leavebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLogin.dispose();
			}
		});
		Leavebutton.setBounds(167, 91, 85, 21);
		frmLogin.getContentPane().add(Leavebutton);
		
	}
}
