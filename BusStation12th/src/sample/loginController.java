package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class loginController {
    public loginController()
    {

    }
    int serverPort = 3232;
    @FXML
    private Button loginButton;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label loginStatusLabel;

    public void LoginPressButton(ActionEvent event) throws IOException
    {
        Main m = new Main();

        try
        {
            Socket s = new Socket("localhost", serverPort);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutput dos = new DataOutputStream(s.getOutputStream());

            String in;

            dos.writeUTF(usernameField.getText());
            dos.writeUTF(passwordField.getText());

            in = dis.readUTF();

            if(in.equals("YES"))
            {
                m.changeScene("afterLogin.fxml");
            }
            else
            {
                loginStatusLabel.setText("Login Failed");
            }

        }
        catch(IOException e)
        {
            loginStatusLabel.setText("Server not active.");
        }

    }

}




