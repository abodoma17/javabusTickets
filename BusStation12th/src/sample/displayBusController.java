package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class displayBusController extends Main implements Initializable{
    @FXML
    private ImageView backImage;
    @FXML
    private ListView<String> busList;
    @FXML
    private Button removeButton;

    //this is a method that is called when the scene is shown
    //this fills up the ListView with the bus stations' toStrings
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(BusStation bus: busStationList)
        {
            busList.getItems().add(bus.toString());
        }

    }


    //uses the index of the string selected to delete the bus station from the arraylist in main
    public void removeButtonClick(ActionEvent action) throws IOException {
        final int selectedIdx = busList.getSelectionModel().getSelectedIndex();
        removeBus(selectedIdx);
        busStationFile();
        changeScene("displayBus.fxml");

    }


    public void backButtonClick(MouseEvent event) throws IOException
    {
        Main m = new Main();
        m.changeScene("displayMenu.fxml");
    }


}
