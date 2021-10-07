import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;

public class Listener implements ActionListener {
	static int tempZahl;
	static int counter = 0;

	@Override
	public void actionPerformed(ActionEvent f) {

		Var.tempDeziEingabe = Var.deziEingabe.getText().split("\n");

		for (int i = 0; i < Var.tempDeziEingabe.length; i++) {
			Var.tempDeziEingabeRow = Var.tempDeziEingabe[i].split(" ");

			System.out.println(Var.tempDeziEingabeRow.length);
			System.out.println(Var.tempDeziEingabe.length);

			if (Var.tempDeziEingabeRow[0] == "D") {

				for (int k = 1; k < Var.tempDeziEingabeRow.length; k++) {
					if (Integer.parseInt(Var.tempDeziEingabeRow[k]) >= 20) {

						Var.Ausgabe.setText(Var.Ausgabe.getText() + "");
						Math.pow(20, Var.tempDeziEingabeRow.length - 2);

					}
				}

				for (int x = 0; x < Var.tempDeziEingabeRow.length; x++) {

					switch (Var.tempDeziEingabeRow[x]) {
					case "0":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " 0");
						break;
					case "1":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " *");
						break;
					case "2":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " **");
						break;
					case "3":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " ***");
						break;
					case "4":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " ****");
						break;
					case "5":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " |");
						break;
					case "6":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " |*");
						break;
					case "7":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " |**");
						break;
					case "8":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " |***");
						break;
					case "9":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " |****");
						break;
					case "10":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " ||");
						break;
					case "11":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " ||*");
						break;
					case "12":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " ||**");
						break;
					case "13":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " ||***");
						break;
					case "14":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " ||****");
						break;
					case "15":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " |||");
						break;
					case "16":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " |||*");
						break;
					case "17":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " |||**");
						break;
					case "18":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " |||***");
						break;
					case "19":
						Var.Ausgabe.setText(Var.Ausgabe.getText() + " |||****");
						break;
					}
				}
			} else if (Var.tempDeziEingabeRow[0].equals("M")) {
			
			int zähler=0;
			System.out.println("Rowlength: "+Var.tempDeziEingabeRow.length);
				for (int az = 1; az < Var.tempDeziEingabeRow.length; az++) {
					switch (Var.tempDeziEingabeRow[az]) {
					case "0":
						zähler += 0*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "*":
						zähler += 1*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "**":
						zähler += 2*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "***":
						zähler += 3*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "****":
						zähler += 4*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "|":
						zähler += 5*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "|*":
						zähler += 6*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "|**":
						zähler += 7*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "|***":
						zähler += 8*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "|****":
						zähler += 9*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "||":
						zähler += 10*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "||*":
						zähler += 11*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "||**":
						zähler += 12*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "||***":
						zähler += 13*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "||****":
						zähler += 14*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "|||":
						zähler += 15*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "|||*":
						zähler += 16*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "|||**":
						zähler += 17*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "|||***":
						zähler += 18*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					case "|||****":
						zähler += 19*Math.pow(20,Var.tempDeziEingabeRow.length-az);
						break;
					}
				}
				Var.Ausgabe.setText(Var.Ausgabe.getText()+zähler);
			}
			Var.Ausgabe.setText(Var.Ausgabe.getText() + "\n");

			
			
			
		}

		Var.jf1.requestFocus();
	}

}
