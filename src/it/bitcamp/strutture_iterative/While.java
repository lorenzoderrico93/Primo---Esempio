package it.bitcamp.strutture_iterative;

public class While {

	public static void main(String[] args) {
		//Esercizio 1
		int i = 0; //Variabile contatore
		while (i<5) {
			System.out.println("Il contatore i vale: " + i);
			i++; // i = i + 1;
		}
		System.out.println("Sono uscito dal ciclo While dell'esercizio 1");
		
		//Esercizio 2
		int j=0; //Variabile contatore
		while (j<5) {
			System.out.println("Il contatore j vale: " + j);
			j=6;
		}
		System.out.println("Sono uscito dal ciclo While dell'Esercizio 2");
		
		
		//Esercizio 3
		int w=0;  //Variabile contatore
		while (w>5) {
			System.out.println("Il contatore w vale" + w);
			if (w>2) {
				w=5;
				
			}
			w++;
			System.out.println("Sono uscito dal ciclo While dell'esercizio 3");
		}

		
		
		//Esercizio 4
		int z=5; //Variabile contatore
		while (z>=0) {
			System.out.println("Il contatore z vale: " + z);
			z--; // z = z - 1
		}
		System.out.println("Sono uscito dal ciclo While dell'esercizio 4");
		
		
		//Esercizio 5
		int index = 0;
		while (++ index < 3) {
			System.out.println("Esercizio 6, valore di index; " + index);
		}
	}
}
