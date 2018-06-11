package control4;

public class Plays extends Player {
	
	
	public Plays(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public int searchForEights(Card prev ) {
		int j = 0;
		 Card eight = new Card(8,1);
		   for (int i = 0; i < hand.size(); i++) {
	            hand.getCard(i);
	            if (prev.getRank() == eight.getRank()){
	            	j++;          	
	            }
	            
	        }
		   return j;
		
	}
	 
	

}
