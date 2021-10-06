
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.util.Random;

public class Var {

	static JFrame jf1;
	static int screenwidth = 800, screenheight = 600;
	static int backgroundY1 = 0;
	static int backgroundY2 = -600;
	static int x = 400, y = 400;
	
	static Label lbl1;

	static BufferedImage ib1;
	
	static JButton btnProcess,btnExit;
	
	
	
	
	
	public Var() {
		
		try {
			ib1 = ImageIO.read(new File("rsc/b1.png"));
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden");
		}
		
	}
}
