public class subString {
    public static void main(String[] args) {
        String st = "Hello";
        for(int i =0;i<st.length();i++){
            for(int j=i+1;j<=st.length();j++){
                System.out.println(st.substring(i,j));
            }
        }
    }  
}
