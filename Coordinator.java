package EgyptianWar;

/**
 *
 * @author Shashin Gupta
 * @version 0.0.1
 *
 */

public class Coordinator {

    public static final int NUMBER_OF_CARDS = 52;
    public static final int STARTING_NUMBER = NUMBER_OF_CARDS/2;
    private static Card[] deck;
    private static final String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static final String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};

    static {
        deck = new Card[NUMBER_OF_CARDS];
        int i, j, k = 0;

        for (i = 0; i < suits.length; i++) {
            for (j = 0; j < numbers.length; j++) {
                deck[k++] = new Card(numbers[j], suits[i]);
            }
        }
    }

    public static void main(String args[]) {

    }

    private static boolean compare(String player, String computer) {

    }

    private static class Card {

        private String number;
        private String suit;

        public Card(String number, String suit) {
            this.number = number;
            this.suit = suit;
        }

        public String getNumber() {
            return number;
        }

        public String getSuit() {
            return suit;
        }
    }

}
