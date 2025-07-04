
import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find their LCM:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int maxnum = Math.max(a,b);
        int lcm = 0;
        while (true) {
            if (maxnum %a ==0 && maxnum %b ==0){
                lcm = maxnum;
                break;
            } else {
                maxnum += 1;
            }
            
        }
        System.out.println("lcm of number '" + a + "' and '" + b + "' is : " + lcm);
    }
}
