import javax.swing.JOptionPane;
import static java.lang.Integer.*;
import java.lang.Integer.*;

public class Main {

	public static void main(String[] args) {
		
		String heltall = JOptionPane.showInputDialog("Skriv inn heltall: ");
		int tall = Integer.parseInt(heltall);
		int fakultet = tall;

		if (tall < 0) {
			
			JOptionPane.showMessageDialog(null, "Heltall ugyldig. Skriv inn tall større enn 0");
		
		} else {
			
			for (int i = tall; i > 1; i--) {
			
			fakultet = fakultet*(i-1);
		
		}

		JOptionPane.showMessageDialog(null, "Fakutet til "+tall+" er: "+fakultet+".");
		
	}

	}
}