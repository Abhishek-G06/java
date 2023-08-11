import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        // List<List<Integer>> ans = subset(arr);
        // for(List<Integer> : ans){
        //    System.out.println(list);
        // }
        System.out.println(subset(arr));
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> out = new ArrayList<>();

        out.add(new ArrayList<>());

        for (int n : arr) {
            int s = out.size();

            for (int i = 0; i < s; i++) {
                List<Integer> in = new ArrayList<>(out.get(i));
                in.add(n);
                out.add(in);
            }
        }

        return out;
    }

}