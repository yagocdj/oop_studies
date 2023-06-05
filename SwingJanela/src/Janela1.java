import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
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
	private JMenu menu_1;
	private JMenuItem menuItem;
	private JMenuItem menuItem_1;

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
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Janela 1");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		button = new JButton("Abrir janela 1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Janela2 tela = new Janela2();
			}
		});
		button.setBounds(80, 56, 270, 40);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("Abrir janela 2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Janela3 tela = new Janela3();
			}
		});
		button_1.setBounds(80, 124, 270, 40);
		frame.getContentPane().add(button_1);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		menu = new JMenu("Exibir");
		menuBar.add(menu);
		
		menuItem = new JMenuItem("Segunda janela");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.doClick();  // mesmo efeito do click do mouse no botão
			}
		});
		menu.add(menuItem);
		
		menuItem_1 = new JMenuItem("Terceira janela");
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
