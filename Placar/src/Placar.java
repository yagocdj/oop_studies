import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Placar {

	private JFrame frmPlacar;
	private final int MAXCOUNT;

	/**
	 * Launch the application.
	 */
	
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Placar window = new Placar();
					window.frmPlacar.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the application.
	 */
	public Placar() {
		this.MAXCOUNT = 5;
		initialize();
		frmPlacar.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPlacar = new JFrame();
		frmPlacar.setResizable(false);
		frmPlacar.setTitle("Placar");
		frmPlacar.setBounds(100, 100, 400, 300);
		frmPlacar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPlacar.getContentPane().setLayout(null);
		
		JLabel brazilFlagLabel = new JLabel("New label");
		brazilFlagLabel.setBounds(40, 66, 60, 30);
		brazilFlagLabel.setOpaque(true);
		
		ImageIcon brazilFlag = new ImageIcon(Placar.class.getResource("/imagens/brazil.png"));
		
		brazilFlag.setImage(brazilFlag.getImage().getScaledInstance(
			brazilFlagLabel.getWidth(),
			brazilFlagLabel.getHeight(),
			Image.SCALE_DEFAULT
		));
		
		brazilFlagLabel.setIcon(brazilFlag);
		
		frmPlacar.getContentPane().add(brazilFlagLabel);
		
		JLabel argentinaFlagLabel = new JLabel("New label");
		argentinaFlagLabel.setBounds(40, 122, 60, 30);
		argentinaFlagLabel.setOpaque(true);
		
		ImageIcon argentinaFlag = new ImageIcon(Placar.class.getResource("/imagens/argentina.png"));
		
		argentinaFlag.setImage(argentinaFlag.getImage().getScaledInstance(
			argentinaFlagLabel.getWidth(),
			argentinaFlagLabel.getHeight(),
			Image.SCALE_DEFAULT
		));
		
		argentinaFlagLabel.setIcon(argentinaFlag);
		
		frmPlacar.getContentPane().add(argentinaFlagLabel);
		
		JButton restartButton = new JButton("Restart");
		restartButton.setBounds(155, 210, 85, 21);
		frmPlacar.getContentPane().add(restartButton);
		
		JButton argentinaGoalButton = new JButton("Goal");
		argentinaGoalButton.setBounds(234, 127, 85, 21);
		frmPlacar.getContentPane().add(argentinaGoalButton);
		
		JButton brazilGoalButton = new JButton("Goal");
		brazilGoalButton.setBounds(234, 71, 85, 21);
		frmPlacar.getContentPane().add(brazilGoalButton);
		
		JLabel brazilGoalsLabel = new JLabel("0");
		brazilGoalsLabel.setBounds(341, 75, 35, 13);
		frmPlacar.getContentPane().add(brazilGoalsLabel);
		
		JLabel argentinaGoalsLabel = new JLabel("0");
		argentinaGoalsLabel.setBounds(341, 131, 35, 13);
		frmPlacar.getContentPane().add(argentinaGoalsLabel);
		
		JLabel brazilLabel = new JLabel("Brazil");
		brazilLabel.setBounds(121, 75, 45, 13);
		frmPlacar.getContentPane().add(brazilLabel);
		
		JLabel argentinaLabel = new JLabel("Argentina");
		argentinaLabel.setBounds(121, 131, 45, 13);
		frmPlacar.getContentPane().add(argentinaLabel);
		
		brazilGoalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentValue = Integer.parseInt(brazilGoalsLabel.getText());
				brazilGoalsLabel.setText(Integer.toString(++currentValue));
				
				if (currentValue >= MAXCOUNT) {
					brazilGoalButton.setEnabled(false);
					argentinaGoalButton.setEnabled(false);
					JOptionPane.showMessageDialog(frmPlacar, "Brazil won the match!");
				}
			}
		});
		
		argentinaGoalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int currentValue = Integer.parseInt(argentinaGoalsLabel.getText());
				argentinaGoalsLabel.setText(Integer.toString(++currentValue));
				
				if (currentValue >= MAXCOUNT) {
					brazilGoalButton.setEnabled(false);
					argentinaGoalButton.setEnabled(false);
					JOptionPane.showMessageDialog(frmPlacar, "Argentina won the match!");
				}
			}
		});
		
		restartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				brazilGoalsLabel.setText("0");
				argentinaGoalsLabel.setText("0");
				brazilGoalButton.setEnabled(true);
				argentinaGoalButton.setEnabled(true);
				
			}
		});
	}
}
