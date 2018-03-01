/**
 * The Deck class represents a shuffled deck of cards. It provides several
 * operations including initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	// private List<Card> cards;

	// Unit 9 - Array version of the Deck
	public Card[] cards;

	/**
	 * size is the number of not-yet-dealt cards. Cards are dealt from the top
	 * (highest index) down. The next card to be dealt is at size - 1.
	 */
	private int size;

	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits, and produces
	 * one of the corresponding card.
	 * 
	 * @param ranks
	 *            is an array containing all of the card ranks.
	 * @param suits
	 *            is an array containing all of the card suits.
	 * @param values
	 *            is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		cards = new Card[ranks.length * suits.length];
		int count = 0;
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				cards[count] = new Card(ranks[i], suits[j], values[i]);
				count++;
			}
		}
	}

	/**
	 * Determines if this deck is empty (no undealt cards).
	 * 
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		while (cards.length == 0) {
			return true;
		}
		return false;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * 
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		size = cards.length;
		return size;
	}

	/**
	 * Randomly permute the given collection of cards and reset the size to
	 * represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		for (int k = 0; k < cards.length; k++) {
			int random = (int) (Math.random() * (cards.length - 1) + 1);
			Card tempCard = new Card("", "", 0);
			tempCard = cards[k];
			cards[k] = cards[random];
			cards[random] = tempCard;
		}
	}
				
	/**
	 * Deals a card from this deck.
	 * 
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		size--;
		if (size > 0) {
			return cards[size];
		}
		return null;
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * 
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";
		for (int i = 0; i < size; i++) {
			rtn += cards[i].rank() + " of " + cards[i].suit() + " [Point value = " + cards[i].pointValue() + "]" + "\n";
		}
		// Unit 9 - modify to work with Arrays
		/*
		 * for (int k = size - 1; k >= 0; k--) { rtn = rtn + cards.get(k); if (k
		 * != 0) { rtn = rtn + ", "; } if ((size - k) % 2 == 0) { // Insert
		 * carriage returns so entire deck is visible on console. rtn = rtn +
		 * "\n"; } }
		 * 
		 * rtn = rtn + "\nDealt cards: \n"; for (int k = cards.size() - 1; k >=
		 * size; k--) { rtn = rtn + cards.get(k); if (k != size) { rtn = rtn +
		 * ", "; } if ((k - cards.size()) % 2 == 0) { // Insert carriage returns
		 * so entire deck is visible on console. rtn = rtn + "\n"; } }
		 */

		rtn = rtn + "\n";
		return rtn;
	}
}