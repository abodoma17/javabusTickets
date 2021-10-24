package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class customerAddController extends Main
{
    public customerAddController(){}
    @FXML
    private ImageView backImage;
    private Button customerAddButton;
    @FXML
    private TextField customerNameTextField;
    @FXML
    private TextField customerAgeTextField;
    @FXML
    private TextField customerIDTextField;
    @FXML
    private TextField customerPhoneTextField;
    @FXML
    private Label errorLabel;

    public void customerAddButtonClick(ActionEvent action) throws IOException
    {
        int cAge;

        //check if age is not a number and display error
        try
        {
            cAge=Integer.parseInt(customerAgeTextField.getText());
        }
        catch(Exception e)
        {
            errorLabel.setText("ERROR: Age should be a number.");
            return;
        }


        //check if age is less than 0
        try
        {
            cAge=Integer.parseInt(customerAgeTextField.getText());
            if(cAge<0)
            {
                throw new IOException();
            }
        }
        catch(Exception e)
        {
            errorLabel.setText("ERROR: Age should be >0.");
            return;
        }

        //using the addCustomer method in main and the parameters sent are the input that the user entered in textfield
        addCustomer(customerNameTextField.getText(), Integer.parseInt(customerAgeTextField.getText()), customerPhoneTextField.getText(), customerIDTextField.getText());
        changeScene("afterLogin.fxml");
    }

    public void backButtonClick(MouseEvent event) throws IOException
    {
        Main m = new Main();
        m.changeScene("addMenu.fxml");
    }

}
