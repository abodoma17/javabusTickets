package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.io.IOException;

public class addMenuController{
    public addMenuController(){}
    @FXML
    private ImageView backImage;
    @FXML
    private Button busStationAddButton;
    @FXML
    private Button employeeAddButton;
    @FXML
    private Button customerAddButton;
    @FXML
    private Button ticketAddButton;

    public void ticketAddButtonClick(ActionEvent action) throws IOException
    {
        Main m = new Main();
        m.changeScene("ticketCreate.fxml");
    }

    public void customerAddButtonClick(ActionEvent action) throws IOException
    {
        Main m = new Main();
        m.changeScene("customerAdd.fxml");
    }

    public void backButtonClick(MouseEvent event) throws IOException
    {
        Main m = new Main();
        m.changeScene("afterLogin.fxml");
    }

    public void busStationButtonClick(ActionEvent event) throws IOException
    {
        Main m = new Main();
       m.changeScene("busStationAdd.fxml");
    }

    public void employeeAddButtonClick(ActionEvent event) throws IOException
    {
        Main m = new Main();
        m.changeScene("employeeAdd.fxml");
    }



}
