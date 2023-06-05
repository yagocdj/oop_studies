import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test {

	private JFrame frame;
	private JLabel label;
	private JTextField textField;
	private JButton button;
	private JButton button_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test window = new Test();
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
	public Test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 64));
		frame.setTitle("Primeira janela");
		frame.setBounds(100, 100, 345, 195);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		label = new JLabel("Digite algo:");
		label.setOpaque(true);
		label.setBackground(new Color(255, 0, 255));
		label.setBounds(10, 23, 64, 24);
		frame.getContentPane().add(label);  // add na lista de componentes
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 128, 0));
		textField.setBounds(84, 23, 128, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		button = new JButton("OK");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = "Você digitou " + "'" +textField.getText()+"'.";
				JOptionPane.showMessageDialog(null, mensagem, "Sua mensagem", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		button.setBackground(new Color(255, 255, 0));
		button.setBounds(222, 24, 86, 23);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("Limpar");
		button_1.setBackground(new Color(255, 0, 0));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.requestFocus();
			}
		});
		button_1.setBounds(222, 58, 86, 23);
		frame.getContentPane().add(button_1);
	}
}
