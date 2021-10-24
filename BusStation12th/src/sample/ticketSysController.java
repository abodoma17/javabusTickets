package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class ticketSysController {
    public ticketSysController(){}
    @FXML
    private ImageView backImage;
    @FXML
    private Button addTicketCustomer;
    @FXML
    private Button viewCustomerTickets;

    public void addTicketCustomerClick(ActionEvent action) throws IOException
    {
        Main m = new Main();
        m.changeScene("addTicketCustomer.fxml");
    }

    public void viewCustomerTicketsClick(ActionEvent action) throws IOException
    {
        Main m = new Main();
        m.changeScene("viewCustomerTickets.fxml");
    }

    public void backButtonClick(MouseEvent event) throws IOException
    {
        Main m = new Main();
        m.changeScene("afterLogin.fxml");
    }
}
