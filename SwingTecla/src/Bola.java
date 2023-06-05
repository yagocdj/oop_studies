/*****************************
 * IFPB - Prof. Fausto Ayres
 *****************************/

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
class Bola extends JPanel {   
	private int raio;
	private Color cor;
	 	
	public Bola(int raio, Color cor) {
		this.raio = raio;
		this.cor = cor;
	}

	// sobresecrever o metodo paint
	public void paintComponent (Graphics grafico){
		grafico.setColor(cor);
		grafico.fillOval(0,0,raio,raio);
	}   
}