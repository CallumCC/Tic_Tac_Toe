import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class gameWindow {

    @FXML private Canvas one;
    @FXML private Canvas two;
    @FXML private Canvas three;
    @FXML private Canvas four;
    @FXML private Canvas five;
    @FXML private Canvas six;
    @FXML private Canvas seven;
    @FXML private Canvas eight;
    @FXML private Canvas nine;
    
    private Image x = new Image("X.png", 100,100,false, false);

    @FXML 
    void oneSelect(MouseEvent event) {
    	System.out.println("One");
    	GraphicsContext gc = one.getGraphicsContext2D();

        gc.drawImage(x, 15, 15);
    }

    @FXML
    void twoSelect(MouseEvent event) {
    	System.out.println("Two");
    	GraphicsContext gc = two.getGraphicsContext2D();

        gc.drawImage(x, 15, 15);

    }

    @FXML
    void threeSelect(MouseEvent event) {
    	System.out.println("Three");
    	GraphicsContext gc = three.getGraphicsContext2D();

        gc.drawImage(x, 15, 15);

    }

    @FXML
    void fourSelect(MouseEvent event) {
    	System.out.println("Four");
    	GraphicsContext gc = four.getGraphicsContext2D();

        gc.drawImage(x, 15, 15);

    }

    @FXML
    void fiveSelect(MouseEvent event) {
    	System.out.println("Five");
    	GraphicsContext gc = five.getGraphicsContext2D();

        gc.drawImage(x, 15, 15);

    }

    @FXML
    void sixSelect(MouseEvent event) {
    	System.out.println("Six");
    	GraphicsContext gc = six.getGraphicsContext2D();

        gc.drawImage(x, 15, 15);

    }

    @FXML
    void sevenSelect(MouseEvent event) {
    	System.out.println("Seven");
    	GraphicsContext gc = seven.getGraphicsContext2D();

        gc.drawImage(x, 15, 15);

    }

    @FXML
    void eightSelect(MouseEvent event) {
    	System.out.println("Eight");
    	GraphicsContext gc = eight.getGraphicsContext2D();

        gc.drawImage(x, 15, 15);

    }

    @FXML
    void nineSelect(MouseEvent event) {
    	System.out.println("Nine");
    	GraphicsContext gc = nine.getGraphicsContext2D();

        gc.drawImage(x, 15, 15);

    }

}
