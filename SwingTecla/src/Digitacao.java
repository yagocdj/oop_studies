import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Digitacao {

	private JFrame frame;
	private JTextField textfield;
	private JLabel lbl1;
	private JLabel lbl3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Digitacao window = new Digitacao();
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
	public Digitacao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				frame.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
			}
		});
		frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frame.setBounds(100, 100, 380, 177);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Digita\u00E7\u00E3o de caracteres");
		frame.getContentPane().setLayout(null);

		lbl1 = new JLabel("Digite um caractere");
		lbl1.setBounds(10, 31, 121, 20);
		frame.getContentPane().add(lbl1);

		textfield = new JTextField();
		textfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				int codigo = e.getKeyChar();
				if (codigo >= 32)
					lbl3.setText(lbl3.getText() + e.getKeyChar());
				System.out.println(codigo + "--" + e.getKeyChar());
			}
		});
		textfield.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		textfield.setBounds(139, 31, 162, 20);
		textfield.requestFocus();
		frame.getContentPane().add(textfield);

		JButton button_1 = new JButton("limpar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textfield.setText("");
				textfield.requestFocus();
			}
		});
		button_1.setBounds(172, 62, 89, 23);
		frame.getContentPane().add(button_1);

		lbl3 = new JLabel("caracter digitado:");
		lbl3.setBounds(10, 96, 315, 29);
		frame.getContentPane().add(lbl3);
	}
}
