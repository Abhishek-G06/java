import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] ch = word.toCharArray();
            Arrays.sort(ch);
            String sortedWord = new String(ch);

            List<String> anagramGroup = map.getOrDefault(sortedWord, new ArrayList<>());
            anagramGroup.add(word);
            map.put(sortedWord, anagramGroup);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        GroupAnagram groupanagram = new GroupAnagram();
        List<List<String>> res = groupanagram.groupAnagrams(strs);

        // Print the result
        for (List<String> group : res) {
            System.out.println(group);
        }
    }
}