
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author Loretta
 */
public class GUIDisplay extends Application {
    
    public void start(Stage stage) throws IOException {
        
        try {
            Image image1 = new Image("file:as.gif");
            ImageView[] picture = new ImageView[5];  //array to hold hand of images
            
            //Array for pictures
            for (int i = 0; i < 5; i++) {
                picture[i] = new ImageView(image1);
            }
            HBox hBox = new HBox(20);
            for (int i = 0; i < 5; i++) //cardimages now has x number of pictures
            {
                hBox.getChildren().add(picture[i]);
            }
            
        //display
            Scene scene = new Scene(hBox, 500, 200);
            stage.setScene(scene);
            stage.setTitle("Hockey");
            stage.show();
        } catch (Exception e) {
            System.out.println("Error reading image file(s) " + e);
        }
    }
    
    public static void main(String[] args)            
    {
        Application.launch(args);   //***Need to pass image file?****

    }
    
}
