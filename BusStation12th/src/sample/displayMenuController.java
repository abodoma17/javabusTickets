package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class displayMenuController {
    public displayMenuController(){}
    @FXML
    private ImageView backImage;
    @FXML
    private Button busDisplay;
    @FXML
    private Button employeeDisplayButton;
    @FXML
    private Button customerDisplayButton;
    @FXML
    private Button ticketDisplayButton;

    public void ticketDisplayButtonClick(ActionEvent action) throws IOException
    {
        Main m = new Main();
        m.ticketFile();
        m.changeScene("displayTickets.fxml");
    }

    public void customerDisplayButtonClick(ActionEvent action) throws IOException
    {
        Main m = new Main();
        m.displayCustomers();
        m.customerFile();
        m.changeScene("displayCustomers.fxml");
    }

    public void employeeDisplayButtonClick(ActionEvent action) throws IOException
    {
        Main m = new Main();
        m.displayEmployees();
        m.employeeFile();
        m.changeScene("displayEmployees.fxml");
    }

    public void busDisplayClick(ActionEvent action) throws IOException
    {
        Main m = new Main();
        m.displayBusStations();
        m.busStationFile();
        m.changeScene("displayBus.fxml");
    }

    public void backButtonClick(MouseEvent event) throws IOException
    {
        Main m = new Main();
        m.changeScene("afterLogin.fxml");
    }
}
