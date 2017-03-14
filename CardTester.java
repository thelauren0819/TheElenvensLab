/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		
		Card king = new Card("King", "Hearts", 10);
		Card five = new Card("Five", "Spades", 5);
		Card ace = new Card("Ace", "Diamonds", 1);
		
		System.out.println(king.toString());
		System.out.println(five.toString());
		System.out.println(ace.toString());
		
		System.out.println(king.matches(ace));
		System.out.println(ace.pointValue());
		System.out.println(ace.rank());
		System.out.println(ace.suit());
	}
}
