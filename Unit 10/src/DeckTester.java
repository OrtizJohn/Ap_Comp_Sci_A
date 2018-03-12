/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		int[] vals = new int[] {2,3,4,5,6,7,8,9,10,10,10,10,11};
		String[] suits = new String[] {"Spade", "Clubs", "Diamonds", "Hearts"};
		String[] ranks = new String[] {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "King", "Queen", "Ace"};
		Deck d1 = new Deck(ranks, suits, vals);
		System.out.println(d1);
		d1.deal();
		System.out.println(d1);
		d1.deal();
		System.out.println(d1);
		
		
	}
}

