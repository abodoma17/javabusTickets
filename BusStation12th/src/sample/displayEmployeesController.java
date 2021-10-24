package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class displayEmployeesController extends Main implements Initializable {
    @FXML
    private ImageView backImage;
    @FXML
    private Button removeButton;
    @FXML
    private ListView<String> employeeListView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(Employee emp: employeeList)
        {
            employeeListView.getItems().add(emp.toString());
        }
    }

    public void removeButtonClick(ActionEvent action) throws IOException {
        final int selectedIdx = employeeListView.getSelectionModel().getSelectedIndex();
        removeEmployee(selectedIdx);
        employeeFile();
        changeScene("displayEmployees.fxml");

    }

    public void backButtonClick(MouseEvent event) throws IOException
    {
        Main m = new Main();
        m.changeScene("displayMenu.fxml");
    }
}
