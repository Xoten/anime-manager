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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import model.Anime;
import model.AnimeManager;

public class AnimeManagerGUI {



	AnimeManager am;
	@FXML
	private Button returnButton;

	@FXML
	private AnchorPane mainMenuPane;
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

	@FXML
	private AnchorPane anchPane;
	@FXML
	private TextField searchanimetxt;

	@FXML
	private Label searchedAnime;

	@FXML
	private Label animetype;

	@FXML
	private Label currentEp;

	@FXML
	private Label currentScore;

	@FXML
	private Label totalEp;

	@FXML
	private TextField modifycurrentscoretxt;

	@FXML
	private TextField modifycurrentepanimetxt;

	@FXML
	private TableView<Anime> tvTrackingAnime;

	@FXML
	private TableColumn<Anime, String> tcAnimeName;

	@FXML
	private TableColumn<Anime, String> tcCurentScore;

	@FXML
	private TableColumn<Anime,String> tcCurrentEp;

	@FXML
	private TableColumn<Anime,String> tcTotalEp;

	@FXML
	private TextField nametxt;

	@FXML
	private TextField picturetxt;

	@FXML
	private TextField studiostxt;

	@FXML
	private TextField genrestxt;

	@FXML
	private TextField episodestxt;

	@FXML
	private TextField currenteptxt;

	@FXML
	private TextField currentseasontxt;

	@FXML
	private TextField currentscoretxt;

	@FXML
	private TextField watchedanimenametxt;

	@FXML
	private TextField watchedanimepicturetxt;

	@FXML
	private TextField watchedanimestudiostxt;

	@FXML
	private TextField watchedanimegenrestxt;

	@FXML
	private TextField watchedanimeeptxt;

	@FXML
	private TextField watchedanimescoretxt;

	@FXML
	private Label watchedanimeairtime;

	@FXML
	private Label watchedanimeseasons;

	@FXML
	private TextField watchedanimeseasonstxt;

	@FXML
	private TextField watchedanimeairtimetxt;

	@FXML
	private Label watchedanimerelease;

	@FXML
	private TextField watchedanimereleasetxt;

	@FXML
	private CheckBox movieOp;

	@FXML
	private CheckBox seriesOp;
	@FXML
	private TableView<?> tvWatchedAnime;

	@FXML
	private TableColumn<?, ?> tcWAnimeName;

	@FXML
	private TableColumn<?, ?> tcWAnimeScore;

	@FXML
	private TableColumn<?, ?> tcWAEpisodes;

	@FXML
	private TableColumn<?, ?> TcWAnimeType;

	@FXML
	private TableColumn<?, ?> TcSWAStudios;
	@FXML
	private TableView<?> tcReadedComic;
	@FXML
	private Label comicanimeadapt;
	@FXML
	private CheckBox mangaOp;

	@FXML
	private CheckBox manhwaOp;

	@FXML
	private Label comiccolorized;

	@FXML
	private TableColumn<?, ?> tcReadedComicName;

	@FXML
	private TableColumn<?, ?> tcReadedComicScore;

	@FXML
	private TableColumn<?, ?> tcReadedComicChapters;

	@FXML
	private TableColumn<?, ?> tcReadedComicType;

	@FXML
	private TableColumn<?, ?> tcReadedComicAuthor;

	@FXML
	private TableColumn<?, ?> tcReadedComicVolumes;


	@FXML
	private TableView<?> tcFComic;

	@FXML
	private TableColumn<?, ?> tcFComicame;

	@FXML
	private TableColumn<?, ?> tcFComicCScore;

	@FXML
	private TableColumn<?, ?> tcFComicCurrChap;

	@FXML
	private TableColumn<?, ?> tcFComicType;

	@FXML
	private TableColumn<?, ?> tcCurrentCVol;

	@FXML
	private TableColumn<?, ?> tcFComicChap;

	@FXML
	private TableView<?> tcReadedNovel;

	@FXML
	private TableColumn<?, ?> tcNovelName;

	@FXML
	private TableColumn<?, ?> tcNovelScore;

	@FXML
	private TableColumn<?, ?> tcNovelChapters;

	@FXML
	private TableColumn<?, ?> tcNovelAdaptation;

