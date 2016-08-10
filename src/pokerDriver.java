import java.util.Scanner;

public class pokerDriver {
	
	public static void main(String[] args){
		Deck deck;
		System.out.println("Enter the number of players");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		deck = new Deck();
		Hand[] hand = new Hand[n];
		
		hand = distrubuteCards(deck,n);
		
		Hand handTest = new Hand();
		Card c1 = new Card(0,1);
		Card c2 = new Card(0,2);
		Card c3 = new Card(0,3);
		Card c4 = new Card(0,4);
		Card c5 = new Card(0,5);
		handTest.cards.add(c2);
		handTest.cards.add(c3);
		handTest.cards.add(c4);
		handTest.cards.add(c5);
		handTest.cards.add(c1);
		
		if(checkStraightFlush(handTest)){
			System.out.println("Straight Flush");
		}
		
		getType(hand);
	}

}
