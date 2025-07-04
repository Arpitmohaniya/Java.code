public class reverse_string {
    public static void main(String[] args) {
        String st = "HelloWorld";
        for (int i = st.length() - 1; i >= 0; i--) {
            char ch = st.charAt(i);
            System.out.print(ch);
        }
    }
}