	@FXML
	private TableColumn<?, ?> tcNovelVol;
	@FXML
	private TableView<?> tcTrackingNovel;

	@FXML
	private TableColumn<?, ?> tcFLNovelName;

	@FXML
	private TableColumn<?, ?> tcFLScore;

	@FXML
	private TableColumn<?, ?> tcFLNCChapter;

	@FXML
	private TableColumn<?, ?> tcFLNovelTChap;

	@FXML
	private TableColumn<?, ?> tcFLTotalNVolumes;

	@FXML
	private TableColumn<?, ?> tcFLNovelCrrVol;
	@FXML
	private TextField comicnametxt;

	@FXML
	private TextField comicchapterstxt;

	@FXML
	private TextField comicauthortxt;

	@FXML
	private TextField comicgenrestxt;

	@FXML
	private TextField comicvolumestxt;

	@FXML
	private TextField comiccurrentchaptxt;

	@FXML
	private TextField comiccurvoltxt;

	@FXML
	private TextField comiccurscoretxt;

	@FXML
	private TextField comicAdaptxtxt;

	@FXML
	private TextField comicColorizedtxt;

	@FXML
	private TextField TFComicImagetxt;

	@FXML
	private TextField modifyCurrComicScoretxt;

	@FXML
	private TextField modifyCurrComicChaptxt;

	@FXML
	private TextField modifyCurrComicVoltxt;
	@FXML
	private TextField searchComictxt;
	@FXML
	private TextField ReadedComictxt;

	@FXML
	private TextField readedcomicpicturetxt;

	@FXML
	private TextField readedcomicauthortxt;

	@FXML
	private TextField readedcomicgenretxt;

	@FXML
	private TextField readedcomicchapterstxt;

	@FXML
	private TextField readedcomicscoretxt;

	@FXML
	private CheckBox mangaop2;

	@FXML
	private CheckBox manhwaop2;

	@FXML
	private Label ReadedComicColorized;

	@FXML
	private TextField readedcomiccolorizedtxt;

	@FXML
	private Label readedComicAdap;

	@FXML
	private TextField readedcomicanimeadaptxt;

	@FXML
	private TextField readedcomicvolumestxt;








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

		File theDirectory = new File("data/animePics");

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
		returnButton.setVisible(false);
		mainPanel.setTop(mainMenuPane);
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
		alert.setHeaderText("usuario no existente");
		alert.setContentText("El usuaruio no se encuentra en registrado, por favor verifique su nickname");
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
	void returnToMainMenu(ActionEvent event) throws IOException {

		toLogin();
	}
	@FXML

	//Anime Section
	//All Anime Options
	void manageAnimeList(ActionEvent event) throws IOException {


		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainAnimeOption.fxml"));

		fxmlLoader.setController(this);

		Parent animeOptionPane = fxmlLoader.load();
		returnButton.setVisible(true);

		mainPanel.setCenter(animeOptionPane);
	}





	@FXML
	void manageQuizzes(ActionEvent event) {
		returnButton.setVisible(true);
	}

	@FXML
	void searchUser(ActionEvent event) {
		returnButton.setVisible(true);

	}

	@FXML
	void showTrackAnimeOp(ActionEvent event) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TrackingAnimeOption.fxml"));

		fxmlLoader.setController(this);

		Parent trackingAnimeOp = fxmlLoader.load();


