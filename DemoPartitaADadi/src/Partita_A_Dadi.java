
public class Partita_A_Dadi {
	
	int numeroDiTurni;
	
	Giocatore giocatore1;
	int puntiGiocatore1 = 0;

	Giocatore giocatore2;
	int puntiGiocatore2 = 0;
	
	Dado dado;
	
	Giocatore vincitore;
	
	private Partita_A_Dadi(int numeroDiTurni_attuale, 
			Giocatore giocatore1_attuale, Giocatore giocatore2_attuale, Dado dado_attuale) {
		
		giocatore1 = giocatore1_attuale;
		giocatore2 = giocatore2_attuale;
		dado = dado_attuale;
		
		numeroDiTurni = numeroDiTurni_attuale;
		int lancioGiocatore1;
		int lancioGiocatore2;
		
		System.out.println();

		for (int i = 0; i < numeroDiTurni_attuale; i++) 
		{
			System.out.println("Turno " + (i + 1));
			
			System.out.println("	Lancia: " + giocatore1.getNickname());
			lancioGiocatore1 = dado.lancia();
			System.out.println("	" + giocatore1.getNickname() + " ha ottenuto " + lancioGiocatore1);
			
			System.out.println("	Lancia: " + giocatore2.getNickname());
			lancioGiocatore2 = dado.lancia();
			System.out.println("	" + giocatore2.getNickname() + " ha ottenuto " + lancioGiocatore2);
			
			if (lancioGiocatore1 >= lancioGiocatore2) 
			{
				puntiGiocatore1++;
			}
			
			if (lancioGiocatore1 <= lancioGiocatore2) 
			{
				puntiGiocatore2++;
			}
		}
		
		vincitore = null;
		if (puntiGiocatore1 > puntiGiocatore2) 
		{
			vincitore = giocatore1;
		}
		else if (puntiGiocatore1 < puntiGiocatore2) 
		{
			vincitore = giocatore2;
		}
		
	}
	
	public static Partita_A_Dadi iniziaPartita(Giocatore giocatore1_attuale, 
			Giocatore giocatore2_attuale, int numeroDiTurni_attuale, Dado dado_attuale) {
		
		if (giocatore1_attuale == null || giocatore2_attuale == null )
		{
			return null;
		}
		
		if (!(giocatore1_attuale.getDado().equals(dado_attuale) || 
				giocatore2_attuale.getDado().equals(dado_attuale))) 
		{
			return null;
		}
		
		Partita_A_Dadi partita = new Partita_A_Dadi(numeroDiTurni_attuale,
				giocatore1_attuale, giocatore2_attuale, dado_attuale);
		
		if (partita.puntiGiocatore1 > partita.puntiGiocatore2)
		{
			System.out.println("\nIl vincitore è: " + giocatore1_attuale.getNickname());
			partita.vincitore = giocatore1_attuale;
		}
		else if (partita.puntiGiocatore1 < partita.puntiGiocatore2) 
		{
			System.out.println("\nIl vincitore è: " + giocatore2_attuale.getNickname());
			partita.vincitore = giocatore2_attuale;
		}
		else 
		{
			System.out.println("\nLa partita è finita in pareggio");
			partita.vincitore = null;
		}
		
		return partita;
	}

	public int getNumeroDiTurni() {
		return numeroDiTurni;
	}

	public Giocatore getGiocatore1() {
		return giocatore1;
	}

	public int getPuntiGiocatore1() {
		return puntiGiocatore1;
	}

	public Giocatore getGiocatore2() {
		return giocatore2;
	}

	public int getPuntiGiocatore2() {
		return puntiGiocatore2;
	}

	public Dado getDado() {
		return dado;
	}

	public Giocatore getVincitore() {
		return vincitore;
	}

	@Override
	public String toString() {
		return "Storico partita:" + "\n" + "numeroDiTurni = " + numeroDiTurni + ", giocatore1 = " + giocatore1.getNickname() + ", puntiGiocatore1 = "
				+ puntiGiocatore1 + ", giocatore2 = " + giocatore2.getNickname() + ", puntiGiocatore2 = " + puntiGiocatore2 + ", dado = "
				+ dado;
	}
	
}
