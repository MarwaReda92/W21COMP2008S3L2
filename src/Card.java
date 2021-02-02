public class Card {
    //Instance variables - the attributes we will model in the class
    private String faceName, suit; //face name is Ace/jack etc
    private int faceValue;

    /**
     * The goal of the constructor is to allocate memory for the object. When this is called it will
     * reserve space and return a "pointer" to the object.
     *
     * A constructor does not have a "return" type and it must match the name of the class
     */

    public Card(String face, String suit, int faceValue)
    {
        faceName = face;
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
}
