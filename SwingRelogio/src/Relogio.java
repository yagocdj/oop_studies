/*
 * IFPB - TSI - POO
 * Prof. Fausto Ayres
 * 
 */

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Relogio {
	private JFrame frame;
	private JLabel label;
	private Timer temporizador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Relogio window = new Relogio();
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
	public Relogio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Relogio");
		frame.setBounds(100, 100, 376, 204);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		label = new JLabel("New label");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(61, 56, 233, 31);
		frame.getContentPane().add(label);

		//configuração do temporizador
		temporizador = new Timer(0, new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				LocalDateTime datahoraComputador = LocalDateTime.now();
				DateTimeFormatter formatador = 
									DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
				String texto = datahoraComputador.format(formatador);
				label.setText(texto);
			}
		});
		temporizador.setRepeats(true);
		temporizador.setDelay(1000);	//1segundos
		temporizador.start();			//inicia o temporizador



		

	}
}
