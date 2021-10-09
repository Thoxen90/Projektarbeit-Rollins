import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;
import java.io.*;
import java.util.Scanner;

import javax.imageio.ImageIO;


public class Listener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent f) {
		Var.command = f.getActionCommand();

		if (Var.command.equals("Process")) {
			
			System.out.println(Var.deziEingabe.getText());

			Var.tempDeziEingabe = Var.deziEingabe.getText().split("\n");
			
			Var.Ausgabe.setText("Anzahl der gelesenen Zahlen: "+String.valueOf(Var.tempDeziEingabe.length)+"\n\nMayazahlen:\n");

			for (int i = 0; i < Var.tempDeziEingabe.length; i++) {
				Var.tempDeziEingabeRow = Var.tempDeziEingabe[i].split(" ");
				Var.tempZahl = 0;
				Var.tempZahl2 = 0;
				Var.tempErgebnis = 0;
				Var.tempErgebnis2 = 0;

				// System.out.println(Var.tempDeziEingabeRow.length);
				

				if (Var.tempDeziEingabeRow[0].equals("D")) {
					// System.out.println("TestDD");
					//Var.Ausgabe.setText(Var.Ausgabe.getText()+"\t");
					for (int k = 1; k < Var.tempDeziEingabeRow.length; k++) {

						while (Integer.parseInt(Var.tempDeziEingabeRow[k].trim()) - Var.tempErgebnis > 19) {
							Var.tempErgebnis2 = Integer.parseInt(Var.tempDeziEingabeRow[k].trim()) - Var.tempErgebnis;

							for (int m = 0; Math.pow(20, m) <= Var.tempErgebnis2; m++) {
								Var.tempZahl = m;
								// System.out.println("test: " + tempZahl);
							}

							if (Integer.parseInt(Var.tempDeziEingabeRow[k].trim()) - Var.tempErgebnis > 19) {
								for (int l = 0; l * Math.pow(20, Var.tempZahl) <= Var.tempErgebnis2; l++) {
									Var.tempZahl2 = l;
									// System.out.println("test2: " + tempZahl2);
								}
							} else {
								Var.tempZahl2 = 0;
							}

							Var.tempErgebnis += (int) (Var.tempZahl2 * Math.pow(20, Var.tempZahl));
							// System.out.println("tempErgebnis: " + tempErgebnis);

							if (Var.tempZahl2 != 0) {
								switch (Var.tempZahl2) {
								case 0:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " 0");
									break;
								case 1:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " *");
									break;
								case 2:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " **");
									break;
								case 3:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " ***");
									break;
								case 4:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " ****");
									break;
								case 5:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " |");
									break;
								case 6:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " |*");
									break;
								case 7:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " |**");
									break;
								case 8:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " |***");
									break;
								case 9:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " |****");
									break;
								case 10:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " ||");
									break;
								case 11:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " ||*");
									break;
								case 12:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " ||**");
									break;
								case 13:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " ||***");
									break;
								case 14:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " ||****");
									break;
								case 15:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " |||");
									break;
								case 16:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " |||*");
									break;
								case 17:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " |||**");
									break;
								case 18:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " |||***");
									break;
								case 19:
									Var.Ausgabe.setText(Var.Ausgabe.getText() + " |||****");
									break;
								}
							}
						}
						//System.out.println(Integer.parseInt(Var.tempDeziEingabeRow[k].trim())-Var.tempErgebnis);
						switch (Integer.parseInt(Var.tempDeziEingabeRow[k].trim()) - Var.tempErgebnis) {
						case 0:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " 0");
							break;
						case 1:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " *");
							break;
						case 2:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " **");
							break;
						case 3:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " ***");
							break;
						case 4:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " ****");
							break;
						case 5:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " |");
							break;
						case 6:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " |*");
							break;
						case 7:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " |**");
							break;
						case 8:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " |***");
							break;
						case 9:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " |****");
							break;
						case 10:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " ||");
							break;
						case 11:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " ||*");
							break;
						case 12:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " ||**");
							break;
						case 13:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " ||***");
							break;
						case 14:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " ||****");
							break;
						case 15:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " |||");
							break;
						case 16:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " |||*");
							break;
						case 17:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " |||**");
							break;
						case 18:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " |||***");
							break;
						case 19:
							Var.Ausgabe.setText(Var.Ausgabe.getText() + " |||****");
							break;
						}
						
						Var.Ausgabe.setText(Var.Ausgabe.getText()+"\t=\t(");
						
						
						
					}
				} else if (Var.tempDeziEingabeRow[0].equals("M")) {

					int zähler = 0;
					System.out.println("Rowlength: " + Var.tempDeziEingabeRow.length);
					for (int az = 1; az < Var.tempDeziEingabeRow.length; az++) {
						//System.out.println(Var.tempDeziEingabeRow[az]);
						switch (Var.tempDeziEingabeRow[az].trim()) {
						case "0":
							zähler += 0 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "*":
							zähler += 1 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "**":
							zähler += 2 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "***":
							zähler += 3 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "****":
							zähler += 4 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "|":
							zähler += 5 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "|*":
							zähler += 6 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "|**":
							zähler += 7 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "|***":
							zähler += 8 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "|****":
							zähler += 9 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "||":
							zähler += 10 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "||*":
							zähler += 11 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "||**":
							zähler += 12 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "||***":
							zähler += 13 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "||****":
							zähler += 14 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "|||":
							zähler += 15 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "|||*":
							zähler += 16 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "|||**":
							zähler += 17 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "|||***":
							zähler += 18 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						case "|||****":
							zähler += 19 * Math.pow(20, Var.tempDeziEingabeRow.length - az - 1);
							break;
						}
					}

					Var.Ausgabe.setText(Var.Ausgabe.getText() + zähler);
				}
				Var.Ausgabe.setText(Var.Ausgabe.getText() + "\n");

			}

			Var.jf1.requestFocus();
		}
		
		System.out.println(Var.command);
		if (Var.command.equals("Import")) {
			try {
				Var.CSV = new File(".\\rsc\\"+Var.CSVPath.getText()+".csv");
				Scanner sc = new Scanner(Var.CSV);
				sc.useDelimiter("\n");
				while(sc.hasNext()) {
					Var.Importstring = sc.next();
					Var.deziEingabe.setText(Var.deziEingabe.getText()+Var.Importstring);
					Var.deziEingabe.setText(Var.deziEingabe.getText()+"\n");
				}
				System.out.println("Datei geladen");
				sc.close();
				Var.loadCSVLabel=false;
				Var.jf1.setVisible(true);
				Var.jf1.requestFocus();
				Var.jf2.setVisible(false);
				
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("CSV File konnte nicht geladen werden");
			}
		}
	}

}
