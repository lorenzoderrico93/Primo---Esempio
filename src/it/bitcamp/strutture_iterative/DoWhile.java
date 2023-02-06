package it.bitcamp.strutture_iterative;

public class DoWhile {

	public static void main(String[] args) {
		//Esercizio 1
		
		int i=0;
		do {
			System.out.println("Il valore di i: " + i);
			i++; //i = i + 1
		}while (i<5);
		System.out.println("Esempio 1, Done");
		
		
		//Esercizio 2
		int j=0;
		do {
			System.out.println("Il valore di j: " + j);
			j++; //i = i + 1
		}while (j<0);
		System.out.println("Esempio 2, Done");
		
		
		//Esercizio 3
		int w=0;
		while (w>0) {
			System.out.println("Il valore di j: " + j);
			j++; //i = i + 1
		}while (j<0);
		System.out.println("Esempio 2, Done");
		
		//Esercizio 4
		int z = 5;
		do {
			System.out.println("Il valore di z:" + z);
			z = z -1; //z--
			
		}while(z>0);
		
		System.out.println("Esempio 4, Done");
		
		//Sample i++ , ++i
		int i1 = 0;
		int i2 = 0;
		
		System.out.println("i1++: " + (i1++));
		System.out.println("++i2: " + (++i2));
		
		}
	}
	
		
		
