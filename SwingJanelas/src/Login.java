/*
 * IFPB - TSI - POO
 * Prof. Fausto Ayres
 * 
 */

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class Login {

	private JFrame frame;
	private JButton button;
	private JButton button_2;
	private JPasswordField passwordField;
	private JLabel label_1;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initializar();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initializar() {
		frame = new JFrame();
		frame.setTitle("Login");
		frame.setBounds(100, 100, 265, 194);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		label = new JLabel("senha:");
		label.setBounds(26, 34, 46, 14);
		frame.getContentPane().add(label);
		frame.getRootPane().setDefaultButton(button);

		button = new JButton("ok");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String senha = new String(passwordField.getPassword());
				if (senha.equals("ifpb")) {
					Janela1 tela = new Janela1();
					frame.dispose();
					
				} else {
					label_1.setText("tente novamente");
					passwordField.setText("");
					passwordField.requestFocus();
				}
			}
		});
		button.setBounds(53, 74, 63, 23);
		frame.getContentPane().add(button);

		button_2 = new JButton("sair");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		button_2.setBounds(126, 74, 63, 23);
		frame.getContentPane().add(button_2);

		frame.getRootPane().setDefaultButton(button);

		passwordField = new JPasswordField();
		passwordField.setBounds(82, 31, 100, 20);
		frame.getContentPane().add(passwordField);

		label_1 = new JLabel("resultado:");
		label_1.setBounds(26, 116, 194, 14);
		frame.getContentPane().add(label_1);
	}
}
