import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MoveTexto {

	private JFrame frame;
	private JTextField leftTextField;
	private JTextField rightTextField;
	private JButton moveToRightButton;
	private JButton moveToLeftButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MoveTexto window = new MoveTexto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MoveTexto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Mover Texto");
		frame.setBounds(100, 100, 420, 120);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		leftTextField = new JTextField();
		leftTextField.setBounds(10, 31, 86, 25);
		frame.getContentPane().add(leftTextField);
		leftTextField.setColumns(10);
		
		rightTextField = new JTextField();
		rightTextField.setColumns(10);
		rightTextField.setBounds(308, 31, 86, 25);
		frame.getContentPane().add(rightTextField);
		
		moveToRightButton = new JButton("->");
		moveToRightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rightTextField.setText(leftTextField.getText());
				leftTextField.setText("");
				
			}
		});
		moveToRightButton.setBounds(106, 31, 89, 25);
		frame.getContentPane().add(moveToRightButton);
		
		moveToLeftButton = new JButton("<-");
		moveToLeftButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				leftTextField.setText(rightTextField.getText());
				rightTextField.setText("");
				
			}
		});
		moveToLeftButton.setBounds(209, 31, 89, 25);
		frame.getContentPane().add(moveToLeftButton);
	}

}
