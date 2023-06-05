import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Teste {

	private JFrame frame;

	private JScrollPane scrollPane;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	
	private JList<String> list;
	private DefaultListModel<String> model ;

	private JComboBox<String> comboBox;
	private DefaultComboBoxModel<String> modelcombo ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste window = new Teste();
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
	public Teste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Teste JList e JComboBox");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(52, 32, 189, 90);
		frame.getContentPane().add(scrollPane);

		
		list = new JList<String>();
		model = new DefaultListModel<>();
		list.setModel(model);

		scrollPane.setViewportView(list);

		button = new JButton("adicionar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String palavra = JOptionPane.showInputDialog("digite uma palavra");
				if(model.contains(palavra))
					JOptionPane.showMessageDialog(null, "palavra ja existe:"+palavra);
				else {
					model.addElement(palavra);
					modelcombo.addElement(palavra);
				}
			}
		});
		button.setBounds(273, 30, 89, 23);
		frame.getContentPane().add(button);

		button_1 = new JButton("remover");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = list.getSelectedIndex();
				if(index<0) {
					JOptionPane.showMessageDialog(null, "nao tem elemento selecionado");
					return;
				}

				model.remove(index);
				modelcombo.removeElementAt(index);
			}
		});
		button_1.setBounds(273, 65, 89, 23);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("limpar");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.clear();
				modelcombo.removeAllElements();
				
			}
		});
		button_2.setBounds(273, 99, 89, 23);
		frame.getContentPane().add(button_2);
		
		String[]  itens = {"a", "b"};
		comboBox = new JComboBox<>();
		modelcombo = new DefaultComboBoxModel<>(itens);
		comboBox.setModel(modelcombo);
		
		comboBox.setBounds(52, 148, 189, 28);
		frame.getContentPane().add(comboBox);
	}
}
