import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Sorteio {

	private JFrame frmSorteio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sorteio window = new Sorteio();
					window.frmSorteio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sorteio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSorteio = new JFrame();
		frmSorteio.setTitle("Sorteio");
		frmSorteio.setBounds(100, 100, 230, 215);
		frmSorteio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSorteio.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 85, 148, 75);
		frmSorteio.getContentPane().add(scrollPane);
		
		
		JTextArea logArea = new JTextArea();
		scrollPane.setViewportView(logArea);
		
		JLabel drawResultLabel = new JLabel("");
		drawResultLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		drawResultLabel.setBounds(144, 38, 35, 21);
		frmSorteio.getContentPane().add(drawResultLabel);

		JButton drawButton = new JButton("Sortear");
		drawButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Random draw = new Random();
				String drawnNumber = Integer.toString(draw.nextInt(100));
				drawResultLabel.setText(drawnNumber);
				logArea.append(drawnNumber + "\n");
			}
		});
		drawButton.setBounds(33, 38, 85, 21);
		frmSorteio.getContentPane().add(drawButton);
	}
}
