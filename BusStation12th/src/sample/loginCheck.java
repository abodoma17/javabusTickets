package sample;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class loginCheck implements Runnable{

    Socket s;

    loginCheck(Socket s)
    {
        this.s=s;
    }

    @Override
    public void run()
    {
        try
        {
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            String username, password, out;

            username = dis.readUTF();
            password = dis.readUTF();

            if(username.equals("admin") && password.equals("admin"))
            {
                dos.writeUTF("YES");
            }
            else{
                    dos.writeUTF("NO");
            }

        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

    }
}
