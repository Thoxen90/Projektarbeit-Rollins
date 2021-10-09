
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


public class Var {

	static JFrame jf1,jf2;
	static int screenwidth = 1000, screenheight = 800;
	static int backgroundY1 = 0;
	static int x = 400, y = 400;
	static String[] tempDeziEingabe,tempDeziEingabeRow;
	static String[] tempMayaEingabe,tempMayaEingabeRow;
	static int tempZahl;
	static int tempZahl2;
	static int counter = 0;
	static int tempErgebnis;
	static int tempErgebnis2;
	static Label lbl1,lbl2;
	static boolean loadCSVLabel = true;
	static BufferedImage ib1;
	static File CSV;
	static String command;
	static String Importstring;
	static JButton btnProcess,btnExit,btnImport;
	static JTextArea deziEingabe,mayaEingabe,Ausgabe;
	static JTextField CSVPath;
	static JScrollPane scroll,scroll2;
	static String[] speicher = new String[10];
	
	public Var() {
		
		try {
			ib1 = ImageIO.read(new File("rsc/b1.png"));
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Bilder konnten nicht geladen werden");
		}
		
	}
}
