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

public class employeeAddController extends Main implements Initializable {
    public employeeAddController(){}
    @FXML
    private ImageView backImage;
    @FXML
    private Button employeeAddButton;
    @FXML
    private TextField employeeNameTextField;
    @FXML
    private TextField employeeAgeTextField;
    @FXML
    private TextField employeeIDTextField;
    @FXML
    private TextField employeePhoneTextField;
    @FXML
    private ComboBox<String> employeeBusStationComboBox;
    @FXML
    private Label errorLabel;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(BusStation bus: busStationList)
        {
            employeeBusStationComboBox.getItems().add(bus.getStationName());
        }
    }


    public void employeeAddButtonClick(ActionEvent action) throws IOException
    {
        int eAge, eID;

        try
        {
            eAge=Integer.parseInt(employeeAgeTextField.getText());
            eID=Integer.parseInt(employeeIDTextField.getText());
        }
        catch(Exception e)
        {
            errorLabel.setText("ERROR: ID and Age should be numbers.");
            return;
        }

        try
        {
            if(Integer.parseInt(employeeAgeTextField.getText())<0)
            {
                throw new IOException();
            }
        }
        catch(Exception e)
        {
            errorLabel.setText("ERROR: Age should be >0.");
            return;
        }

        addEmployee(employeeNameTextField.getText(), Integer.parseInt(employeeAgeTextField.getText()), employeePhoneTextField.getText(), Integer.parseInt(employeeIDTextField.getText()), employeeBusStationComboBox.getValue().toString());
        changeScene("afterLogin.fxml");
    }


    public void backButtonClick(MouseEvent event) throws IOException
    {
        Main m = new Main();
        m.changeScene("addMenu.fxml");
    }


}
