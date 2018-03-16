public class Lab4_1 {

	public static void main(String[] args) {
		String[] rank = {"a","b","c"};
		String[] suit = {"giraffe","lion"};
		int[] value = {2,1,6};
	Deck decktest = new Deck( rank, suit, value);
	decktest.shuffle();
	int m = decktest.size();
		for(int i =0;i<m;i++) {
		decktest.deal();
		}
	}
}
