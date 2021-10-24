package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class viewCustomerTicketsController extends Main implements Initializable
{
    public viewCustomerTicketsController(){}
    @FXML
    private ImageView backImage;
    @FXML
    private ComboBox<String> customerNameComboBox;
    @FXML
    private Button ticketViewButton;
    @FXML
    private ListView<String> ticketListView;
    @FXML
    private Label errorLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(Customer customer: customerList)
        {
            customerNameComboBox.getItems().add(customer.getName()+" || "+customer.getCustomerID());
        }
    }

    public void ticketViewButtonClick(ActionEvent action) throws IOException
    {
        try
        {
            if(customerNameComboBox.getValue().toString().isBlank())
            {
                throw new IOException();
            }
        }
        catch(Exception e)
        {
            errorLabel.setText("ERROR: Select A Customer");
            return;
        }

        ticketListView.getItems().clear();
        for(Ticket ticket: customerList.get(customerNameComboBox.getSelectionModel().getSelectedIndex()).tickets)
        {
            ticketListView.getItems().add(ticket.toString());
        }
    }

    public void backButtonClick(MouseEvent event) throws IOException
    {
        changeScene("ticketSys.fxml");
    }
}
