import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;


public class Gui {

	public Gui() {

		Var.jf2 = new JFrame();
		
		Var.jf2.setSize(350,150);
		Var.jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf2.setLocationRelativeTo(null);
		Var.jf2.setLayout(null);
		Var.jf2.setTitle("CSV Reader ProjektArbeit Rollins");
		
		Var.jf2.setBackground(new Color(0,20,30));
		Var.jf2.setResizable(false);
		Var.jf2.addKeyListener(new Keyhandler());
		Var.jf2.setVisible(true);
		
		Var.lbl2 = new Label();
		Var.lbl2.setBounds(0,0,200,50);
		Var.lbl2.setVisible(true);
		
		Var.jf2.add(Var.lbl2);
		
		Var.CSVPath = new JTextField();
		Var.CSVPath.setBounds(100,20,200,20);
		Var.jf2.add(Var.CSVPath);
		Var.jf2.requestFocus();
		Var.btnImport = new JButton("Import");
		Var.btnImport.setBounds(140,60,80,20);
		Var.btnImport.addActionListener(new Listener());
		Var.jf2.add(Var.btnImport);
		
		
		
		
		Var.jf1 = new JFrame();
		
		Var.jf1.getContentPane().setLayout(new FlowLayout());
	
		Var.jf1.setSize(Var.screenwidth,Var.screenheight);
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.setLayout(null);
		Var.jf1.setTitle("ProjektArbeit Rollins");
		
		Var.jf1.setBackground(new Color(0,20,30));		
		Var.jf1.setResizable(true);
		Var.jf1.addKeyListener(new Keyhandler());
		Var.jf1.requestFocus();
		Var.jf1.addKeyListener((KeyListener) new Keyhandler());
		Var.jf1.requestFocus();
		Var.jf1.setVisible(false);
		
		Var.lbl1 = new Label();
		Var.lbl1.setBounds(0,0,Var.screenwidth,Var.screenheight);
		Var.lbl1.setVisible(true);
		Var.jf1.add(Var.lbl1);			
		
		Var.deziEingabe = new JTextArea();
		Var.deziEingabe.setBounds(10,50,150,350);
		Var.deziEingabe.setLineWrap(true);
		Var.deziEingabe.setAutoscrolls(true);
		Var.scroll = new JScrollPane(Var.deziEingabe);
		Var.scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		Var.scroll.setBounds(10,50,150,360);
		Var.jf1.add(Var.scroll);
		
		

		Var.Ausgabe = new JTextArea();
		Var.Ausgabe.setBounds(200,50,750,600);
		Var.scroll2 = new JScrollPane(Var.Ausgabe);
		Var.scroll2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		Var.scroll2.setBounds(200,50,750,600);
		Var.jf1.add(Var.scroll2);
		
		
		
		Var.btnProcess = new JButton("Process");
		Var.btnProcess.setBounds(50,600,100,30);
		Var.btnProcess.addActionListener(new Listener());
		Var.jf1.add(Var.btnProcess);
		
	}
	
	
}
