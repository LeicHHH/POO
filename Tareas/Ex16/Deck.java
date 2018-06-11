package control4;

import java.util.Arrays;
import java.util.Random;

/**
 * A deck of playing cards (of fixed size).
 */
public class Deck {

    private Card[] cards;

    /**
     * Constructs a standard deck of 52 cards.
     */
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }
    


    /**ran
     * Constructs a deck of n cards (null).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /**
     * Gets the internal cards array.
     */
    public Card[] getCards() {
        return this.cards;
    }

    /**
     * Displays each of the cards in the deck.
     */
    public void print() {
        for (int i = 0; i < this.cards.length; i++) {
            System.out.println(this.cards[i]);
        }
    }

    /**
     * Returns a string representation of the deck.
     */
    public String toString() {
        return Arrays.toString(this.cards);
    }

    /**
     * Chooses a random number between low and high, including both.
     */
    public int randomInt(int low, int high) {
    	Random random = new Random();
        int random1 = random.nextInt((high - low) + 1) + low;
	    return random1;
        
    }

    /**
     * Swaps the cards at indexes i and j.
     */
    public void swapCards(int i, int j) {
    	 Card temp = cards[i];
         cards[i] = cards[j];
         cards[j] = temp;
    }

    /**
     * Randomly permutes the array of cards.
     */
    public void shuffle() {
        for (int i=0;i<cards.length;i++){
           swapCards(i, randomInt(i, cards.length - 1));
        }
     }

    /**
     * Finds the index of the lowest card
     * between low and high inclusive.
     */
    public int indexLowest(int low, int high) {
    	int i = low + 1;
    	while(i < high)
    	if(cards[low].compareTo(cards[i]) == 1) {
    		low = i;
    		i++;
    		
    	}
        return low;
    }

    /**
     * Sorts the cards (in place) using selection sort.
     */
    public void selectionSort() {
        for (int i=0;i<cards.length-1;i++){
           swapCards(i, indexLowest(i, cards.length - 1));
        }
     }

    /**
     * Returns a subset of the cards in the deck.
     */
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    /**
     * Combines two previously sorted subdecks.
     */
    public static Deck merge(Deck d1, Deck d2) {
        if (d1.getCards().length  == 0){
        	Card[] merged = new Card[d2.getCards().length];
           merged = d2.getCards();
           Deck deck = new Deck(d2.getCards().length);
           deck.cards = merged;
           return deck;
        } 
        else if (d2.getCards().length == 0){
        	Card[] merged = new Card[d1.getCards().length];
        	merged = d1.getCards();
        	Deck deck = new Deck(d1.getCards().length);
            deck.cards = merged;
            return deck;
        } 
        else {
        	Card[] merged = new Card[d1.getCards().length + d2.getCards().length];
        	int z = 0,j = 0;
           for (int i = 0; i < merged.length ;i++){
              if (z-1 >= d2.getCards().length || j < d1.getCards().length && d1.getCards()[j].compareTo(d2.getCards()[z]) <= 0){
            	  merged[i] = d1.getCards()[z];
                 z++;
              } 
              else {
            	  merged[i] = d2.getCards()[j];
                 j++;
              }
           }
           Deck deck = new Deck(d2.getCards().length + d1.getCards().length);
           deck.cards = merged;
           return deck;
        }
     }

    /**
     * Returns a sorted copy of the deck using merge sort.
     */
    public Deck mergeSort() {
    	
        return this;
    }

    /**
     * Reorders the cards (in place) using insertion sort.
     */
    public void insertionSort() {
    }

}