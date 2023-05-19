package codes;
import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class NewJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        p.setName(name);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        p.setAge(age);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
