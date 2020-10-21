import java.util.*;
public class PokerGame {
	public static void main(String[]args){
		String[] suits = {" of Clubs", " of Diamonds", " of Hearts", " of Spades"};//suits
		String[] ranks = {"Ace","2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};//ranks
		
		// initializes the deck
	    int n = suits.length * ranks.length;//54 cards
	    String[] deck = new String[n];
	    for (int i = 0; i < ranks.length; i++) {
	        for (int j = 0; j < suits.length; j++) {
	            deck[suits.length*i + j] = ranks[i] + suits[j];
	        }
	    }

	    // shuffles the deck
	    for (int i = 0; i < n; i++) {
	        int r = i + (int) (Math.random() * (n-i));
	    	String temp = deck[r];
	        deck[r] = deck[i];
	        deck[i] = temp;
	    }
	    
	    // asks the user for the number of poker players
	    System.out.println("How many players? (3-9)");
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    
	    // prints shuffled deck
	    for (int i = 0; i < num; i++){
	    	System.out.println("** Person " + (i + 1) + " **");
	        for (int j = 0; j < 5; j++){
	        	System.out.println(deck[i + j * num] + " (Card " + (i + j * num) + ")");
	        }// it has the card number listed
	    }// each player gets a different card
	    scan.close();
	}
}