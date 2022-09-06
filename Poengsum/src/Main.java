
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
		
			
		String poengsum = JOptionPane.showInputDialog("Skriv inn poengsum: ");
		int karakter = Integer.parseInt(poengsum);
		String melding = ("Poengsummen til elev " + i +" tilsvarer:");
		
		if (karakter <= 39 && karakter >= 0) {
			JOptionPane.showInternalMessageDialog(null, melding + " Karakter F");
			
		} else if (karakter >= 40 && karakter <= 49) {
			JOptionPane.showInternalMessageDialog(null, melding + " Karakter E");
			
		} else if (karakter >= 50 && karakter <= 59) {
			JOptionPane.showInternalMessageDialog(null, melding + " Karakter D");
			
		} else if (karakter >= 60 && karakter <= 79) {
			
			JOptionPane.showInternalMessageDialog(null, melding + " Karakter C");
			
		} else if (karakter >= 80 && karakter <= 89) {
			JOptionPane.showInternalMessageDialog(null, melding + " Karakter B");
			
		} else if (karakter >= 90 && karakter <= 100) {
			JOptionPane.showInternalMessageDialog(null, melding + " Karakter A");
			
		} else {
				JOptionPane.showInternalMessageDialog(null, "Ugyldig Poengsum");
		
			
				}
			}
		}	
	}

