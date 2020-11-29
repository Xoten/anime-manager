package ui;

import java.io.File;
import java.io.IOException;
import exceptions.NotTheSamePasswordException;
import model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import model.AnimeManager;

public class AnimeManagerGUI {

	AnimeManager am;
	@FXML
	private BorderPane mainPanel;
	@FXML
	private TextField txtnickname;

	@FXML
	private TextField txtpassword;

	@FXML
	private TextField txtPasswordRegister;

	@FXML
	private TextField txtPasswordVerificationRegister;

	@FXML
	private TextField txtNicknameRegister;

	@FXML
	private TextField txtPathPictureRegister;
	@FXML
    private TextField searchusertxt;
	@FXML
    private Label txtusernick;

	@FXML
    private AnchorPane menuPane;



	public AnimeManagerGUI(AnimeManager amg){
		am = amg;

	}


	public void loadLogin() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));

		fxmlLoader.setController(this);

		Parent loginPane = fxmlLoader.load();

		mainPanel.getChildren().clear();
		mainPanel.setCenter(loginPane);
	}
	@FXML
	public void login(ActionEvent event) throws IOException {

		User userToLogin = am.searchUser(txtnickname.getText());
	
		if(userToLogin!=null) {
			if(userToLogin.getPassword().equals(txtpassword.getText())) {
				
					toLogin();
				
			}else {
				toShowIncorrectPasswordAlert();
			}
		}else {
			toShowUnexistingUserAlert();
		}
	}
	

	@FXML
	public void register(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("register.fxml"));

		fxmlLoader.setController(this);

		Parent registerPane = fxmlLoader.load();

		mainPanel.getChildren().clear();
		mainPanel.setCenter(registerPane);


	}

	@FXML
	public void addUser(ActionEvent event) throws IOException {
		try {

			String password = txtPasswordRegister.getText();
			String passwordVerify = txtPasswordVerificationRegister.getText();
			String username = txtNicknameRegister.getText();
			String pathPicture = txtPathPictureRegister.getText();
			am.toAddNewUser(username, passwordVerify,pathPicture );
			am.toVerifyPassword(password, passwordVerify);
			toCleanRegister();
			newUserAlert(username, 1);
			loadLogin();

		}catch(NotTheSamePasswordException pnee) {
			toCleanRegister();
			toShowInvalidPasswordAlert();
		}
	}
	@FXML
	public void searchPicture(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Buscar imagen");

		File theDirectory = new File("data/picturesPeople");

		fileChooser.setInitialDirectory(theDirectory);

		txtPathPictureRegister.setText(fileChooser.showOpenDialog(null).getName());

	}


	public void newUserAlert(String username, int type) {
		toCleanRegister();

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("Usuario agregado correctamente");
	
		alert.showAndWait();
	}


	public void toCleanRegister() {
		txtPasswordRegister.setText("");
		txtPasswordVerificationRegister.setText("");
		txtNicknameRegister.setText("");
		txtPathPictureRegister.setText("");

	}



	public void toLogin() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainMenu.fxml"));

		fxmlLoader.setController(this);

		Parent userBuyerScreenPane = fxmlLoader.load(); 
		

		mainPanel.getChildren().clear();
		mainPanel.setCenter(userBuyerScreenPane);
		
	}

	public void toShowIncorrectPasswordAlert(){
		toCleanLogin();

		Alert alert = new Alert(AlertType.ERROR);
		alert.setHeaderText("Contraseña incorrecta");
		alert.setContentText("La contraseña que usted ingreso no es la correcta");
		alert.showAndWait();
	}

	public void toShowUnexistingUserAlert(){
		toCleanLogin();

		Alert alert = new Alert(AlertType.ERROR);
		alert.setHeaderText("Cliente no existente");
		alert.setContentText("El cliente no se encuentra en nuestros datos, por favor verifique su nombre de usuario");
		alert.showAndWait();
	}
	public void toCleanLogin() {
		txtnickname.setText("");
		txtpassword.setText("");
	}

	public void toShowInvalidPasswordAlert() {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setHeaderText("Contraseñas incorrectas");
		alert.setContentText("Las contraseñas que ingreson no son iguales");
		alert.showAndWait();
	}
	@FXML
    void manageAnimeList(ActionEvent event) {

    }

    @FXML
    void manageBookList(ActionEvent event) {

    }

    @FXML
    void manageComicList(ActionEvent event) {

    }

    @FXML
    void manageQuizzes(ActionEvent event) {

    }

    @FXML
    void searchUser(ActionEvent event) {

    }


}
