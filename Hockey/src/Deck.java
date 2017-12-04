
import java.io.File;
import java.io.IOException;
import javafx.scene.image.Image;
import javax.imageio.ImageIO;

public class Deck {

    public Card[] deck;
    public int currentCard = 0;    //index of the next card to be dealt
    public int[] faceValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    public String[] suitValues = {"clubs", "diamonds", "hearts", "spades"};

    public Deck() throws IOException {
        deck = new Card[52];
        String message = null;
        String filename = null;
        for (int suit = 0; suit < suitValues.length; suit++) {
            for (int rank = 1; rank < faceValues.length; rank++) {
                {
                    message = faceValues[rank] + " of " + suitValues[suit];
                    filename = findFileName(suitValues[suit], faceValues[rank]);

                    deck[currentCard] = new Card(suitValues[suit],
                            message,
                            faceValues[rank],
                            ImageIO.read(new File(findFileName(suitValues[suit], faceValues[rank]))));

                    Displayer.textPrint(deck[currentCard], filename);

                    currentCard++;                       //grab next blank card
                }
            }
        }
    }

    public void Shuffle() {

    }

    public void dealHand() {

    }

    public void createHands() {

    }

    Image getPicture() //what picture?
    {
        Image picture = null;

        return picture;
    }

    private String findFileName(String suit, int faceValue) {

        String fileName;
        switch (faceValue) {
            case 0:
                fileName = "a" + suit.substring(0, 1) + ".gif";
                break;
            case 9:
                fileName = "t" + suit.substring(0, 1) + ".gif";
                break;
            case 10:
                fileName = "j" + suit.substring(0, 1) + ".gif";
                break;
            case 11:
                fileName = "q" + suit.substring(0, 1) + ".gif";
                break;
            case 12:
                fileName = "k" + suit.substring(0, 1) + ".gif";
                break;
            default:
                fileName = (faceValue + suit.substring(0, 1) + ".gif");
                break;
        }

        return fileName;
    }
    
    public static void main(String[] args) throws IOException
    {
                Deck deckOfCards = new Deck();        

    }            
}
