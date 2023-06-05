
/*****************************
 * IFPB - Prof. Fausto Ayres
 *****************************/

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ArrastaBola {

	private JFrame frame;
	private Bola bola;
	private int x = 20, y = 30;
	private JLabel label;
//	private JLabel label_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArrastaBola window = new ArrastaBola();
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
	public ArrastaBola() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Uso de setas");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

//		label_1 = new JLabel("label");
//		label_1.setHorizontalAlignment(SwingConstants.CENTER);
//		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
//		label_1.setBounds(20, 186, 56, 29);
//		label_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
//		label_1.setBackground(Color.RED);
//		label_1.setOpaque(true);
//		frame.getContentPane().add(label_1);

		bola = new Bola(60, Color.RED);
		bola.setName("");
		bola.setBounds(x, y, 60, 60);
		bola.setFocusable(true);
		bola.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					x--;
					break;
				case KeyEvent.VK_RIGHT:
					x++;
					break;
				case KeyEvent.VK_UP:
					y--;
					break;
				case KeyEvent.VK_DOWN:
					y++;
					break;
				}
				bola.setLocation(x, y); // arrasta a bola
				//label_1.setLocation(x, y); // arrasta o label
				System.out.println("x=" + x + ", y=" + y);
			}
		});
		frame.getContentPane().add(bola);

		label = new JLabel("use uma das setas para mover");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(100, 11, 310, 14);
		frame.getContentPane().add(label);

	}
}
