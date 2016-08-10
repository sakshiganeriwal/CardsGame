import java.util.Scanner;

public class RummyDriver {
	static Deck d;
	
	public static void main(String[] args){

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of players");
		int playernum = s.nextInt();
		
		System.out.println("Enter the number of packs");
		int pnum = s.nextInt();
		
		System.out.println("Enter type of packs:\n1.with joker\n2.without joker:");
		int ptype = s.nextInt();
		
		int jnum = 0;
		
		switch(ptype){
		case 1: 
			System.out.println("Enter the number of jokers");
			jnum = s.nextInt();
			break;
		case 2:
			jnum = 0;
			break;
		}
		
		d = new Deck(pnum, jnum);
		d.display();
		
		
//		Hands[] hand = new Hands[n];
//		
//		hand = distrubuteCards(deck,n);
//		
//		for(int i = 0; i < n; i++){
//			hand[i].sortSuite();
//		}
//		checkHands(hand[0]);
		
	}

}
