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

		Var.jf1 = new JFrame();
		
		Var.jf1.getContentPane().setLayout(new FlowLayout());
		
		
		Var.jf1.setSize(Var.screenwidth,Var.screenheight);
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.setLayout(null);
		Var.jf1.setTitle("ProjektArbeit Rollins");
		
		Var.jf1.setBackground(new Color(0,20,30));		
		Var.jf1.setResizable(false);
		Var.jf1.addKeyListener(new Keyhandler());
		Var.jf1.requestFocus();
		Var.jf1.addKeyListener((KeyListener) new Keyhandler());
		Var.jf1.requestFocus();
		Var.jf1.setVisible(true);
		
		Var.lbl1 = new Label ();
		Var.lbl1.setBounds(0,0,Var.screenwidth,Var.screenheight);
		Var.lbl1.setVisible(true);
		Var.jf1.add(Var.lbl1);			
		
		Var.deziEingabe = new JTextArea();
		Var.deziEingabe.setBounds(10,50,400,100);
		Var.deziEingabe.setLineWrap(true);
		Var.deziEingabe.setAutoscrolls(true);
		Var.scroll = new JScrollPane(Var.deziEingabe);
		Var.scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		Var.jf1.add(Var.deziEingabe);
		

		Var.Ausgabe = new JTextArea();
		Var.Ausgabe.setBounds(10,450,600,300);
		Var.jf1.add(Var.Ausgabe);
		
		
		Var.jf1.requestFocus();
		
		Var.btnProcess = new JButton("Process");
		Var.btnProcess.setBounds(650,340,100,30);
		Var.btnProcess.addActionListener(new Listener());
		Var.jf1.add(Var.btnProcess);
		
	}
	
	
}
