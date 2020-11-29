package ui;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import exceptions.PasswordNotEqualsException;
import model.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
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

		User userToLogin = am.binarySearchUser(txtnickname.getText());
	
		if(userToLogin!=null) {
			if(userToLogin.getPassword().equals(txtpassword.getText())) {
				
					loginUser();
				
			}else {
				userPasswordIncorrectAlert();
			}
		}else {
			userDoesNotExistAlert();
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
			am.newUser(username, passwordVerify,pathPicture );
			am.verificationPasswords(password, passwordVerify);
			cleanFieldsRegister();
			clientAddedAlert(username, 1);
			loadLogin();

		}catch(PasswordNotEqualsException pnee) {
			cleanFieldsRegister();
			incorrectPasswordAlert();
		}
	}
	@FXML
	public void browsePathPictureProfile(ActionEvent event) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Buscar imagen");

		File theDirectory = new File("data/picturesPeople");

		fileChooser.setInitialDirectory(theDirectory);

		txtPathPictureRegister.setText(fileChooser.showOpenDialog(null).getName());

	}


	public void clientAddedAlert(String username, int type) {
		cleanFieldsRegister();

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("Cliente agregado correctamente");
		if(type == 0) {
			alert.setContentText("El cliente se ha guardado como comprador con el nombre de usuario: " + username);
		}else {
			alert.setContentText("El cliente se ha guardado como vendedor con el nombre de usuario: " + username);
		}
		alert.showAndWait();
	}


	public void cleanFieldsRegister() {
		txtPasswordRegister.setText("");
		txtPasswordVerificationRegister.setText("");
		txtNicknameRegister.setText("");
		txtPathPictureRegister.setText("");

	}



	public void loginUser() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainMenu.fxml"));

		fxmlLoader.setController(this);

		Parent userBuyerScreenPane = fxmlLoader.load(); 
		

		mainPanel.getChildren().clear();
		mainPanel.setCenter(userBuyerScreenPane);
		
	}

	public void userPasswordIncorrectAlert(){
		cleanFieldsLogin();

		Alert alert = new Alert(AlertType.ERROR);
		alert.setHeaderText("Contraseña incorrecta");
		alert.setContentText("La contraseña que usted ingreso no es la correcta");
		alert.showAndWait();
	}

	public void userDoesNotExistAlert(){
		cleanFieldsLogin();

		Alert alert = new Alert(AlertType.ERROR);
		alert.setHeaderText("Cliente no existente");
		alert.setContentText("El cliente no se encuentra en nuestros datos, por favor verifique su nombre de usuario");
		alert.showAndWait();
	}
	public void cleanFieldsLogin() {
		txtnickname.setText("");
		txtpassword.setText("");
	}

	public void incorrectPasswordAlert() {
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
