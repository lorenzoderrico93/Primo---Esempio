package it.bitcamp.ifcondizione;

public class IfCondizione {

	public static void main(String[] args) {
		
		//Esercizio 1
		int x = 2;
		int y = 3;
		
		if (x<y) {
			System.out.println("Esercizio 1, Condizione verificata - x: "+ x + "è minore di y: ");
		}

		//Esercizio 2
		if (x<2) {
			System.out.println("Esercizio 2, Condizione verificata - x: "+ x + "è minore di y: ");
		}else {
			System.out.println("Esercizio 2, Condizione NON verificata - x: "+ x + "è minore di y: ");
		}
		
		//Esercizio 3
		if (x>y) {
		System.out.println("Esercizio 3 - X>Y");
		}else if (x==y) {
			System.out.println("Esercizio 3 - X è uguale a Y");
		}else if (x<y) {
			System.out.println("Esercizio 3 - X è minore di Y");
		}
		
		//Esercizio 4 
		if (x>y) {
			System.out.println("Esercizio 4 - X>Y");
		}else if (x==y) {
			System.out.println("Esercizio 4 - X è uguale a Y");
		}
		
		//Esercizio 5
		int z = 5;
		int w = 9;
		
		if  ((x < y) && (z > w)) {
			System.out.println("Esercizio 5, Le due condizioni si sono verificate");
		}else {
			System.out.println("Esercizio 5, Le due condizioni NON sono verificate");
		}
	
	
		//Esercizio 6
		if( (x < y) || ( z > w)) {
			System.out.println("Esercizio 6, Condizione Verificata");
		}else {
			System.out.println("Condizione NON Verificata");
		}
	
		//Esercizio 7
		if( (1==1) && (2<1) && (3>2) && (5<9) ) {
			System.out.println("Esercizio 7, Condizione Verificata");
		}
	
		//Esercizio 8
		if( ( (1==1) && (2<1) && (3>2) && (5<9) ) || 10>7 ) {
			System.out.println("Esercizio 8, Condizione Verificata");
		}
		//Esercizio 9
		if( ( (1==1) || (2==3) ) && ( (2>4) && (4>5) || (3>1)) && (4>2) ) {
		System.out.println("Esercizio 9, Condizione Verificata");	
		}
	}
}


	
	
	
	
	
	
