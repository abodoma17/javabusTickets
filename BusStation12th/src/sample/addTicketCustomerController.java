package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class addTicketCustomerController extends Main implements Initializable {
    public addTicketCustomerController(){}
    @FXML
    private ImageView backImage;
    @FXML
    private ComboBox<String> customerNameComboBox;
    @FXML
    private ComboBox<String> ticketComboBox;
    @FXML
    private TextField quantityTextField;
    @FXML
    private Label errorLabel;
    @FXML
    private Button ticketAddButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(Customer customer: customerList)
        {
            customerNameComboBox.getItems().add(customer.getName()+" || "+customer.getCustomerID());
        }
        for(Ticket ticket: ticketList)
        {
            ticketComboBox.getItems().add(ticket.toString());
        }
    }

    public void ticketAddButtonClick(ActionEvent action) throws IOException
    {
        //if user enters characters in the textfield not a number it will display an error.
        try
        {
            int n = Integer.parseInt(quantityTextField.getText());
        }
        catch(Exception e)
        {
            errorLabel.setText("ERROR: Quantity should be a number.");
            return;
        }

        //user can not enter quantity less than 0 or greater than 20
        try
        {
            if(Integer.parseInt(quantityTextField.getText())>20 || Integer.parseInt(quantityTextField.getText())<0)
            {
                throw new IOException();
            }
        }
        catch(Exception e)
        {
            errorLabel.setText("ERROR: Quantity should be >0 and <20.");
            return;
        }

        //adding the tickets with the specified quantity to the arraylist of tickets in the customer object
        for(int i=0;i<Integer.parseInt(quantityTextField.getText());i++)
        {
            customerList.get(customerNameComboBox.getSelectionModel().getSelectedIndex()).addTicket(ticketList.get(ticketComboBox.getSelectionModel().getSelectedIndex()));
        }
        changeScene("afterLogin.fxml");
    }


    public void backButtonClick(MouseEvent event) throws IOException
    {
        Main m = new Main();
        m.changeScene("ticketSys.fxml");
    }
}
