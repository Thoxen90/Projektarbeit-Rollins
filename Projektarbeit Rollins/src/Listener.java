import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





public class Listener implements ActionListener{
	static int tempZahl;
	
	@Override
	public void actionPerformed(ActionEvent f) {
		
		
		Var.tempDeziEingabe = Var.deziEingabe.getText().split("\n");
		Var.tempMayaEingabe = Var.mayaEingabe.getText().split("\n");
		
		
		
		
		
		
		
		for(int i = 0; i<Var.tempDeziEingabe.length;i++) {
			Var.tempDeziEingabeRow = Var.tempDeziEingabe[i].split(" ");
			
			System.out.println(Var.tempDeziEingabeRow.length);
			System.out.println(Var.tempDeziEingabe.length);
			
			for(int x = 0; x<Var.tempDeziEingabeRow.length;x++) {
				
				for(20<Integer.parseInt(Var.tempDeziEingabeRow[x])) {
					Var.Ausgabe.setText(Var.Ausgabe.getText()+"* ");
					Var.tempDeziEingabe[x] =String.valueOf(Integer.parseInt(Var.tempDeziEingabeRow[x])-20);
					
				}
				
				switch(Var.tempDeziEingabeRow[x]) {
				case "0": Var.Ausgabe.setText(Var.Ausgabe.getText()+" 0");
				break;
				case "1": Var.Ausgabe.setText(Var.Ausgabe.getText()+" *");
				break;
				case "2": Var.Ausgabe.setText(Var.Ausgabe.getText()+" **");
				break;
				case "3": Var.Ausgabe.setText(Var.Ausgabe.getText()+" ***");
				break;
				case "4": Var.Ausgabe.setText(Var.Ausgabe.getText()+" ****");
				break;
				case "5": Var.Ausgabe.setText(Var.Ausgabe.getText()+" |");
				break;
				case "6": Var.Ausgabe.setText(Var.Ausgabe.getText()+" |*");
				break;
				case "7": Var.Ausgabe.setText(Var.Ausgabe.getText()+" |**");
				break;
				case "8": Var.Ausgabe.setText(Var.Ausgabe.getText()+" |***");
				break;
				case "9": Var.Ausgabe.setText(Var.Ausgabe.getText()+" |****");
				break;
				case "10": Var.Ausgabe.setText(Var.Ausgabe.getText()+" ||");
				break;
				case "11": Var.Ausgabe.setText(Var.Ausgabe.getText()+" ||*");
				break;
				case "12": Var.Ausgabe.setText(Var.Ausgabe.getText()+" ||**");
				break;
				case "13": Var.Ausgabe.setText(Var.Ausgabe.getText()+" ||***");
				break;
				case "14": Var.Ausgabe.setText(Var.Ausgabe.getText()+" ||****");
				break;
				case "15": Var.Ausgabe.setText(Var.Ausgabe.getText()+" |||");
				break;
				case "16": Var.Ausgabe.setText(Var.Ausgabe.getText()+" |||*");
				break;
				case "17": Var.Ausgabe.setText(Var.Ausgabe.getText()+" |||**");
				break;
				case "18": Var.Ausgabe.setText(Var.Ausgabe.getText()+" |||***");
				break;
				case "19": Var.Ausgabe.setText(Var.Ausgabe.getText()+" |||****");
				break;
				}
			}
			Var.Ausgabe.setText(Var.Ausgabe.getText()+"\n");
			
			
		}
		
		
		
		
		
		Var.jf1.requestFocus();
	}

}
