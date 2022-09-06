
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Legg inn bruttolønn: ");
		String inntektTxt = scanner.nextLine();
		int inntekt = Integer.parseInt(inntektTxt);
			
		if (inntekt < 164100) {
			
			double a = inntekt*1;
			System.out.println(a);
			
		} else if (inntekt > 164100 && inntekt < 230950){
			
			double b = inntekt*0.0093;
			System.out.println(b +" kroner må du betale i skatt når du har "+inntekt+" i bruttolønn");
			
		} else if (inntekt > 230950 && inntekt < 580650){
			
			double c = inntekt*0.0241;
			System.out.println(c+" kroner må du betale i skatt når du har "+inntekt+" i bruttolønn");
			
		} else if (inntekt > 580650 && inntekt < 934050){ 
			
			double d = inntekt*0.1152;
			System.out.println(d+" kroner må du betale i skatt når du har "+inntekt+" i bruttolønn");
			
		} else if (inntekt > 934051){
			
			double e = inntekt*0.1452;
			System.out.println(e+" kroner må du betale i skatt når du har "+inntekt+" i bruttolønn");
		
			}
		scanner.close();
		}
}
