package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {
	public static void main(String[] args) {
		
		//VARIABILI
		float kilometriDaPercorrere = 0;
		int EtaPasseggero;
		float ScontoMinorenni;
		float ScontoPiu65;
		float PrezzoBiglietto = (kilometriDaPercorrere * 0.21f);
		
		//COMANDI UTENTE
		Scanner scan = new Scanner(System.in);
	    System.out.println("Quanti Kilometri vuou percorrere?");
		kilometriDaPercorrere = scan.nextFloat();
		
		System.out.println("Quanti hanni ha il passeggero ?");
		EtaPasseggero = scan.nextInt();
		
		
		
		
		
		
		
		
		
		  scan.close();
		
		
		
	}

}
