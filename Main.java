import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application{
	
	public void start(Stage primaryStage) {
		try {
			// Load the main scene.
			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("Tic.fxml"));
			Scene scene = new Scene(root, 400, 400);

			// Place the main scene on stage and show it.
			primaryStage.setScene(scene);
			primaryStage.setTitle("TicTacToe");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
