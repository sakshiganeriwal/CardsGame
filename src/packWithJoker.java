
public class packWithJoker extends pack {
	
	packWithJoker(int n ){
		for(int i = 0; i < 4; i++){
			for(int j = 0;j < 13; j++){
				Card c = new Card(i, j);
				p.add(c);
			}
		}
		Card joker = new Card(13);
		for(int i = 0; i < n; i++){
			p.add(joker);
		}
	}

}
