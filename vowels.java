public class vowels {
    public static void main(String[] args) {
        String st1 = "helloworld";
        for (int i=0; i<st1.length(); i++){
            char ch = st1.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println(ch);
            }
        }
    }
}
