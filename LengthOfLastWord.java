

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = " hello world ";
        int length = 0;
        s = s.trim();
        for(int i=s.length()-1;i>=0;i--){
            if (s.charAt(i)==' '){
                break;
            }
            length++;
        }
        System.out.println(length);
    }
}
