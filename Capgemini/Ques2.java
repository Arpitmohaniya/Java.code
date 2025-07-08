import java.util.HashMap;
import java.util.Set;

public class Ques2 {
    public static void main(String[] args) {
        String s = "abcdab";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (map.containsKey(ch)== true){
                map.put(ch, map.get(ch) +1);
            }else{
                map.put(ch,1);
            }
        } 
        Set<Character> count = map.keySet();
        for (Character ch : count) {
            System.out.println(ch + " : " + map.get(ch));
        }
    }
}