
public class packWithoutJoker extends pack{
	
	packWithoutJoker(){
		for(int i = 0; i < 4; i++){
			for(int j = 0;j < 13; j++){
				Card c = new Card(i, j);
				p.add(c);
			}
		}
	}

}
