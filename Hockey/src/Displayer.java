
/**
 *
 * @author Loretta
 */
public class Displayer {

    public static void textPrint(Card currentCard, String fileName) {   //what card to print?

        String message = null;

        message = (currentCard.getSuit() + " "
                + currentCard.getFaceValue() + " "
                + currentCard.getCardTitle() + " "
                + fileName);

        System.out.println(message);
        //return message;
    }

}
