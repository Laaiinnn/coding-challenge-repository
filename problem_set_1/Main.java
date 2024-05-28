import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        if (words == null || words.length < 2) return result;


        Map<String, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            wordMap.put(words[i], i);
        }


        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            for (int j = 0; j <= currentWord.length(); j++) {

                String left = currentWord.substring(0, j);
                String right = currentWord.substring(j);


                if (isPalindrome(left)) {
                    String reversedRight = new StringBuilder(right).reverse().toString();
                    if (wordMap.containsKey(reversedRight) && wordMap.get(reversedRight) != i) {
                        List<Integer> pair = new ArrayList<>();
                        pair.add(wordMap.get(reversedRight));
                        pair.add(i);
                        result.add(pair);
                    }
                }


                if (j != currentWord.length() && isPalindrome(right)) {
                    String reversedLeft = new StringBuilder(left).reverse().toString();
                    if (wordMap.containsKey(reversedLeft) && wordMap.get(reversedLeft) != i) {
                        List<Integer> pair = new ArrayList<>();
                        pair.add(i);
                        pair.add(wordMap.get(reversedLeft));
                        result.add(pair);
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String[] inputWords = {"bat", "tab", "cat"};
        List<List<Integer>> result = palindromePairs(inputWords);
        System.out.println(result); 
    }
}