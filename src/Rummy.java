import java.util.Scanner;

public class Rummy {
	
	public static Hands[] distrubuteCards(Deck deck,int n){
		deck.shuffle();
		Hands[] hand = new Hands[n];
		
		for(int i =0;i< n ;i++){
			hand[i] = new Hands();
		}
		for(int i = 0 ; i < 13 ; i++){
			for(int j = 0 ; j < n ; j++){
				hand[j].cards.add(deck.drawCard());
			}
		}
		return hand;
	}
	
	public boolean checkHands(Hands hand){
		boolean result = false;
		
		return result;
	}
	
	public static boolean checkGroup(Hand hand, int n){
		hand.sortRank();
		int count = 0;
		for(int j = 0; j < hand.cards.size()-1 ; j++){
			int r = hand.cards.get(j).getrank();
			int nextr = hand.cards.get(j+1).getrank();
			if(r==-1||r == nextr){
				count++;
			}
		}
		if(count == n)
			return true;
		return false;			
	}
	
	public int checkSeq(Hands hand){
		Hands h = new Hands();
		
		int numSeq = 0;
		for(int i = 0; i < 4; i++){
			int seqCount = 0;
			for(int j = 0; j < hand.cards.size()-1 ; j++){
				int s = hand.cards.get(j).getsuite();
				int r = hand.cards.get(j).getrank();
				int nextr = hand.cards.get(j+1).getrank();
				if(s == i){
					if(nextr == r + 1)
						seqCount++;
					else
						seqCount = 0;
				}
			}
			if(seqCount >= 3) 
				numSeq++;
		}
		return numSeq;
	}
}
