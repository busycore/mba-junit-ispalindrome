package Services;

import java.util.ArrayList;
import java.util.List;

public class IsPalindromeService {

    public boolean isPalindrome(String word){
        String NormalizedWord = word.trim()
                .replaceAll(" ","")
                .replaceAll("(\\’|\\.|\\/|\\\\|\\!|\\'|\\?|\\*|\\`|\\´|\\{|\\}|\\[|\\]|\\||\\-|\\+|\\=|\\(|\\)|\\%|\\$|\\#|\\@|\\,|\\;|\\:|\\>|\\<)","")
                .toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (int i = NormalizedWord.length(); i > 0; i--) {
            sb.append(NormalizedWord.charAt(i-1));
        }

        return sb.toString().equals(NormalizedWord);
    }

}
