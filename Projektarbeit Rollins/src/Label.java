import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;



public class Label extends JLabel{

	private static final long serialVersionUID=1L;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		
		g.drawImage(Var.ib1,0,Var.backgroundY1,800,600,null);
		
		g.setColor(new Color(0,0,0));
		g.setFont(new Font("Arial",Font.BOLD,15));
		
		g.drawString("MayaZahl Eingabe", 10, 30);
		g.drawString("DeziZahl Eingabe",420,30);
		g.drawString("Ausgabe", 10, 180);
		
		
		
		
		repaint();
		
		
	}
	
	
	
}
