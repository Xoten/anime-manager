package ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.AnimeManager;

public class Main extends Application{
	private InitialInterfaceGUI initialInterfaceGUI;
	private AnimeManager animeManager;
	
	public Main() {
		animeManager = new AnimeManager();
		initialInterfaceGUI = new InitialInterfaceGUI(animeManager);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("initialInterface.fxml"));

		fxmlLoader.setController(initialInterfaceGUI);
		
		Parent root = fxmlLoader.load();
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Contact Manager");
		primaryStage.show();
	}
	
}
