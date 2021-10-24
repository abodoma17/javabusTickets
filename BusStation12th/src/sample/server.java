package sample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class server {
    public static void main(String[] args)
    {
        //this is the port that the connection will be opened on
        int serverPort = 3232;
        //this thread pool will create as many threads as needed, as it is dynamic.
        ExecutorService executor = Executors.newCachedThreadPool();
        try
        {
            //We use the port that we have above
            ServerSocket ss = new ServerSocket(serverPort);
            System.out.println("Waiting for connections: ");

            while(true)
            {
                Socket s = ss.accept();
                System.out.println("Connected.");

                executor.execute(new loginCheck(s));
            }

        }
        catch(IOException e)
        {

        }
    }
}
