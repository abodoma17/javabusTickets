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

public class displayCustomersController extends Main implements Initializable {
    public displayCustomersController(){}
    @FXML
    private ImageView backImage;
    @FXML
    private Button removeButton;
    @FXML
    private ListView<String> customerListView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(Customer cust: customerList)
        {
            customerListView.getItems().add(cust.toString());
        }
    }

    public void removeButtonClick(ActionEvent action) throws IOException {
        final int selectedIdx = customerListView.getSelectionModel().getSelectedIndex();
        removeCustomer(selectedIdx);
        customerFile();
        changeScene("displayCustomers.fxml");

    }

    public void backButtonClick(MouseEvent event) throws IOException
    {
        Main m = new Main();
        m.changeScene("displayMenu.fxml");
    }


}
