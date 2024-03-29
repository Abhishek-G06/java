import java.util.ArrayList;

public class PermutationRecur {
    public static void main(String[] args) {
        System.out.println(permutation3("","abc"));
    }

    static void permutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i=0; i<= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            permutation(f+ch+s, up.substring(1));
        }
    }

    //  Printing in a list

    static ArrayList<String> permutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i<= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            ans.addAll(permutationList(f+ch+s, up.substring(1)));
        }

        return ans;
    }

    // Counting No. of permutations 
    static int permutation3(String p, String up){
        if(up.isEmpty()){
            // System.out.println(p);
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);

        for(int i=0; i<= p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            count += permutation3(f+ch+s, up.substring(1)) ;
        }
        return count;
    }
}
