public class CardTester {
    public static void main(String[] args) {
        Card aceOfSpades = new Card("Ace", "Spades",14);
        Card twoOfHearts = new Card("Two","Hearts",2);
        Card crazyCard = new Card("Seven","Clubs",7);
        crazyCard.setSuit("Spades");

        System.out.println(aceOfSpades);
        System.out.println(twoOfHearts);
        System.out.println(crazyCard);
    }
}
