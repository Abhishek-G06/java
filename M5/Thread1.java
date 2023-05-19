package M5;

//import java.lang.*;

public class Thread1 implements Runnable{
    public static void main(String[] args){
       Thread1 obj = new Thread1();
       Thread t = new Thread(obj);
       t.start();
    }
    public void run(){
        System.out.println("Hello");
    }
}