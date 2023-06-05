import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Janela1 {

	private JFrame frame;
	private JButton button;
	private JButton button_1;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem;
	private JMenuItem menuItem_1;
	private JMenu menu_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela1 window = new Janela1();
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
	public Janela1() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("janela 1");
		frame.setBounds(100, 100, 333, 261);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		button = new JButton("abrir janela2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Janela2 tela = new Janela2();
			}
		});
		button.setBounds(63, 48, 179, 23);
		frame.getContentPane().add(button);

		button_1 = new JButton("abrir janela3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Janela3 tela = new Janela3();
			}
		});
		button_1.setBounds(63, 104, 177, 23);
		frame.getContentPane().add(button_1);

		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		menu = new JMenu("Exibir");
		menuBar.add(menu);

		menuItem = new JMenuItem("segunda janela");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.doClick();
			}
		});
		menu.add(menuItem);

		menuItem_1 = new JMenuItem("terceira janela");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button_1.doClick();
			}
		});
		menu.add(menuItem_1);

		menu_1 = new JMenu("Sair");
		menu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		menuBar.add(menu_1);
	}
}
