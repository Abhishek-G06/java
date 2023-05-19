package M5;
import  java.net.URL;

class main2{
    public static void main(String[] argv) throws Exception {
        URL url = new URL("jar:http://hostname/may.jar!/");
        System.out.println(" "+url);        
    }
}