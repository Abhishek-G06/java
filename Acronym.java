import java.util.ArrayList;
import java.util.List;

class Acronym {
    public static boolean isAcronym(List<String> words, String s) {
        
        int j = 0 , len = s.length();
        for(String str : words)
            if(j >= len || s.charAt(j++) != str.charAt(0)) 
                return false;
        return j == len;       
    }
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        words.add("Test");
    
        String acronym = "HWT";
    
        boolean result = Acronym.isAcronym(words, acronym);
    
        if (result) {
            System.out.println("The list of words forms the acronym: " + acronym);
        } else {
            System.out.println("The list of words does not form the acronym: " + acronym);
        }
    }
}