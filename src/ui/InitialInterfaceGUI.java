package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import model.AnimeManager;

public class InitialInterfaceGUI {

    @FXML
    private TextField usernametxt;
    
    AnimeManager am;
    
    public InitialInterfaceGUI(AnimeManager anm) {
    	am = anm;    	
	}

    @FXML
    private TextField passwordtxt;

    @FXML
    void loginUser(ActionEvent event) {

    }

    @FXML
    void registerUser(MouseEvent event) {

    }

}
