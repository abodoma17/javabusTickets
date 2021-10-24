package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class afterLoginController{
    public afterLoginController(){}
    @FXML
    private Button addButton;
    @FXML
    private Button displayButton;
    @FXML
    private Button ticketMenuButton;

    public void ticketMenuButtonClick(ActionEvent action) throws IOException
    {
        Main m = new Main();
        m.changeScene("ticketSys.fxml");
    }

    public void addButtonClick(ActionEvent event) throws IOException
    {
        Main m = new Main();
        m.changeScene("addMenu.fxml");
    }


    public void displayButtonClick(ActionEvent event) throws IOException
    {
        Main m = new Main();
        m.changeScene("displayMenu.fxml");
    }

}