		mainPanel.setCenter(trackingAnimeOp);




	}

	@FXML
	void showWatchedAnimeOp(ActionEvent event) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("WatchedAnimeOption.fxml"));

		fxmlLoader.setController(this);

		Parent watchedAnimeOption = fxmlLoader.load();




		mainPanel.setCenter(watchedAnimeOption);



	}
	@FXML
	void ShowTrackingAnime(ActionEvent event) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("showTrackingAnime.fxml"));

		fxmlLoader.setController(this);

		Parent showTrackingAnimePane = fxmlLoader.load();




		mainPanel.setCenter(showTrackingAnimePane);

	}

	@FXML
	void addAnime(ActionEvent event) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("AddAnimetoWatchList.fxml"));

		fxmlLoader.setController(this);

		Parent addAnimetoWatchList = fxmlLoader.load();




		mainPanel.setCenter(addAnimetoWatchList);



	}


	@FXML
	void searchAnime(ActionEvent event) {

	}

	@FXML
	void editAnimeStatus(ActionEvent event) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("editAnimeStatus.fxml"));

		fxmlLoader.setController(this);

		Parent editAnimeStatuss = fxmlLoader.load();



		mainPanel.setCenter(editAnimeStatuss);

	}

	@FXML
	void saveCurrentEp(ActionEvent event) {

	}

	@FXML
	void saveCurrentScore(ActionEvent event) {

	}




	@FXML
	void sortbycurrentScore(ActionEvent event) {

	}

	@FXML
	void sortByCurrentEp(ActionEvent event) {

	}



	@FXML
	void addAnimetoWatchList(ActionEvent event) {

	}

	@FXML
	void addWatchedAnimeOp(ActionEvent event) throws IOException {





		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addWatchedAnime.fxml"));

		fxmlLoader.setController(this);

		Parent toAddwatchedanimeop = fxmlLoader.load();



		watchedanimeairtime.setVisible(false);

		watchedanimeseasons.setVisible(false);

		watchedanimeseasonstxt.setVisible(false);

		watchedanimeairtimetxt.setVisible(false);

		watchedanimerelease.setVisible(false);

		watchedanimereleasetxt.setVisible(false);


		mainPanel.setCenter(toAddwatchedanimeop);



	}

	@FXML
	void showWatchedAnimeList(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("showWatchedAnime.fxml"));

		fxmlLoader.setController(this);

		Parent showWatchedAnimeScreen = fxmlLoader.load();



		mainPanel.setCenter(showWatchedAnimeScreen);



	}

	@FXML
	void addIfSeries(ActionEvent event) {



		if(seriesOp.isSelected() == true) {

			movieOp.setDisable(true);
			watchedanimeairtime.setVisible(true);

			watchedanimeseasons.setVisible(true);

			watchedanimeseasonstxt.setVisible(true);

			watchedanimeairtimetxt.setVisible(true);
		}else {

			movieOp.setDisable(false);

			watchedanimeairtime.setVisible(false);

			watchedanimeseasons.setVisible(false);

			watchedanimeseasonstxt.setVisible(false);

			watchedanimeairtimetxt.setVisible(false);


		}

	}

	@FXML
	void addWatchedAnime(ActionEvent event) {



	}

	@FXML
	void addifMovie(ActionEvent event) {

		if(movieOp.isSelected() == true) {
			seriesOp.setDisable(true);
			watchedanimerelease.setVisible(true);

			watchedanimereleasetxt.setVisible(true);
		}else {
			seriesOp.setDisable(false);

			watchedanimerelease.setVisible(false);

			watchedanimereleasetxt.setVisible(false);
		}

	}

	@FXML
	void SortWatchedAnimebyScore(ActionEvent event) {

	}

	@FXML
	void sortWatchedAnimebyName(ActionEvent event) {

	}

	//Comic Section
	//All Comic Options 

	@FXML
	void manageComicList(ActionEvent event) throws IOException {

		returnButton.setVisible(true);

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("mainComicOption.fxml"));

		fxmlLoader.setController(this);

		Parent mainComicOptionScreen = fxmlLoader.load();



		mainPanel.setCenter(mainComicOptionScreen);

	}

	@FXML
	void AddComicToReadList(ActionEvent event) {

	}

	@FXML
	void AddToReadListIfManhwa(ActionEvent event) {

		if(manhwaOp.isSelected() == true) {
			mangaOp.setDisable(true);
			comiccolorized.setVisible(true);

			comicColorizedtxt.setVisible(true);

		}else {
			mangaOp.setDisable(false);

			comiccolorized.setVisible(false);

			comicColorizedtxt.setVisible(false);
		}
	}

	@FXML
	void addToReadListIfManga(ActionEvent event) {

		if(mangaOp.isSelected() == true) {
			manhwaOp.setDisable(true);
			comicanimeadapt.setVisible(true);
			comicAdaptxtxt.setVisible(true);

		}else {
			manhwaOp.setDisable(false);

			comicanimeadapt.setVisible(false);
			comicAdaptxtxt.setVisible(false);
		}
	}

	@FXML
	void searchComic(ActionEvent event) {

	}


	@FXML
	void editComicStatusOption(ActionEvent event) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("editComicStatus.fxml"));

		fxmlLoader.setController(this);

		Parent editComicStatusScreen = fxmlLoader.load();


		mainPanel.setCenter(editComicStatusScreen);

	}

	@FXML
	void saveCurrComicVol(ActionEvent event) {

	}

	@FXML
	void saveCurrentComicScore(ActionEvent event) {

	}
	@FXML
	void saveCurrComicChap(ActionEvent event) {

	}



	@FXML
	void showFollowedComics(ActionEvent event) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("showTrackingComic.fxml"));

		fxmlLoader.setController(this);

		Parent showFollowedComicsScreen = fxmlLoader.load();


		mainPanel.setCenter(showFollowedComicsScreen);

	}

	@FXML
	void showReadedComicOp(ActionEvent event) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ReadedComicOption.fxml"));

		fxmlLoader.setController(this);

		Parent readedComicOptionScreen = fxmlLoader.load();


		mainPanel.setCenter(readedComicOptionScreen);

	}

	@FXML
	void showTrackComicOp(ActionEvent event) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TrackingComicOption.fxml"));

		fxmlLoader.setController(this);

		Parent showTrackComicOptionscreen = fxmlLoader.load();


		mainPanel.setCenter(showTrackComicOptionscreen);

	}

	@FXML
	void addComicToFollowOp(ActionEvent event) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addComicToReadList.fxml"));

		fxmlLoader.setController(this);

		Parent addComicToReadListScreen = fxmlLoader.load();

		comiccolorized.setVisible(false);
		comicColorizedtxt.setVisible(false);
		comicanimeadapt.setVisible(false);
		comicAdaptxtxt.setVisible(false);


		mainPanel.setCenter(addComicToReadListScreen);


	}

	@FXML
	void addReadedComicOp(ActionEvent event) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addReadedComic.fxml"));

		fxmlLoader.setController(this);

		Parent addReadedComicScreen = fxmlLoader.load();

		ReadedComicColorized.setVisible(false);

		readedcomiccolorizedtxt.setVisible(false);

		readedComicAdap.setVisible(false);

		readedcomicanimeadaptxt.setVisible(false);


		mainPanel.setCenter(addReadedComicScreen);



	}

	@FXML
	void showComics(ActionEvent event) throws IOException {

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("showReadedComic.fxml"));

		fxmlLoader.setController(this);

		Parent showReadedComicScreen = fxmlLoader.load();


		mainPanel.setCenter(showReadedComicScreen);

	}


	@FXML
	void addIfManga2(ActionEvent event) {


		if(mangaop2.isSelected() == true) {

			manhwaop2.setDisable(true);

			ReadedComicColorized.setVisible(false);

			readedcomiccolorizedtxt.setVisible(false);

			readedComicAdap.setVisible(true);

			readedcomicanimeadaptxt.setVisible(true);


		}else {
			manhwaop2.setDisable(false);

			readedComicAdap.setVisible(false);

			readedcomicanimeadaptxt.setVisible(false);



		}


	}

	@FXML
	void addIfManhwa2(ActionEvent event) {

		if(manhwaop2.isSelected() == true) {

			mangaop2.setDisable(true);

			ReadedComicColorized.setVisible(true);

			readedcomiccolorizedtxt.setVisible(true);


		}else {
			mangaop2.setDisable(false);

			ReadedComicColorized.setVisible(false);

			readedcomiccolorizedtxt.setVisible(false);

		}

	}

	@FXML
	void addReadedComic(ActionEvent event) {

	}


	@FXML
	void sortReadedComicByAuthor(ActionEvent event) {

	}

	@FXML
	void sortReadedComicByVolumes(ActionEvent event) {

	}

	@FXML
	void sortFollowingComicbyVol(ActionEvent event) {

	}

	//Book Section
	//All Book Options


	@FXML
	void manageBookList(ActionEvent event) {
		returnButton.setVisible(true);

	}

	@FXML
	void sortReadedBookByVolumes(ActionEvent event) {

	}

	@FXML
	void sortReadedBookbyName(ActionEvent event) {

	}


	@FXML
	void sortCrrNovelbyChap(ActionEvent event) {

	}

	@FXML
	void sortCurrentnovelbyCrrVol(ActionEvent event) {

	}








}
