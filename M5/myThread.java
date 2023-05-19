package M5;

//import java.lang.*;

public class myThread extends Thread{
    public static void main(String[] args){
       myThread obj = new myThread();
       obj.start();
    }
    public void run(){
        System.out.println("Hello");
    }
}