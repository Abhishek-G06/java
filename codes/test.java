package codes;
class GParent{
    void House(){
        System.out.println("yo");
    }
}
class Parent extends GParent{
    void Car(){
        System.out.println("BMW");
    }
}
class Child extends Parent{
    void Cycle(){
        System.out.println("Hero Cycle");
    }
}
class test {
    public static void main(String[] args){
        Child obj = new Child();
        obj.Car();
        obj.Cycle();
        obj.House();
    }
}
