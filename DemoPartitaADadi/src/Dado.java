
import java.util.Random;

public class Dado 
{
	
	/* Attributi */ 

	private Random generator = new Random();
	
	private int minimoValore = 1;
	private int massimoValore = 6;
	
	/* Costruttore */
	
	public Dado(int minimoValore_attuale, int massimoValore_attuale) {
		
		if (!(minimoValore_attuale < 0 || massimoValore_attuale < minimoValore_attuale)) 
		{	
			minimoValore = minimoValore_attuale;
			massimoValore = massimoValore_attuale;
			
			System.out.print("Ho appena creato un dado con minimo valore " + minimoValore);
			System.out.println(" e massimo valore " + massimoValore);
		}

	}
	
	/* Metodi */
	
	public void stampa() {
		System.out.println("Il dado ha minimo valore " + minimoValore 
				+ " e massimo valore " + massimoValore);
	}
	
	@Override
	public String toString() {
		return "(" + minimoValore 
				+ ", " + massimoValore + ")";
	}
	
	public int lancia() {
		return (int) (generator.nextInt(minimoValore, massimoValore + 1));
	}

}
