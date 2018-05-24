package control4;

import java.util.ArrayList;

public class makeDck {
	private static ArrayList<Card> cards = new ArrayList<Card>();
	private static Card card;
	
	public static void makeDeck() {
		
		for (int suit = 0; suit <= 3; suit++) {
		   for (int rank = 1; rank <= 13; rank++) {
		     card = new Card(rank,suit);
		      cards.add(card);
		}
	}
	
}
}
