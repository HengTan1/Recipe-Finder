package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author Kalob Reinholz, Brodrick Grimm
 */
public class HomeSceneController implements Initializable {

    @FXML
    private Button prevRecipe;
    @FXML
    private Button howToUse;
    @FXML
    private Button next;
    @FXML
    private Button quitButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void prevRecipe(ActionEvent event) throws IOException {
    }

    @FXML
    private void howToUse(ActionEvent event) throws IOException {
        Parent infoParent = FXMLLoader.load(getClass().getResource("/Views/HowToUse.fxml"));
        Scene infoScene = new Scene(infoParent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(infoScene);
        window.show();  
    }

    @FXML
    private void next(ActionEvent event) throws IOException {
        Parent infoParnet = FXMLLoader.load(getClass().getResource("/Views/FoodInfo.fxml"));
        Scene infoScene = new Scene(infoParnet);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(infoScene);
        window.show();
    }

    @FXML
    private void quit(ActionEvent event) {
        Stage stage = (Stage) quitButton.getScene().getWindow();
        stage.close();
    }
}