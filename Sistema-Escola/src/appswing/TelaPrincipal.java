package appswing;

/**********************************
 * IFPB - Curso Superior de Tec. em Sist. para Internet
 * Pesist~encia de Objetos
 * Prof. Fausto Maranhão Ayres
 **********************************/


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import regras_negocio.Fachada;

public class TelaPrincipal {
	private JFrame frame;
	private JMenu mnPrateleira;
	private JMenu mnProduto;
	private JLabel label;
	private Timer timer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				try{
					//criar objetos no repositorio
					Fachada.criarAluno("joao",7.0);
					Fachada.criarAluno("maria",10.0);
					Fachada.criarAluno("jose",4.0);
					Fachada.criarAluno("ana",10.0);
					Fachada.criarProfessor("chico",1200.0);
					Fachada.criarProfessor("julio",1200.0);
					Fachada.criarProfessor("augusto",1200.0);
					Fachada.criarTurma();		//id 1
					Fachada.criarTurma();		//id 2
					Fachada.alocarProfessor("chico",1 );
					Fachada.alocarProfessor("julio",2 );
					Fachada.alocarProfessor("augusto", 2);
					Fachada.matricularAluno("joao",1 );
					Fachada.matricularAluno("maria",1 );
					Fachada.matricularAluno("jose",2 );
					Fachada.matricularAluno("ana", 2);
				}
				catch(Exception e){
					System.out.println("-->" + e.getMessage());
				}

			}
			@Override
			public void windowClosing(WindowEvent e) {
				//JOptionPane.showMessageDialog(frame, "até breve !");
				timer.stop();
			}
		});
		frame.setTitle("Sistema Escola");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		label = new JLabel("");
		label.setFont(new Font("Tahoma", Font.PLAIN, 26));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setText("Inicializando...");
		label.setBounds(0, 0, 450, 249);
		ImageIcon imagem = new ImageIcon(getClass().getResource("/arquivos/imagem.jpg"));
		imagem = new ImageIcon(imagem.getImage().getScaledInstance(label.getWidth(),label.getHeight(), Image.SCALE_DEFAULT));//		label.setIcon(fotos);
		label.setIcon(imagem);
		frame.getContentPane().add(label);
		frame.setResizable(false);

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		mnPrateleira = new JMenu("Turma");
		mnPrateleira.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaTurma tela = new TelaTurma();
			}
		});
		menuBar.add(mnPrateleira);

		mnProduto = new JMenu("Aluno");
		mnProduto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaAluno tela = new TelaAluno();
			}
		});
		menuBar.add(mnProduto);

		frame.setVisible(true);


		//----------timer----------------
		timer = new Timer(0, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String dt = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss"));
				frame.setTitle("Sistema Escola - "+ dt);
				
			}
		});
		timer.setRepeats(true);
		timer.setDelay(1000);	//1segundos
		timer.start();			//inicia o temporizador


	}
}
