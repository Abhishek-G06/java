import java.util.ArrayList;

public class diceThrow {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(dice2("", 4, list));
    }
    public static void dice(String p , int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i, target-i);
        }
    }

    public static ArrayList<String> dice2(String p , int target, ArrayList<String> list){
        if(target == 0){
            list.add(p);
            return list;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice2(p+i, target-i,list);
        }
        return list;
    }
}
