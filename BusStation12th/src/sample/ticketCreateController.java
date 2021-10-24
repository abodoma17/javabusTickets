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

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ticketCreateController extends Main implements Initializable {
    public ticketCreateController(){}
    @FXML
    private ImageView backImage;
    @FXML
    private ComboBox<String> eNameComboBox;
    @FXML
    private ComboBox<String> fromComboBox;
    @FXML
    private ComboBox<String> toComboBox;
    @FXML
    private TextField ticketIDTextField;
    @FXML
    private Button ticketAddButton;
    @FXML
    private Label errorLabel;

    public void ticketAddButtonClick(ActionEvent action) throws IOException
    {
        try
        {
            if(fromComboBox.getValue().toString().equals(toComboBox.getValue().toString()))
            {
                throw new IOException();
            }
        }

        catch(Exception e)
        {
            errorLabel.setText("ERROR: From and To should be different.");
            return;
        }


        try
        {
            if(ticketIDTextField.getText().isBlank())
            {
                throw new IOException();
            }
        }
        catch(Exception e)
        {
            errorLabel.setText("ERROR: ID should not be empty.");
            return;
        }

        try
        {
            if(eNameComboBox.getValue().toString().isBlank())
            {
                throw new IOException();
            }
        }
        catch(Exception e)
        {
            errorLabel.setText("ERROR: Please select an Employee.");
            return;
        }

        addTicket(fromComboBox.getValue().toString(), toComboBox.getValue().toString(), eNameComboBox.getValue().toString(), ticketIDTextField.getText());
        changeScene("addMenu.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        for(BusStation bus: busStationList)
        {
            fromComboBox.getItems().add(bus.getStationName());
            toComboBox.getItems().add(bus.getStationName());
        }
        for(Employee emp: employeeList)
        {
            eNameComboBox.getItems().add(emp.getName());
        }
    }

    public void backButtonClick(MouseEvent event) throws IOException
    {
        changeScene("addMenu.fxml");
    }


}
