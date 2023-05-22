package M5;

import java.net.Socket;

public class socket2 {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("127.0.0.1", 0);
        System.out.println(s.getPort());
    }
}