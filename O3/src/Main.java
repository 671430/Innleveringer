import javax.swing.JOptionPane;
import static java.lang.Integer.*;

public class Main {

	public static void main(String[] args) {
		
		String heltall = JOptionPane.showInputDialog("Skriv inn heltall: ");
		int tall = Integer.parseInt(heltall);
		int fakultet = tall;
		
		for (int i = tall; i > 1; i--) {
			
			fakultet = fakultet*(i-1);
		
		}

		JOptionPane.showMessageDialog(null, fakultet);
		
	}


}