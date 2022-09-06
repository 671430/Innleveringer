
import javax.swing.JOptionPane;

public class Heltall {

	public static void main(String[] args) {
		
		String heltall = JOptionPane.showInputDialog("Skriv inn heltall: ");
		
				int n = Integer.parseInt(heltall);
				double m = n;
				
	if (n < 0) {
		
		JOptionPane.showMessageDialog(null, "Heltall ugyldig. Skriv inn tall større enn 0");
	
	}else {
	
		for (int i = n; i > 1; i--) {
		
			m = m*(i-1);
		
				
			}
		
		JOptionPane.showMessageDialog(null, n+ " faktultet er lik " + m);
		
	}

	}
}