public class Card { 
	//card extended by comparator
	private int rank,suit,value;
	//use strings to store 123456789TJKQ
	static String[] suits = {"Clubs" , "Spades" , "Hearts", "Diamonds"};
	static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	
	public Card(int joker){
		this.suit = -1;
		this.value = joker;
	}
	
	Card(int suite, int rank){
		this.suit = suite;
		this.rank = rank;
	}
	
	
	public int getrank(){
		return this.rank;
	}
	
	public int getsuite(){
		return this.suit;
	}
	
	public void display(){
		System.out.println(suits[this.suit] + " " + ranks[this.rank]);
	}

}
