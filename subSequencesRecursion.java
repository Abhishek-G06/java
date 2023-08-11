import java.util.ArrayList;

public class subSequencesRecursion {
    public static void main(String[] args) {
        // subseq("", "abc");
        //System.out.println(subseq2("", "abc")); 
        //subseqAscii("", "abc");
    }
    static void subseq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    // Making a list 

    static ArrayList<String> subseq2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> l = subseq2(p+ch, up.substring(1));
        ArrayList<String> r =  subseq2(p, up.substring(1));

        l.addAll(r);
        return l;
    }

    // Returning ASCII Values 

    static void subseqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseqAscii(p+ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p+(ch+0), up.substring(1));
    }
}
