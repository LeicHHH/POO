
	package control4;
	import static org.junit.Assert.*;
	import org.junit.Test;

	 
	public class DeckJUnit {
		private Deck deck = new Deck();
		private Card card1 = new Card(1,1);
	   @Test
	   public void testgetCardEqualsPass() {
		   
	      // assertEquals(String message, long expected, long actual)
	      assertEquals("error in getCards()", false , deck.getCards()[0].equals(card1));
	   }
	 
	   @Test
	   public void testgetCardsFail() {
	      // assertNotEquals(String message, long expected, long actual)
	      assertNotEquals("error in getCards()",  -1, deck.getCards()[1]);
	   }
	   public void testCompareToPass() {
	
		      assertEquals("error in compareTo()", -1, deck.getCards()[8].compareTo(card1));
		   }
		 
		   @Test
		   public void testCompareToFail() {
		      // assertNotEquals(String message, long expected, long actual)
			   assertNotEquals("error in compareTo()", 1, deck.getCards()[0].compareTo(card1));
		   }
		 
	 
	}
