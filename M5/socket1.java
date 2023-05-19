package M5;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class socket1 {
    public static void main(String args[]){
        try {
            Socket socket = new Socket("192.2.1.168", 23);
        } catch (UnknownHostException e) {
            System.out.println(e);
        } catch(IOException e2){
            System.out.println(e2);
        }
    }
}