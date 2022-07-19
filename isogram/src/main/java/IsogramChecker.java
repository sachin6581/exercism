import java.util.HashSet;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        Set<Character> charSet = new HashSet<>();
        for(int i = 0;i<phrase.length();i++){
            int preInsertionSize = charSet.size();
            charSet.add(Character.toLowerCase(phrase.charAt(i)));
            if(Character.isLetter(phrase.charAt(i))){
                if(preInsertionSize == charSet.size())
                    return false;
            }
        }
        return true;
    }

}
