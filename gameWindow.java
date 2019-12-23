import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;

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

    @FXML 
    void oneSelect(MouseEvent event) {
    	System.out.println("One");
    }

    @FXML
    void twoSelect(MouseEvent event) {
    	System.out.println("Two");

    }

    @FXML
    void threeSelect(MouseEvent event) {
    	System.out.println("Three");

    }

    @FXML
    void fourSelect(MouseEvent event) {
    	System.out.println("Four");

    }

    @FXML
    void fiveSelect(MouseEvent event) {
    	System.out.println("Five");

    }

    @FXML
    void sixSelect(MouseEvent event) {
    	System.out.println("Six");

    }

    @FXML
    void sevenSelect(MouseEvent event) {
    	System.out.println("Seven");

    }

    @FXML
    void eightSelect(MouseEvent event) {
    	System.out.println("Eight");

    }

    @FXML
    void nineSelect(MouseEvent event) {
    	System.out.println("Nine");

    }

}
