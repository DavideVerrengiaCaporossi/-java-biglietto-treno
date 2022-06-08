package jana60;
//DECIMAL FORMAT
import java.text.DecimalFormat;
//LIBRERIA SCANNER
import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		
		//VARIABILI
		float kilometriDaPercorrere;
		int EtaPasseggero;
		
		//APERTURA SCAN (SE NN SI APRE E CHIUDE NON FUNZIONA)
		Scanner scan = new Scanner(System.in);
		
		//CREAZIONE DECIMAL FORMAT
		DecimalFormat df= new DecimalFormat ("#0.0020");
		
		//COMANDI UTENTE
	    System.out.println("Quanti Kilometri vuoI percorrere?");
		kilometriDaPercorrere = scan.nextFloat();
		
		System.out.println("Quanti anni ha il passeggero ?");
		EtaPasseggero = scan.nextInt();
		
		
		float PrezzoBiglietto = (kilometriDaPercorrere * 0.21f);
		float ScontoMinorenni = (PrezzoBiglietto * 20 / 100);
		float ScontoPiu65 = (PrezzoBiglietto * 40 / 100);
		float PrezzoFinale;	
		
		if(EtaPasseggero < 18) {
			
		PrezzoFinale = ( PrezzoBiglietto - ScontoMinorenni);
		
			
		}
		else if(EtaPasseggero > 65) {
			
			PrezzoFinale = (PrezzoBiglietto - ScontoPiu65);
			
			
		}
		else {
			PrezzoFinale = PrezzoBiglietto ;
			
		}
		
		System.out.println("Il prezzo finale del biglietto con lo sconto applicato è " + df.format (PrezzoFinale));
		
	
		
		
		  scan.close();
		//CHIUSURA SCAN
		
		
	}

}
