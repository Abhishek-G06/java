import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subsetduplicate(arr));
        
     }
    static List<List<Integer>> subsetduplicate(int[] arr){
        Arrays.sort(arr);

        List<List<Integer>> out = new ArrayList<>();
        out.add(new ArrayList<>());

        int start, end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;

            if(i > 0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = out.size()-1;
            
            int s = out.size();

            for (int j = start; j < s; j++) {
                List<Integer> in = new ArrayList<>(out.get(j));
                in.add(arr[i]);
                out.add(in);
            }
        }

        return out;
    }
}
