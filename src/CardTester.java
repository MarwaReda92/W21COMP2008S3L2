public class CardTester {
    public static void main(String[] args) {
        Card aceOfSpades = new Card("Ace", "Spades",14);
        Card twoOfHearts = new Card("Two","Hearts",2);
        Card crazyCard = new Card("Seven","Clubs",7);
        crazyCard.setSuit("Spades");

        System.out.println(aceOfSpades);
        System.out.println(twoOfHearts);
        System.out.println(crazyCard);

        DeckOfCards deck = new DeckOfCards();
        System.out.printf("%nThe deck of cards has %d cards in it%n", deck.getNumOfCardsInDeck());

        deck.shuffle();

        System.out.println("Here are the first 5 cards:");
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());
        System.out.println(deck.dealTopCard());

        System.out.printf("%nThe deck of cards has %d cards in it%n", deck.getNumOfCardsInDeck());
    }
}
