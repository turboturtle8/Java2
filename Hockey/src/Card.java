
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Card {
    
    private String suit, cardTitle;
    private int faceValue;  //rank
    private BufferedImage cardImage;    
    
    public Card() throws IOException
    {
        //Which card am I on?
        cardImage =ImageIO.read(new File("3h.gif"));
    }
    
    public Card(String suit, String cardTitle, int faceValue, BufferedImage cardImage)
    {
        this.suit = suit;
        this.cardTitle = cardTitle;
        this.faceValue = faceValue;
        this.cardImage = cardImage;        
    }
    
    public String toString()
    {
        return "Your card is the "+faceValue+ " of "+getSuit();
    }
    /**
    * @param cardImage the cardImage to set
    */    
        public void setCardImage(BufferedImage cardImage) {            
        this.cardImage = cardImage;
    }
    /**
     * @return the faceValue
     */
    public int getFaceValue() {
        return faceValue;
    }    
    /**
     * @return the cardTitle
     */
    public String getCardTitle() {
        return cardTitle;
    }
    /**
     * @return the cardImage
     */
    public BufferedImage getCardImage() {
        return cardImage;
    }
     /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }    
    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
    /**
     * @param cardTitle the cardTitle to set
     */
    public void setCardTitle(String cardTitle) {
        this.cardTitle = cardTitle;
    }
    /**
     * @param faceValue the faceValue to set
     */
    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
}
