package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.io.IOException;

public class busStationAddController {
    public busStationAddController(){}
    @FXML
    private ImageView backImage;
    @FXML
    private TextField busStationCity;
    @FXML
    private TextField busStationName;
    @FXML
    private TextField busStationID;
    @FXML
    private Button busCreateButton;

    //using the addBusStation method that is in main and giving it the parameters that are typed in the textfield
    public void busCreateClick(ActionEvent action) throws IOException
    {
        Main m = new Main();
        m.addBusStation(busStationCity.getText(), busStationName.getText(), busStationID.getText());
        m.changeScene("afterLogin.fxml");
    }


    public void backButtonClick(MouseEvent event) throws IOException
    {
        Main m = new Main();
        m.changeScene("addMenu.fxml");
    }
}
