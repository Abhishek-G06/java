package codes;
interface A{
    void print();
}

public class iface implements A {
    public void print(){
        System.out.println("hello");
    }
    public static void main(String args[])
    {
        iface obj = new iface();
        obj.print();
    }
    
}