package control4;

import static org.junit.Assert.*;
import org.junit.Test;

 
public class CardJUnit {
	private Card card1 = new Card(1,1);
	private Card card2 = new Card(13,2);
	private Card card3 = new Card(12,2);
   @Test
   public void testCompareToPass() {
	   
      // assertEquals(String message, long expected, long actual)
      assertEquals("error in compareTo()",  1, card1.compareTo(card2));
      assertEquals("error in compareTo()", -1, card2.compareTo(card1));
      assertEquals("error in compareTo()",  -1, card3.compareTo(card2));
   }
 
   @Test
   public void testCompareToFail() {
      // assertNotEquals(String message, long expected, long actual)
      assertNotEquals("error in compareTo()",  -1, card1.compareTo(card2));
   }
 
}