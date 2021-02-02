import java.util.Arrays;
import java.util.List;

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

    /**
     * This method will validate the the argument is hearts, diamonds, spades or clubs
     * and set the instance variable
     * @param suit
     */
    public void setSuit(String suit) {
        List<String> validSuits = Arrays.asList("hearts","diamonds","spades","clubs");
        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " is not valid, valid options are: "+validSuits);
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public String toString()
    {
        return faceName + " of " + suit;
    }
}
